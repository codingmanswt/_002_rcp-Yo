package constant;

/**
 * �����ࣺ
 * ʹ�÷�����
 * Constants
 * 
 * 
 * @author AAA
 *
 */

public class Constantss {

	 public static final String  APPLICATON_ID = "rcpYo";
	 
	 public static final String ICON_PATH = "icons/";
	 
	 public static final String DATA_ICON_PATH = ICON_PATH +"eclipse16.png";
	 public static final String TEACH_UNIT_DATA_ICON_PATH = ICON_PATH +"teachUnitData.gif";
	 public static final String HISTORY_DATA_ICON_PATH = ICON_PATH +"historyData.gif";
	 public static final String PUBLIC_DATA_ICON_PATH = ICON_PATH +"publicData.gif";
	 public static final String REMOTE_DATA_SRCONFIG_ICON_PATH = ICON_PATH +"RemoteDataSRConfig.gif";
	 
	
	/**
	 * �����ڵĳߴ�
	 * @author liuxingjun
	 *
	 */
	public static enum MainWindowSize {

		/*�����ڵ�ˮƽ�ֱ���*/
		MAIN_WINDOW_WIDTH_SIZE(1024),
		/*�����ڵĴ�ֱ�ֱ���*/
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
	     * ͨ�õ����ý���״̬
	     * @author liuxingjun
	     * @date 
	     */
	    public static enum EnableState{
	        DISABLE(0,"����"),ENABLE(1,"����");
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