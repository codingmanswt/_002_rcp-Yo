package rcpyo.intro;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import rcpyo.actions.AboutSystemActions;
import rcpyo.actions.DataBakActions;
import rcpyo.actions.HistoryDataActions;
import rcpyo.actions.LogoutOffActions;
import rcpyo.actions.PublicDataActions;
import rcpyo.actions.RemoteDataSRConfigActions;
import rcpyo.actions.StatusBarContribution;
import rcpyo.actions.TeachUnitDataActions;

import org.eclipse.ui.IWorkbenchWindow;

/**
 * 菜单、工具栏、状态栏
 * 
 * @author AAA
 *
 */

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction welcomAction;
	private IWorkbenchAction helpInfoAction;

	private AboutSystemActions aboutSystemActions;
	private DataBakActions dataBakActions;
	private LogoutOffActions logoutOffActions;
	private TeachUnitDataActions teachUnitData;
	private HistoryDataActions historyData;
	private RemoteDataSRConfigActions remoteDataSRConfig;
	private PublicDataActions publicDataActions;
	private StatusBarContribution statusBarContribution;
	
	
	String message = "登录用户：admin  身份：普通用户";


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
		welcomAction.setAccelerator(SWT.ALT + 87);
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
		
		teachUnitData = new TeachUnitDataActions();
		register(teachUnitData);
		
		historyData = new HistoryDataActions();
		register(historyData);
		
		
		remoteDataSRConfig = new RemoteDataSRConfigActions();
		register(remoteDataSRConfig);
		
		publicDataActions = new PublicDataActions();
		register(publicDataActions);
		
		
		/**
		 * 显示临时状态栏的信息
		 */
		statusBarContribution = new StatusBarContribution(message);
		statusBarContribution.setVisible(true);
				


	}

	/**
	 * 生成菜单
	 */
	protected void fillMenuBar(IMenuManager menuBar) {

		/**
		 * 系统帮助菜单，包括下面的三个菜单 |-----welcomAction |-----helpInfoAction
		 */
		MenuManager helpMenu = new MenuManager("帮助[&H]", "helpManagMenu");
		menuBar.add(helpMenu);
		helpMenu.add(welcomAction);
		helpMenu.add(helpInfoAction);

		/**
		 * 基础数据菜单 |-----用户注销
		 */
		MenuManager baseDataMenuManager = new MenuManager("基础数据[&B]", "baseDataMenu");
		menuBar.add(baseDataMenuManager);
		baseDataMenuManager.add(logoutOffActions);

		/**
		 * 系统管理菜单 |-----关于软件
		 */
		MenuManager sysMenuManager = new MenuManager("系统管理[&M]", "systemManagMenu");
		menuBar.add(sysMenuManager);
		sysMenuManager.add(aboutSystemActions);
		
	
	}

	/**
	 * 添加工具栏
	 * 【注意】修改 ApplicationWorkbenchAdvisor类中的
	 *              configurer.setShowCoolBar(true);值为true；
	 */
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
//		super.fillCoolBar(coolBar);
		/**
		 * SWT.FLAT：将工具栏设置成平滑方式
		 * SWT.SWT.SHADOW_OUT：将工具栏和菜单之间加一条分割线
		 */
		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT | SWT.SHADOW_OUT);
		coolBar.add(toolBarManager);
		
		toolBarManager.add(teachUnitData);
		toolBarManager.add(historyData);
		/*增加一条分割线，画面效果上表现为一条竖直的分割线*/
		toolBarManager.add(new Separator());
		toolBarManager.add(remoteDataSRConfig);
		toolBarManager.add(publicDataActions);
		
		
		
	}

	/**  
	* @Description: 临时状态栏的信息显示
	 */  
	@Override
	protected void fillStatusLine(IStatusLineManager statusLine) {
		statusLine.add(statusBarContribution);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
