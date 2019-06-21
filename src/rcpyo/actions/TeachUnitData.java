package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import constant.Constantss;


public class TeachUnitData extends Action {

	public TeachUnitData() {
		setId("rcpYo.src.rcpyo.actions.teachUnitData");
		setText("教学单位情况@ALT+T");
		setToolTipText("教学单位情况");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID,Constantss.TEACH_UNIT_DATA_ICON_PATH));
	}

	public void run() {
	}
}
