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

		private Integer value;

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