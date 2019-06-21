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
         * true����Ĭ��ֵ��Ӧ�ó���ÿ���˳�ʱ�����洰�ڵ�״̬��
         * false�������洰�ڵ�״̬���ṩ����������ٶ�
         * �޸ĸ÷���������Ϊfalse��
         */
        configurer.setSaveAndRestore(false);
        
        /**
         * Author:liuxingjun
         * Date:20190621
         * Version:V0.0.1
         * ���ô��ڵı�����Ϊ�����εı�����
         * �����⡿Ŀǰ��û�п���Ч�������Խ���֮���ټ�¼
         */
        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        /**
         * ����ÿ��������ʱ����ʾ��ӭ����
         * ��Ĭ��ֵ��true
         */
//        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_INTRO, true);
        /**
         * ����ÿ��������ʱ����ʾ������
         */
        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_PROGRESS_ON_STARTUP, true);
        
        
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
