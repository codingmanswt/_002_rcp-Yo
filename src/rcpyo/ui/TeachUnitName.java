package rcpyo.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.TableColumn;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.NewPropertySheetHandler;

import constant.Constantss;
import model.TeachUnit;
import model.YearTeachUnit;
import rcpyo.system.YearManager;
import rcpyo.utils.CacheImage;

public class TeachUnitName extends ViewPart{

	private static TableViewer tableView;
	
	/**  
	* @author liuXingjun
	* @date 2019年7月14日 下午3:40:29
	* @version 1.0  
	* @param @param parent    参数
	* @Description: 创建视图的的在主体内容，目前支持创建TableViewer
	 */  
	@Override
	public void createPartControl(Composite parent) {
		createTableViewer(parent);
	}

	/**  
	* @author liuXingjun
	* @date 2019年6月30日 下午4:32:50
	* @version V0.0.1  
	* @param parent    
	* @return void   
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	private void createTableViewer(Composite parent) {
		tableView = new TableViewer(parent,SWT.SINGLE |SWT.H_SCROLL);
		/*☆☆☆配置此结构化查看器是否使用内部哈希表加快元素和SWT项目之间的映射。 这必须被调用在给观众输入之前（通过<code> setInput </ code>）。*/
		tableView.setUseHashlookup(true);
		Table table = tableView.getTable();
		table.setBackgroundImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID,Constantss.TEACH_UNIT_BG_PATH));
		//添加教学单位名称、专业课、公共课3列
		TableColumn unitNameColumn = new TableColumn(SWT.LEFT);
		unitNameColumn.setWidth(152);
		
		TableColumn haszykColumn = new TableColumn(SWT.CENTER);
		haszykColumn.setWidth(14);

		TableColumn hasggkColumn = new TableColumn(SWT.CENTER);
		hasggkColumn.setWidth(14);
		table.setLinesVisible(true);
		
		//设置内容器和标签容器
		tableView.setContentProvider(new TeachUnitNameContentProvider());
		tableView.setLabelProvider(new TeachUnitNameLabelProvider());
		
		/**
		 * 指定数据的提供者
		 * tableView是数据的提供方
		 */
		tableView.setInput(getTeachUnitName(YearManager.getInstance().getMaxYear()));
		
		//滚动到顶端
		table.select(0);
		table.setFocus();
		
		/**
		 * 设置监听器服务器提供者
		 * ☆☆☆很重要：将tableViewer作为提供器--选择监听器模式的提供方，便于教学单位名称发生改变时通知其他视图；
		 */
		getViewSite().setSelectionProvider(tableView);
		
	}

	/**  
	* @author liuXingjun
	* @date 2019年7月14日 下午4:09:56
	* @version 1.0  
	* @param     参数
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */  
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	private List<Object> getTeachUnitName(int year) {
		List<Object> list = new ArrayList<Object>();
		YearTeachUnit ytu1 = new YearTeachUnit();
		ytu1.setHasggk("1");
		ytu1.setHaszyk("1");
		ytu1.setNian(2012);
		ytu1.setId(1);
		ytu1.setUnitid("20190112");
		
		TeachUnit tu1 = new TeachUnit();
		tu1.setId(001);
		tu1.setUnitname("英语");
		
		ytu1.setTechunit(tu1);
		
		/**
		 * 如果数据为空，则添加一个空对象
		 */
		if (list.toArray().length ==0) {
			list.add(new Object[0]);
		}
		
		return list;
	}
	
	

	
	
	

}
