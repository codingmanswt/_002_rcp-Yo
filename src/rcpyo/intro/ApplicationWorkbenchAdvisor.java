package rcpyo.intro;

import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "rcpYo.perspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }
    
    public void initialize(IWorkbenchConfigurer configurer) {
        super.initialize(configurer);
        /**
         * Author:liuxingjun
         * Date:20190620
         * Version:V0.0.1
         * true：【默认值】应用程序每次退出时将保存窗口的状态；
         * false：不保存窗口的状态，提供程序的启动速度
         * 修改该方法，设置为false；
         */
        configurer.setSaveAndRestore(false);
        
        /**
         * Author:liuxingjun
         * Date:20190621
         * Version:V0.0.1
         * 设置窗口的标题栏为弧线形的标题栏
         * 【问题】目前还没有看到效果，测试结束之后再记录
         */
        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        /**
         * 设置每次启动的时候显示欢迎界面
         * 【默认值】true
         */
//        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_INTRO, true);
        /**
         * 设置每次启动的时候显示进度条
         */
        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_PROGRESS_ON_STARTUP, true);
        
        
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
