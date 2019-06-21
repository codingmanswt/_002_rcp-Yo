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
 */
public class LogoutOffActions extends Action {

	public LogoutOffActions() {
		setId("rcpyo.src.rcpyo.actions.logoutoffactions");
		setText("用户注销[&R]");
		setToolTipText("用户注销");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Constantss.APPLICATON_ID, Constantss.DATA_ICON_PATH));
	}

	@Override
	public void run() {
		super.run();
	}
	
	
	
	
	

}
