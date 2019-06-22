/**  
* Title: CacheImage.java  
* Copyright: Copyright (c) 2019  济南鲁科安全设备有限公司 
* @author codingManLiu
* @date 2019年6月22日 下午4:01:13 
* @version 1.0  
* @Description 图片缓存类
* @History：
*/  
package rcpyo.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author AAA
 *
 */
public class CacheImage {
	
	 private final Map<String, Image > imageMap  = new HashMap<String,Image>();
	 private static CacheImage INSTANCE = new CacheImage();
	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午5:02:12
	* @version 1.0  
	* @param 
	* @Description: 空构造方法
	* 
	 */  
	public CacheImage() {
	}
	
	//采用单例模式
	public static CacheImage getInstance() {
		return INSTANCE;
	}
	
	
	/**  
	* @author codingManLiu
	* @date 2019年6月22日 下午5:07:53
	* @version V0.0.1  
	* @param applicationID
	* @param imageName
	* @return    参数
	* @return Image    返回类型
	* @Description: 获取图片
	 */  
	public Image getImage(String applicationID,String imageName) {
		if (imageName == null) {
			return null;
		}
		
		Image image = imageMap.get(imageName);
		if (image == null) {
			image = AbstractUIPlugin.imageDescriptorFromPlugin(applicationID, imageName).createImage();
			imageMap.put(imageName, image);
		}

		return image;
	}
	
	/**
	* @author codingManLiu
	* @date 2019年6月22日 下午5:11:28
	* @version V0.0.1      参数
	* @return void    返回类型
	* @Description:取出map中的数据，逐个释放
	 */
	public void dispose() {
		Iterator<Image> iterator = imageMap.values().iterator();
		while (iterator.hasNext()) {
			((Image)iterator.next()).dispose();
		}
		imageMap.clear();
	} 
	 
	 
	

}
