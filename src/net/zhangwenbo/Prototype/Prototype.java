package net.zhangwenbo.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ԭ��ģʽ��Ȼ�Ǵ����͵�ģʽ�������빤��ģʽû�й�ϵ�������ּ��ɿ�����
//��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
//��С���ͨ������ĸ��ƣ����н��⡣��Java�У����ƶ�����ͨ��clone()ʵ�ֵģ��ȴ���һ��ԭ���ࣺ

class Student implements Cloneable,Serializable{
	String name;
	String age;

	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	//ǳ����
	//ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
	public Student clone() throws CloneNotSupportedException {
		Student proto = (Student) super.clone();
		return proto;
	}
	 /* ��� */  
	//��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ�
	//�������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
    public Student deepClone() throws IOException, ClassNotFoundException {  
  
        /* д�뵱ǰ����Ķ������� */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* �������������������¶��� */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return (Student) ois.readObject();  
    }  
}

public class Prototype implements Cloneable {
	

	public static void main(String[] args){
		Student s = new Student("ZWB", "25");
		Student s1 = null;
		Student s2 = null;
		try {
			s1 = s.clone();
			try {
				s2 = s.deepClone();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.println("����s:"+s.getName());
			System.out.println("ǳ���ƶ���s1:"+s1.getName());
			System.out.println("��ƶ���s2:"+s2.getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
