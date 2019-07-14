/**  
* Title: TeachUnitNameContentProvider.java
* Description:   
* Copyright: Copyright (c) 2019  
* Company: 三诶（山东）信息技术有限公司  
* @author liuXingjun
* @date 2019年6月30日 下午4:56:56 
* @version 1.0  
* @History：
*/  
package rcpyo.ui;


import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;


public class TeachUnitNameContentProvider implements IStructuredContentProvider {

	/**  
	* @author liuXingjun
	* @date 2019年6月30日 下午4:57:50
	* @version 1.0  
	* @param @param inputElement
	* @param @return    参数
	* @Description: 根据tableViewer的setInput方法提供的数据返回对应的元素并显示在tableViewer上。
	 */  
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List<?>)inputElement).toArray();
		}
		return new Object[0];
	}

}
