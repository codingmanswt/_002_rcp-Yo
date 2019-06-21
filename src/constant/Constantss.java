package constant;

/**
 * 常量类：
 * 使用方法：
 * Constants
 * 
 * 
 * @author AAA
 *
 */

public class Constantss {

	 public static final String  APPLICATON_ID = "application";
	 
	 public static final String ICON_PATH = "icons/";
	 
	 public static final String DATA_ICON_PATH = ICON_PATH +"eclipse16.png";
	 
	
	/**
	 * 主窗口的尺寸
	 * @author liuxingjun
	 *
	 */
	public static enum MainWindowSize {

		/*主窗口的水平分辨率*/
		MAIN_WINDOW_WIDTH_SIZE(1024),
		/*主窗口的垂直分辨率*/
		MAIN_WINDOW_HEIGHT_SIZE(768);

		private final Integer value;

		private MainWindowSize(Integer value) {
			this.value = value;
		}

		/**
		 * @return value
		 */
		public Integer getValue() {
			return value;
		}
		
		
		/**
	     * 通用的启用禁用状态
	     * @author liuxingjun
	     * @date 
	     */
	    public static enum EnableState{
	        DISABLE(0,"禁用"),ENABLE(1,"启用");
	        private EnableState(Integer value,String name){
	            this.value = value;
	            this.name = name;
	        }
	        private final Integer value;
	        private final String name;
	        
	        public Integer getValue() {
	            return value;
	        }

	        public String getName() {
	            return name;
	        }
	    }
		
	}

}