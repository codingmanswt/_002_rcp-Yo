package rcpyo.intro;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import constant.Constantss;

public class Perspective implements IPerspectiveFactory {

	/**
	 * 进行初始布局安排
	 */
	public void createInitialLayout(IPageLayout layout) {
		/**
		 * 获取编辑区，为了后面的视图的位置的安排
		 */
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		/**
		 * 将布局固定，既不能移动，也不能改变大小
		 */
		layout.setFixed(true);
		/**
		 *加入教学单位视图 
		 *设置为：不允许关闭和移动
		 */
		layout.addStandaloneView(Constantss.TEACH_UNIT_NAME_APPLICATON_ID_3, true, IPageLayout.LEFT, 0.26f, editorArea);
		/*		IViewLayout teachUnitNameViewLayout = layout.getViewLayout(Constantss.TEACH_UNIT_NAME_APPLICATON_ID_3);
				teachUnitNameViewLayout.setCloseable(false);
				teachUnitNameViewLayout.setMoveable(false);*/
		
		layout.getViewLayout(Constantss.TEACH_UNIT_NAME_APPLICATON_ID_3).setCloseable(false);
		layout.getViewLayout(Constantss.TEACH_UNIT_NAME_APPLICATON_ID_3).setMoveable(false);
		


		/**
		 * 添加经费概览视图
		 * 设置为：不允许关闭和移动
		 * 【参考对象】在教学单位视图的下部，与其他的不同
		 */
		layout.addStandaloneView(Constantss.PIE_DIAGRAM_APPLICATON_ID_1, true, IPageLayout.BOTTOM, 0.72f,Constantss.TEACH_UNIT_NAME_APPLICATON_ID_3);
		/*	IViewLayout pieDiagramViewLayout = layout.getViewLayout(Constantss.PIE_DIAGRAM_APPLICATON_ID_1);
			pieDiagramViewLayout.setCloseable(false);
			pieDiagramViewLayout.setMoveable(false);*/
		

		layout.getViewLayout(Constantss.PIE_DIAGRAM_APPLICATON_ID_1).setCloseable(false);
		layout.getViewLayout(Constantss.PIE_DIAGRAM_APPLICATON_ID_1).setMoveable(false);
		
		

		
		/**
		 * 加入教学单位课程明细视图
		 * 设置为：不允许关闭和移动
		 * 此处使用的是：addView，因为此区域还要容纳其他视图
		 */
		layout.addView(Constantss.TEACH_UNIT_CLASS_APPLICATON_ID_2, IPageLayout.RIGHT, 0.74f,editorArea);
		/*	IViewLayout techUnitClassViewLayout = layout.getViewLayout(Constantss.TEACH_UNIT_CLASS_APPLICATON_ID_2);
			techUnitClassViewLayout.setCloseable(false);
			techUnitClassViewLayout.setMoveable(false);*/

		layout.getViewLayout(Constantss.TEACH_UNIT_CLASS_APPLICATON_ID_2).setCloseable(false);
		layout.getViewLayout(Constantss.TEACH_UNIT_CLASS_APPLICATON_ID_2).setMoveable(false);

		
		
		
	}
}
