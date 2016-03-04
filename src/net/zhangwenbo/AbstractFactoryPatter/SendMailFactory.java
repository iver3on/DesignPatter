package net.zhangwenbo.AbstractFactoryPatter;

public class SendMailFactory implements Provider{
	public Sender produce() {
	            return new MailSender();  
	}
}
