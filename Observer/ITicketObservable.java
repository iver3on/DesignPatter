/**
 * 主题接口
 */

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public interface ITicketObservable {//被观察对象接口
	public void addObserver(ITicketObserver observer); //提供注册观察者方法s
}
