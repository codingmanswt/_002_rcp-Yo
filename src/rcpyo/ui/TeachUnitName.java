package rcpyo.ui;

import javax.swing.table.TableColumn;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

import constant.Constantss;
import rcpyo.system.YearManager;
import rcpyo.utils.CacheImage;

public class TeachUnitName extends ViewPart{

	private static TableViewer tableView;
	
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
		/*配置此结构化查看器是否使用内部哈希表加快元素和SWT项目之间的映射。 这必须被调用在给观众输入之前（通过<code> setInput </ code>）。*/
		tableView.setUseHashlookup(true);
		Table table = tableView.getTable();
		table.setBackgroundImage(CacheImage.getInstance().getImage(Constantss.APPLICATON_ID,Constantss.HISTORY_DATA_ICON_PATH));
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
		tableView.setLabelProvider(new TeachUnitLabelProvider());
		
		//指定数据的提供者
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

	@Override
	public void setFocus() {
		
	}
	
	
	
	

}
