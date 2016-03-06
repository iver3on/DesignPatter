package net.zhangwenbo.Adapter;

public class AdapterPatter  extends Source implements Targetable{

	@Override
	public void method2() {
		   System.out.println("this is the targetable method!");  	
	}		
}
