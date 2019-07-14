/**  
* Title: TeachUnitNameLabelProvider.java
* Description:   
* Copyright: Copyright (c) 2019  
* Company: 三诶（山东）信息技术有限公司  
* @author liuXingjun
* @date 2019年7月14日 下午3:47:30 
* @version 1.0  
* @History：
*/
package rcpyo.ui;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import constant.Constantss;
import model.YearTeachUnit;
import rcpyo.utils.CacheImage;

public class TeachUnitNameLabelProvider implements ITableLabelProvider {

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param @param listener 参数
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param 参数
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Override
	public void dispose() {

	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param @param element
	 * @param @param property
	 * @param @return 参数
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param @param listener 参数
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param @param element
	 * @param @param columnIndex
	 * @param @return 参数
	 * @Description: 1.设置TableView中的列的图像 2.根据是否有专业课和公共课决定是否添加图片；
	 */
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (element instanceof YearTeachUnit) {
			YearTeachUnit ytu = (YearTeachUnit) element;
			switch (columnIndex) {
			case 0:
				return CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.DATA_ICON_PATH);
//				break;
			case 1:
				/*根据是否有专业课选择图片的资源*/
				String haszyk = ytu.getHaszyk();
				return haszyk.equals("1")
						? CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.HISTORY_DATA_ICON_PATH)
						: null;

//				return  CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.HISTORY_DATA_ICON_PATH);
//				break;
			case 2:
				String hasggk = ytu.getHasggk();
//				return  CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.PUBLIC_DATA_ICON_PATH);
						return hasggk.equals("1")
								? CacheImage.getInstance().getImage(Constantss.APPLICATON_ID, Constantss.PUBLIC_DATA_ICON_PATH)
										: null;
			default:
				break;
			}
		}
		return null;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午3:48:44
	 * @version 1.0
	 * @param @param element
	 * @param @param columnIndex
	 * @param @return 参数
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof YearTeachUnit && columnIndex == 0) {
			YearTeachUnit ytu = (YearTeachUnit) element;
			return ytu.getTeachunit().getUnitname();
		}
		return null;
	}

}
