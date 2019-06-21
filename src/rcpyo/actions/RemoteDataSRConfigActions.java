package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import constant.Constantss;

public class RemoteDataSRConfigActions extends Action {

	public RemoteDataSRConfigActions() {
		setId("rcpYo.src.rcpyo.actions.remotedatasourceconfig");
		setText("数据源配置");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.REMOTE_DATA_SRCONFIG_ICON_PATH));
	}

	public void run() {
	}
}