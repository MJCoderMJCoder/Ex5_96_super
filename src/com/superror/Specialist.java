package com.superror;
/*
 * ������ඨ�����в����Ĺ��췽����ϵͳ�Ͳ����ṩĬ�ϵ��޲ι��췽������ʱ����һ��Ҫ����ʹ�ø�����޲ι��췽����
 * 
 * ��������Ĺ��췽������һ���������ʱ������Ĺ��췽���ܻ���ʽ����ʽ���ȵ��ø����ĳ�����췽����
*/
class Specialist extends Doctor {
	public Specialist(String name1, int ID1, String address1) {
		super(name1, ID1, address1);
	}
	
	public Specialist() {
		super();	//A�У����ڸ����Ѿ��ṩ���вι��췽����ϵͳ�����ṩĬ�ϵ��޲ι��췽��
		name = "10";
	}
}
