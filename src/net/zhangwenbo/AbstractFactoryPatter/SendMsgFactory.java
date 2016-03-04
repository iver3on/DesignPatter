package net.zhangwenbo.AbstractFactoryPatter;

import net.zhangwenbo.AbstractFactoryPatter.Sender;;

public class SendMsgFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MessageSender();
	}

}
