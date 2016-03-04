package net.zhangwenbo.FactoryPatter;

public class SendFactory {
	public Sender produce(String type) {
		 if ("mail".equals(type)) {  
	            return new MailSender();  
	        } else if ("sms".equals(type)) {  
	            return new MessageSender();  
	        } else {  
	            System.out.println("请输入正确的类型!");  
	            return null;  
	        }  
	}
}
