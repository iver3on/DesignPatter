package net.zhangwenbo.Singleton;

/*
通过单例模式的学习告诉我们：
1、单例模式理解起来简单，但是具体实现起来还是有一定的难度。
2、synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用（注意需要使用锁的
对象和过程，可能有的时候并不是整个对象及整个过程都需要锁）。
到这儿，单例模式基本已经讲完了，结尾处，笔者突然想到另一个问题，就是采用类的静态方法，实现
单例模式的效果，也是可行的，此处二者有什么不同？
首先，静态类不能实现接口。（从类的角度说是可以的，但是那样就破坏了静态了。因为接口中不允许
有static修饰的方法，所以即使实现了也是非静态的）
其次，单例可以被延迟初始化，静态类一般在第一次加载是初始化。之所以延迟加载，是因为有些类比
较庞大，所以延迟加载有助于提升性能。
再次，单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。
最后一点，单例类比较灵活，毕竟从实现上只是一个普通的Java类，只要满足单例的基本需求，你可
以在里面随心所欲的实现一些其它功能，但是静态类不行。从上面这些概括中，基本可以看出二者的区
别，但是，从另一方面讲，我们上面最后实现的那个单例模式，内部就是用一个静态类来实现的，所
以，二者有很大的关联，只是我们考虑问题的层面不同罢了。两种思想的结合，才能造就出完美的解决
方案，就像HashMap采用数组+链表来实现一样，其实生活中很多事情都是这样，单用不同的方法来
处理问题，总是有优点也有缺点，最完美的方法是，结合各个方法的优点，才能最好的解决问题！

*/
public class Singleton {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 静态工程方法，创建实例 但是在多线程情况下 有可能出现不安全的情况 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

//这个是多线程环境下改的方法
/*		public static Singleton getInstance() { 
2.         if (instance == null) { 
3.             synchronized (instance) { 
4.                 if (instance == null) { 
5.                     instance = new Singleton(); 
6.                 } 
7.             } 
8.         } 
9.         return instance; 
10.     } */
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}
}
