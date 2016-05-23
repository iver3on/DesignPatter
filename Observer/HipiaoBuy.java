import java.util.ArrayList;
import java.util.List;

/**
 *  �����ࣨ��Ʊ��
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016��5��23��
 */

////ʵ������ӿڣ����۲��ߣ�
public class HipiaoBuy implements ITicketObservable {
	//֪ͨ���飨�۲��ߣ�
	List<ITicketObserver> list;
	
	public HipiaoBuy(){
		this.list = new ArrayList<>();
	}
	
	//��Ʊ�����࣬����Ʊ����
	public void buyTicket(){
		 //ѭ��֪ͨ��������onBuyTicketOverʵ�ֲ�ͬҵ���߼�
		for(ITicketObserver observer:list){
			observer.onBuyTicketOver();
		}
	}
	
	/* (non-Javadoc)
	 * @see ITicketObservable#addObserver()
	 */
	//���N��֪ͨ
	@Override
	public void addObserver(ITicketObserver observer) {
		list.add(observer);
	}

}
