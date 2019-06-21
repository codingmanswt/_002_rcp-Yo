/**
 * Author:liuxingjun
 * Date:2019年6月21日
 */
package rcpyo.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import constant.Constantss;

/**
 * @author AAA
 * 
 *
 */
public class DataBakActions  extends Action{

	public DataBakActions() {
		setId("dataBak");
		setText("数据备份@ALT+D");
		setToolTipText("数据备份");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.DATA_ICON_PATH));
	}

	@Override
	public void run() {
		super.run();
	}
	
	
	
	

	
	
	

}
