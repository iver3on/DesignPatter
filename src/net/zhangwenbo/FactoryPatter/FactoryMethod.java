package net.zhangwenbo.FactoryPatter;


public class FactoryMethod {

	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		Sender sender = sf.produce("mail");
		sender.send();
	}

}
