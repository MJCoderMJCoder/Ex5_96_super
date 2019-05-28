package com.superror;
/*
 * 如果父类定义了有参数的构造方法，系统就不再提供默认的无参构造方法；此时子类一定要避免使用父类的无参构造方法。
 * 
 * 当用子类的构造方法创建一个子类对象时，子类的构造方法总会显式或隐式地先调用父类的某个构造方法。
*/
class Specialist extends Doctor {
	public Specialist(String name1, int ID1, String address1) {
		super(name1, ID1, address1);
	}
	
	public Specialist() {
		super();	//A行，由于父类已经提供了有参构造方法，系统不再提供默认的无参构造方法
		name = "10";
	}
}
