/**  
* Title: StatusBarContribution.java
* Copyright: Copyright (c) 2019 济南鲁科安全设备有限公司
* @author codingManLiu
* @date 2019年6月22日 下午10:03:52 
* @version 1.0  
* @Description:
* @History： 
*/  
package rcpyo.actions;


import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.StatusLineLayoutData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import constant.Constantss;
import rcpyo.utils.CacheImage;

/**
 * @author AAA
 *
 */
public class StatusBarContribution extends ContributionItem{
	private String message;
	
	

	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午10:13:20
	* @version 1.0  
	* @param     参数
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* 
	 */  
	public StatusBarContribution() {
		super();
	}

	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午10:12:41
	* @version 1.0  
	* @param @param message    参数
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* 
	 */  
	public StatusBarContribution(String message) {
		this.message = message;
	}
	
	public void fill (Composite parent) {
		/*建立一条竖直的分割线*/
		Label separator = new Label(parent,SWT.SEPARATOR);
		//布局数据类
		StatusLineLayoutData layoutData = new StatusLineLayoutData();
		layoutData.heightHint = 20;
		separator.setLayoutData(layoutData);
		
		//显示文字信息的标签
		CLabel statusCLabel = new CLabel(parent, SWT.SHADOW_NONE);
		StatusLineLayoutData statusLineLayoutData = new  StatusLineLayoutData();
		statusLineLayoutData.widthHint = 315;
		statusCLabel.setLayoutData(statusLineLayoutData);
		statusCLabel.setText(message);
		statusCLabel.setImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID,Constantss.DATA_ICON_PATH));
		
	}

}
