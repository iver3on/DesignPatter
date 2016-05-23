
/**
 * 购票主函数
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//============================用户购票====================
		HipiaoBuy buy = new HipiaoBuy();
		buy.addObserver(new HipiaoMSM());////根据不同业务逻辑加入各种通知
		buy.addObserver(new HipiaoTxt());
		buy.addObserver(new HipiaoDiKou());
		buy.buyTicket();
	}

}
