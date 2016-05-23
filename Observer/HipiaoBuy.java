import java.util.ArrayList;
import java.util.List;

/**
 *  主题类（购票）
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */

////实现主题接口（被观察者）
public class HipiaoBuy implements ITicketObservable {
	//通知数组（观察者）
	List<ITicketObserver> list;
	
	public HipiaoBuy(){
		this.list = new ArrayList<>();
	}
	
	//购票核心类，处理购票流程
	public void buyTicket(){
		 //循环通知，调用其onBuyTicketOver实现不同业务逻辑
		for(ITicketObserver observer:list){
			observer.onBuyTicketOver();
		}
	}
	
	/* (non-Javadoc)
	 * @see ITicketObservable#addObserver()
	 */
	//添加N个通知
	@Override
	public void addObserver(ITicketObserver observer) {
		list.add(observer);
	}

}
