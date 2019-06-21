package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import constant.Constantss;

public class HistoryDataActions extends Action {

	public HistoryDataActions() {
		setId("rcpyo.src.rcpyo.actions.historyData");
		setText("历史数据@ALT+O");
		setToolTipText("历史数据");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.HISTORY_DATA_ICON_PATH));
	}

	public void run() {
	}

}
