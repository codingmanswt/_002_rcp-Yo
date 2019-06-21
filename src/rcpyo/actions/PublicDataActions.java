package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import constant.Constantss;

public class PublicDataActions extends Action {

	public PublicDataActions() {
		setId("rcpYo.src.rcpyo.actions.PublicData");
		setText("公共参数设置@ALT+P");
		setToolTipText("公共参数设置");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID,Constantss.PUBLIC_DATA_ICON_PATH));
	}

	public void run() {
	}
}
