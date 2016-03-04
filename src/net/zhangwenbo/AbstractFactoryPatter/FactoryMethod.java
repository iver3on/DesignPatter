package net.zhangwenbo.AbstractFactoryPatter;


public class FactoryMethod {

	public static void main(String[] args) {
		SendMailFactory sf = new SendMailFactory();
		Sender sender = sf.produce();
		sender.send();
	}

}
