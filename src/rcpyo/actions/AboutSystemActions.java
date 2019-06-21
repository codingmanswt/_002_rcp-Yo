package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import constant.Constantss;

public class AboutSystemActions extends Action{

	public AboutSystemActions() {
		setId("rcpyo.src.rcpyo.actions.aboutsystem");
		setText("关于软件@ALT+A");
		setToolTipText("关于软件");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.DATA_ICON_PATH));
	}

	@Override
	public void run() {
		super.run();
	}
	
	
	
	

}
