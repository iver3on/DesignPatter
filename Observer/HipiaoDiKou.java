/**
 * 定义多个通知
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public class HipiaoDiKou implements ITicketObserver {

	/* (non-Javadoc)
	 * @see ITicketObserver#onBuyTicketOver()
	 */
	@Override
	public void onBuyTicketOver() {
		System.out.println("抵扣券记录：购票成功!");
	}

}
