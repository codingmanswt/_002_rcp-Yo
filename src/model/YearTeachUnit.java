/**  
* Title: YearTeachUnit.java
* Description:   
* Copyright: Copyright (c) 2019  
* Company: 三诶（山东）信息技术有限公司  
* @author liuXingjun
* @date 2019年7月14日 下午4:37:48 
* @version 1.0  
* @History：
*/
package model;

import java.math.BigDecimal;

import rcpyo.ui.TeachUnitName;

public class YearTeachUnit {

	private int id;

	private int nian;

	private String unitid;

	// 是否有专业课
	private String haszyk;

	// 是否有公共课
	private String hasggk;

	// 生师比
	private int ssb;

	// 学费应收金额
	private BigDecimal jfys;

	// 学费实收金额
	private BigDecimal jfss;

	// 教学业务费比率
	private BigDecimal jxywper;

	// 教学管理费比率
	private BigDecimal jxglper;

	// 教学研究费比率
	private BigDecimal jxyjper;

	// 师资培养费比率
	private BigDecimal szpyper;
	// 教授A等人数
	private int ta1;

	// 教授B等人数
	private int ta2;

	// 教授C等人数
	private int ta3;

	// 教授D等人数
	private int ta4;

	// 副教授A等人数
	private int ta5;

	// 副教授B等人数
	private int ta6;

	// 讲师人数
	private int ta7;

	// 助教人数
	private int ta8;

	private TeachUnit teachunit;

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:44:06
	 * @version V0.0.1
	 */
	public TeachUnit getTeachunit() {
		return teachunit;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:44:06
	 * @version V0.0.1
	 */
	public void setTechunit(TeachUnit techunit) {
		this.teachunit = techunit;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1 id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1 id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getNian() {
		return nian;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setNian(int nian) {
		this.nian = nian;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public String getUnitid() {
		return unitid;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public String getHaszyk() {
		return haszyk;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setHaszyk(String haszyk) {
		this.haszyk = haszyk;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public String getHasggk() {
		return hasggk;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setHasggk(String hasggk) {
		this.hasggk = hasggk;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getSsb() {
		return ssb;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setSsb(int ssb) {
		this.ssb = ssb;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getJfys() {
		return jfys;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setJfys(BigDecimal jfys) {
		this.jfys = jfys;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getJfss() {
		return jfss;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setJfss(BigDecimal jfss) {
		this.jfss = jfss;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getJxywper() {
		return jxywper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setJxywper(BigDecimal jxywper) {
		this.jxywper = jxywper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getJxglper() {
		return jxglper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setJxglper(BigDecimal jxglper) {
		this.jxglper = jxglper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getJxyjper() {
		return jxyjper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setJxyjper(BigDecimal jxyjper) {
		this.jxyjper = jxyjper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public BigDecimal getSzpyper() {
		return szpyper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setSzpyper(BigDecimal szpyper) {
		this.szpyper = szpyper;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa1() {
		return ta1;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa1(int ta1) {
		this.ta1 = ta1;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa2() {
		return ta2;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa2(int ta2) {
		this.ta2 = ta2;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa3() {
		return ta3;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa3(int ta3) {
		this.ta3 = ta3;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa4() {
		return ta4;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa4(int ta4) {
		this.ta4 = ta4;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa5() {
		return ta5;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa5(int ta5) {
		this.ta5 = ta5;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa6() {
		return ta6;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa6(int ta6) {
		this.ta6 = ta6;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa7() {
		return ta7;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa7(int ta7) {
		this.ta7 = ta7;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public int getTa8() {
		return ta8;
	}

	/**
	 * @author liuXingjun
	 * @date 2019年7月14日 下午4:43:30
	 * @version V0.0.1
	 */
	public void setTa8(int ta8) {
		this.ta8 = ta8;
	}

}
