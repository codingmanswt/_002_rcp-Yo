package rcpyo.intro;

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
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
