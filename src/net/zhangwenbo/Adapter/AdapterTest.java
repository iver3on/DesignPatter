package net.zhangwenbo.Adapter;

public class AdapterTest {

	//������ģʽ��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��
	//Ŀ�����������ڽӿڲ�ƥ������ɵ���ļ��������⡣��Ҫ��Ϊ���ࣺ
	//���������ģʽ�������������ģʽ���ӿڵ�������ģʽ�����ȣ��������������������ģʽ���ȿ���ͼ��
	//����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��
	//ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable������룺
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Targetable target = new AdapterPatter();  
	     target.method1();  
	     target.method2();  
	}

}
