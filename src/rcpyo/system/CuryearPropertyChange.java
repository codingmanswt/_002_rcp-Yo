/**  
* Title: CuryearPropertyChange.java
* Description:   创建属性提供类
* Copyright: Copyright (c) 2019  
* Company: 三诶（山东）信息技术有限公司  
* @author liuXingjun
* @date 2019年6月30日 下午3:51:43 
* @version 1.0  
* @History：
*/  
package rcpyo.system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;


/**
 * @author xingJun
 *
 */
public class CuryearPropertyChange {
	private static final CuryearPropertyChange INSTANCE = new CuryearPropertyChange();
	/*保存监听事件的哈希表*/
	private static final Map<String, IPropertyChangeListener> map = new HashMap<String,IPropertyChangeListener>();
	
	public static CuryearPropertyChange getInstance() {
		return INSTANCE;
	}
	
	//激发属性改变监听事件
	public void firePropertyChangeListener() {
	  final Iterator<String> iterator = map.keySet().iterator();
	  while (iterator.hasNext()) {
		  map.get(iterator.next()).propertyChange(new PropertyChangeEvent(this, "curYear", null, YearManager.getInstance().getCurYear()));
		  
	  }
	}
	
	//注册属性改变监听器
	public void addPropertyChangeListener(final String listenerID,final IPropertyChangeListener listener) {
		if (!map.containsKey(listenerID)) {
			/*将监听事件加入到map中*/
			map.put(listenerID, listener);
		}
	}
	
	//注销属性改变监听器
	public void removePropertyChangeListener(final String listenerID) {
		if (map.containsKey(listenerID)) {
			map.remove(listenerID);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
