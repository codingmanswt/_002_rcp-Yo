/**  
* Title: YearCombo.java
* Description:  组合框控件，方便其他视图调用 
* Copyright: Copyright (c) 2019  
* Company: 三诶（山东）信息技术有限公司  
* @author liuXingjun
* @date 2019年7月14日 下午6:20:34 
* @version 1.0  
* @History：
*/  
package rcpyo.system;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class YearCombo extends ControlContribution{
	private Combo combo;
	private static YearCombo INSTANCE = new YearCombo("rcpyo.system.yearCombo");
	

	/**  
	 * @author codingManLiu
	 * @date 2019年7月14日 下午6:23:50
	 * @version 1.0  
	 * @param id
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	protected YearCombo(String id) {
		super(id);
	}

	public static YearCombo getINSTANCE() {
		return INSTANCE;
	}
	
	
	
	/**  
	* @author liuXingjun
	* @date 2019年7月14日 下午6:29:52
	* @version V0.0.1  
	*/
	public Combo getCombo() {
		return combo;
	}

	/**  
	* @author liuXingjun
	* @date 2019年7月14日 下午6:29:52
	* @version V0.0.1  
	*/
	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	/**  
	* @author liuXingjun
	* @date 2019年7月14日 下午6:22:55
	* @version 1.0  
	* @param parent
	* @return
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	@Override
	protected Control createControl(Composite parent) {
		return null;
	}

}
