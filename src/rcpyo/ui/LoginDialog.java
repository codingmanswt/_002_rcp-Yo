/**  
* Title: LoginDiaglog.java
* Copyright: Copyright (c) 2019 济南鲁科安全设备有限公司
* @author codingManLiu
* @date 2019年6月23日 下午2:49:25 
* @version 1.0  
* @Description:用户名密码登录验证界面
* @History： 
*/  
package rcpyo.ui;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import constant.Constantss;
import rcpyo.utils.CacheImage;


/**
 * @author xingjun
 *
 */
public class LoginDialog extends Dialog{

	private Text userNameText;
	private Text passwordText;
	private MessageBox messageBox;

	/**  
	* @author codingManLiu
	* @date 2019年6月23日 下午2:51:49
	* @version 1.0  
	* @param @param parentShell    参数
	* @Description: 创建对话框的内容
	* 
	 */  
	public  LoginDialog(Shell parentShell) {
		super(parentShell);
	}
	
	protected Control createDialogArea(Composite parent){
		Composite container = (Composite)super.createDialogArea(parent);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginRight = 6;
		container.setLayout(gridLayout);
		
		final CLabel cLabel = new CLabel(container, SWT.NONE);
		cLabel.setText("用户名");
		cLabel.setImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.DATA_ICON_PATH));
		userNameText = new Text(container, SWT.BORDER);
		userNameText.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false));
		
		
		CLabel cLabel2 = new CLabel(container, SWT.NONE);
		cLabel2.setText(" 密码");
		cLabel2.setImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.HISTORY_DATA_ICON_PATH));
		passwordText = new Text(container, SWT.BORDER);
		passwordText.setEchoChar('*');
		passwordText.setLayoutData( new GridData(GridData.FILL,GridData.CENTER,true,false));
		
		return container;

	}
	
	
	/**  
	* @author codingManLiu
	* @date 2019年6月23日 下午3:16:25
	* @version 1.0  
	* @param @param parentComposite    参数
	* @return void    返回类型
	* @Description: 创建登录按钮和
	* 
	 */  
	protected void createButtonForButtonBar(final Composite parentComposite) {
		createButton(parentComposite, IDialogConstants.OK_ID, "登录", true);
		createButton(parentComposite, IDialogConstants.CANCEL_ID, "退出",false);
	}
	
	protected void okPressed() {
		String userName = userNameText.getText();
		String password = passwordText.getText();
		/*判断用户名为空*/
		if (userName == null || userName.trim().length() == 0) {
			messageBox = new MessageBox(getShell(),SWT.ICON_ERROR|SWT.OK);
			messageBox.setText("提示");
			messageBox.setMessage("用户名不能为空！");
			messageBox.open();
			userNameText.setFocus();
			return;
			
		}
		
		/*判断密码为空*/
		if (password ==null || password.trim().length() == 0) {
			messageBox = new MessageBox(getShell(),SWT.ICON_ERROR|SWT.OK);
			messageBox.setText("提示");
			messageBox.setMessage("密码不能为空！");
			messageBox.open();
			userNameText.setFocus();
			return;
		}
		
		super.okPressed();
		
	}
	
	/**  
	* @author codingManLiu
	* @date 2019年6月23日 下午3:35:12
	* @version 1.0  
	* @param @return    参数
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* 
	 */  
	/**  
	* @author codingManLiu
	* @date 2019年6月23日 下午3:35:12
	* @version 1.0  
	* @param 
	* @return    参数
	* @Description: 设置对话框初始大小 
	* 
	 */  
	protected Point getInitialSize() {
		return new Point(230,150);
	}

	/**  
	* @author codingManLiu
	* @date 2019年6月23日 下午3:39:01
	* @version 1.0  
	* @param @param newShell    参数
	* @Description: 设置对话窗口标题和图标
	 */  
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("用户身份验证");
		newShell.setImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.PUBLIC_DATA_ICON_PATH));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
