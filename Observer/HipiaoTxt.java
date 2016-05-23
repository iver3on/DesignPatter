/**
 * 定义多个通知
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public class HipiaoTxt implements ITicketObserver {

	/* (non-Javadoc)
	 * @see ITicketObserver#onBuyTicketOver()
	 */
	@Override
	public void onBuyTicketOver() {
		System.out.println("文本日志记录：购票成功");
	}

}
