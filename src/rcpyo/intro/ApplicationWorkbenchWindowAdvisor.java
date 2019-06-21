package rcpyo.intro;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
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
         * ���ô��ڵĴ�С��1920*1080
         */
        configurer.setInitialSize(new Point(Constantss.MainWindowSize.MAIN_WINDOW_WIDTH_SIZE.getValue(), Constantss.MainWindowSize.MAIN_WINDOW_HEIGHT_SIZE.getValue()));
        /**
         * ��ʱ����ʾ������
         */
        configurer.setShowCoolBar(false);
        /**
         * ��ʾ״̬��
         */
        configurer.setShowStatusLine(true);
        
        /**
         * ����ֻ��ʾ�رհ�ť
         */
        configurer.setShellStyle(SWT.MIN | SWT.CLOSE);
        /**
         * �����ڱ���
         */
//        configurer.setTitle("YoYo");
        configurer.setTitle("����һֻ����������С�ɰ�...");
    }

    /**
     * ���ܣ������ڴ�֮��ű�����
     * 			��������ע�ᴰ�ڼ�����
     */
	@Override
	public void postWindowOpen() {
//		super.postWindowOpen();
		/**
		 * �����������Զ�����
		 */
		Shell shell = getWindowConfigurer().getWindow().getShell();
		Rectangle clientAreaSize = Display.getDefault().getClientArea();
		Rectangle frameSize = shell.getBounds();
		shell.setLocation((clientAreaSize.width - frameSize.width) / 2,(clientAreaSize.height - frameSize.height) / 2);
	}
    
    
    
    
}
