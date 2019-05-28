package com.superror;

class Doctor {
	String name;
	int ID;
	String address;
	
	public Doctor(String name1, int ID1, String address1) {	//有参构造方法
		name = name1;
		ID = ID1;
		address = address1;
		
		System.out.println("名字：" + name);
		System.out.println("编号：" + ID);
		System.out.println("地址：" + address);
	}
	
	public Doctor() {	//如果不定义无参构造方法，将导致A行提示语法错误
	}
}
