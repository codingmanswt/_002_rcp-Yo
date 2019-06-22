/**  
* Title: TestPaoPao.java
* Copyright: Copyright (c) 2019 济南鲁科安全设备有限公司
* @author codingManLiu
* @date 2019年6月22日 下午7:49:53 
* @version 1.0  
* @Description:
* @History： 
*/
package test;

import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;

/**
 * @author AAA
 *
 */
public class TestPaoPao {

	/**
	 * @author codingManLiu
	 * @date 2019年6月22日 下午7:49:53
	 * @version V0.0.1
	 * @param args 参数
	 * @return void 返回类型
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public static void main(String[] args) {
		final Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.open();
		/** 得到系统托盘 */
		final Tray tray = Display.getCurrent().getSystemTray();
		/** 計時器 */
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				/** 程序異步訪問swt對象 */
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						ToolTip tip = new ToolTip(display.getActiveShell(), SWT.BALLOON | SWT.ICON_INFORMATION);
						tip.setAutoHide(true);
						tip.setMessage("欢迎访问http://www.csdn.net/sunquan291");
						tip.setText("欢迎使用");
						TrayItem item = new TrayItem(tray, SWT.None);
						item.setToolTip(tip);
						tip.setVisible(true);
					}
				});
			}
		}, 0, 3000);

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
				timer.cancel();
			}
		}

	}

}
