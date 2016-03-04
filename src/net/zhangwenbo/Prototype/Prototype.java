package net.zhangwenbo.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，
//该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
//本小结会通过对象的复制，进行讲解。在Java中，复制对象是通过clone()实现的，先创建一个原型类：

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
	
	//浅复制
	//浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	public Student clone() throws CloneNotSupportedException {
		Student proto = (Student) super.clone();
		return proto;
	}
	 /* 深复制 */  
	//深复制：将一个对象复制后，不论是基本数据类型还有引用类型，
	//都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
    public Student deepClone() throws IOException, ClassNotFoundException {  
  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
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
			System.err.println("对象s:"+s.getName());
			System.out.println("浅复制对象s1:"+s1.getName());
			System.out.println("深复制对象s2:"+s2.getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
