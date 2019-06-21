package rcpyo.intro;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import rcpyo.actions.AboutSystemActions;
import rcpyo.actions.DataBakActions;
import rcpyo.actions.LogoutOffActions;

import org.eclipse.ui.IWorkbenchWindow;

/**
 * 菜单、工具栏、状态栏
 * @author AAA
 *
 */

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    private IWorkbenchAction welcomAction;
	private IWorkbenchAction helpInfoAction;
	
	private AboutSystemActions aboutSystemActions;
	private DataBakActions dataBakActions;
	private LogoutOffActions logoutOffActions;

    
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/**
	 * 菜单栏管理
	 */
	protected void makeActions(IWorkbenchWindow window) {
		/*欢迎界面*/
		welcomAction = ActionFactory.INTRO.create(window);
		welcomAction.setText("欢迎使用");
		welcomAction.setToolTipText("欢迎使用");
		/*设置快捷键为ALT+W*/
	    welcomAction.setAccelerator(SWT.ALT+87);
		register(welcomAction);
		
		/*系统帮助*/
		helpInfoAction = ActionFactory.HELP_CONTENTS.create(window);
		helpInfoAction.setText("系统帮助@ALT+H");
		helpInfoAction.setToolTipText("系统帮助");
		register(helpInfoAction);
		
		
		aboutSystemActions = new AboutSystemActions();
		register(aboutSystemActions);
		
		dataBakActions = new DataBakActions();
		register(dataBakActions);
		
		logoutOffActions = new LogoutOffActions();
		register(logoutOffActions);
		
	}

	/**
	 * 生成菜单
	 */
	protected void fillMenuBar(IMenuManager menuBar) {
		
		/**
		 * 系统帮助菜单，包括下面的三个菜单
		 * 			|-----welcomAction
		 * 			|-----helpInfoAction
		 */
		MenuManager helpMenu = new MenuManager("帮助[&H]", "helpManagMenu");
		menuBar.add(helpMenu);
		helpMenu.add(welcomAction);
		helpMenu.add(helpInfoAction);
		
		/**
		 * 基础数据菜单
		 * 			|-----用户注销 
		 */
		MenuManager baseDataMenuManager = new MenuManager("基础数据[&B]","baseDataMenu");
		menuBar.add(baseDataMenuManager);
		baseDataMenuManager.add(logoutOffActions);
		
		
		/**
		 * 系统管理菜单
		 * 			|-----关于软件
		 */
		MenuManager sysMenuManager = new MenuManager("系统管理[&M]","systemManagMenu");
		menuBar.add(sysMenuManager);
		sysMenuManager.add(aboutSystemActions);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
