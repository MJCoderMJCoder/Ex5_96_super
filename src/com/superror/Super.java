package com.superror;
/*
 * 		在构造方法中，可以调用当前类和其父类的另一个构造方法，但必须是方法体的第一条语句。
 * 	使用当前类的构造方法用this；使用其父类的构造方法用super来引用。
 */
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor("wang", 1, "wu");

	}

}
