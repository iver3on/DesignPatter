
/**
 * ��Ʊ������
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016��5��23��
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//============================�û���Ʊ====================
		HipiaoBuy buy = new HipiaoBuy();
		buy.addObserver(new HipiaoMSM());////���ݲ�ͬҵ���߼��������֪ͨ
		buy.addObserver(new HipiaoTxt());
		buy.addObserver(new HipiaoDiKou());
		buy.buyTicket();
	}

}
