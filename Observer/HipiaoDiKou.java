/**
 * ������֪ͨ
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016��5��23��
 */
public class HipiaoDiKou implements ITicketObserver {

	/* (non-Javadoc)
	 * @see ITicketObserver#onBuyTicketOver()
	 */
	@Override
	public void onBuyTicketOver() {
		System.out.println("�ֿ�ȯ��¼����Ʊ�ɹ�!");
	}

}
