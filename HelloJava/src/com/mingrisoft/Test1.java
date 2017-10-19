package com.mingrisoft;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class Test1 {
	public static void main(String[] args){
		Student student=new Student();
		Class<?>clazz=student.getClass();
		System.out.println("类的标准名称："+clazz.getCanonicalName());
		try{
			java.lang.reflect.Field id=clazz.getDeclaredField("id");
			System.out.println("设置前的id:"+student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);
			System.out.println("设置后的id:"+student.getId());
			
			Field name=clazz.getDeclaredField("name");
			System.out.println("设置前的name:"+student.getName());
			name.setAccessible(true);
			name.set(student,"明日科技");
			System.out.println("设置后的name:"+student.getName());
			
			java.lang.reflect.Field male=clazz.getDeclaredField("male");
			System.out.println("设置前的male:"+student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("设置后的male:"+student.isMale());
			
			java.lang.reflect.Field account=clazz.getDeclaredFields("account");
			System.out.print("设置前的account:"=student.getAccount());
			account.setAccessible(true);
			account.setDouble(student,12.34);
			System.out.println("设置后的account:"+student.getAccount());
			
		}catch(SecurityException e){
			e.printStackTrace();
		}catch(NoSuchFieldException e){
			e.printStackTrace();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}

}
