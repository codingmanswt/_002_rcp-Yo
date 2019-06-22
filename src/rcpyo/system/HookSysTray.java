
package rcpyo.system;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import constant.Constantss;
import rcpyo.actions.LogoutOffActions;

/**  
* @author codingManLiu
* @date 2019年6月22日 下午2:07:42
* @version V0.0.1  
* @Description: 系统托盘处理类
* @History:
 */
public class HookSysTray {
	
	private TrayItem trayItem;
	private Image trayImage;
	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:07:42
	* @version V0.0.1  
	* @param shell    参数
	* @return void    返回类型
	* @Description: 用户单击窗口的最小化按钮时的处理
	 */  
	public void windowMinimized(final Shell shell) {
		shell.setMinimized(true);
		shell.setVisible(false);
	}
	


	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:12:05
	* @version V0.0.1  
	* @param window    参数
	* @return void    返回类型
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	public void createSysTray(final IWorkbenchWindow window) {
		trayItem = initTrayItem(window);
		if (trayItem != null) {
			 /*最小化到系统托盘*/
			trayPopMenu(window);
			/*自动弹出系统托盘*/
			trayMinimize(window);
		}

	}
	
	
	/**
	* @author codingManLiu
	* @date 2019年6月22日 下午2:13:51
	* @version V0.0.1  
	* @param window    参数
	* @return void    返回类型
	* @Description:  最小化到系统托盘
	 */
	private void trayMinimize(final IWorkbenchWindow window) {
		window.getShell().addShellListener(new ShellAdapter() {

			/**  
			* @Description: 用户执行窗口最小化时执行的动作
			*/  
			@Override
			public void shellIconified(ShellEvent e) {
//				super.shellIconified(e);
				window.getShell().setVisible(false);
				
			}		
		});
		
		/**
		 * 功能：用户单击托盘图标时程序主窗口可见并恢复为正常的大小
		 */
		trayItem.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
					Shell shell = window.getShell();
					if (!shell.isVisible()) {
						shell.setVisible(true);
						window.getShell().setMinimized(false);
					}
			}
		});
	}


	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:14:28
	* @version V0.0.1  
	* @param window    参数
	* @return void    返回类型
	* @Description: 自动弹出系统托盘
	 */  
	private void trayPopMenu(final IWorkbenchWindow window) {
		trayItem.addListener(SWT.MenuDetect, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				//创建菜单
				MenuManager menuManager = new MenuManager();
				Menu trayContextMenu = menuManager.createContextMenu(window.getShell());
				fillTrayItem(menuManager,window);
				trayContextMenu.setVisible(true);
			}
		});
	}


	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:36:22
	* @version V0.0.1  
	* @param menuManager
	* @param window    参数
	* @return void    返回类型
	* @Description: 为托盘增加菜单
	 */  
	protected void fillTrayItem(MenuManager menuManager, final IWorkbenchWindow window) {
		//创建退出系统菜单
		Action exitSystemAction = new Action("退出系统[&E]",AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.HISTORY_DATA_ICON_PATH)) {
 
			@Override
			public void run() {
				PlatformUI.getWorkbench().close();
			}
			
		};
		menuManager.add(new LogoutOffActions());
		menuManager.add(exitSystemAction);
		
	}
	
	



	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:14:39
	* @version V0.0.1  
	* @param window
	* @return    参数
	* @return TrayItem    返回类型
	* @Description: 初始化系统托盘的图标和文字
	 */  
	private TrayItem initTrayItem(IWorkbenchWindow window) {
		/*获得系统托盘项*/
		final Tray systemTray = window.getShell().getDisplay().getSystemTray();
		if (systemTray == null ) {
			return null;
		}
		TrayItem trayItemLocal = new TrayItem(systemTray, SWT.NONE);
		Image trayImage = AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.SYS_TRAY_ICON_PATH).createImage();
		/*设置系统托盘的图像*/
		trayItemLocal.setImage(trayImage);
		return trayItemLocal;
		
	}
	

	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午2:15:05
	* @version V0.0.1      
	* @return void    返回类型
	* @Description:  释放系统托盘的资源
	 */  
	public void Dispose() {
		if (trayItem != null)
			trayItem.dispose();
		
		if (trayImage != null) {
			trayImage.dispose();
		}
	}
	
}
