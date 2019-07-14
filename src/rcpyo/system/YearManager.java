/**  
* Title: YearManager.java
* Description: 年份管理类
* Copyright: Copyright (c) 2019
* Company: 济南鲁科安全设备有限公司
* @author codingManLiu
* @date 2019年6月30日 下午3:26:36 
* @version 1.0  
* @History：
*/  
package rcpyo.system;

import java.util.Calendar;

/**
 * @author xingJun
 *
 */
public class YearManager {
	private int maxYear;
	private int minYear;
	
	/*默认为电脑当前的的年份*/
	int curYear = Calendar.getInstance().get(Calendar.YEAR);
	
	private  static final YearManager INSTANCE = new YearManager();

	public static final YearManager getInstance() {
		return INSTANCE;
	}
	/**
	 * @return the maxYear
	 */
	public int getMaxYear() {
		return maxYear;
	}

	/**
	 * @param maxYear the maxYear to set
	 */
	public void setMaxYear(final int maxYear) {
		this.maxYear = maxYear;
	}

	/**
	 * @return the minYear
	 */
	public int getMinYear() {
		return minYear;
	}

	/**
	 * @param minYear the minYear to set
	 */
	public void setMinYear(final int minYear) {
		this.minYear = minYear;
	}

	/**
	 * @return the curYear
	 */
	public int getCurYear() {
		return curYear;
	}

	/**
	 * @param curYear the curYear to set
	 */
	public void setCurYear(final int curYear) {
		this.curYear = curYear;
	}

	/**  
	* @author liuXingjun
	* @date 2019年6月30日 下午3:32:20
	* @version 1.0  
	* @param     参数
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	private YearManager() {
		setMaxMinYear();
	}
	
	

	/**  
	* @author liuXingjun
	* @date 2019年6月30日 下午3:35:43
	* @version V0.0.1      
	* @return void   
	* @Description: 从数据库中查询并设置年份的最大最小值
	 */  
	private void setMaxMinYear() {
		/*此处使用的是假数据，本应该从数据库中将数据计算之后再赋值*/
		setMaxYear(2019);
		setMinYear(2010);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
