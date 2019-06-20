package rcpyo.intro;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import constant.Constantss;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        /**
         * 设置窗口的大小：1920*1080
         */
        configurer.setInitialSize(new Point(Constantss.MainWindowSize.MAIN_WINDOW_WIDTH_SIZE.getValue(), Constantss.MainWindowSize.MAIN_WINDOW_HEIGHT_SIZE.getValue()));
        /**
         * 暂时不显示工具栏
         */
        configurer.setShowCoolBar(false);
        /**
         * 显示状态栏
         */
        configurer.setShowStatusLine(true);
        
        /**
         * 窗口只显示关闭按钮
         */
        configurer.setShellStyle(SWT.MIN | SWT.CLOSE);
        /**
         * 主窗口标题
         */
        configurer.setTitle("YoYo");
    }
}
