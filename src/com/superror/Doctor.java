package com.superror;

class Doctor {
	String name;
	int ID;
	String address;
	
	public Doctor(String name1, int ID1, String address1) {	//�вι��췽��
		name = name1;
		ID = ID1;
		address = address1;
		
		System.out.println("���֣�" + name);
		System.out.println("��ţ�" + ID);
		System.out.println("��ַ��" + address);
	}
	
	public Doctor() {	//����������޲ι��췽����������A����ʾ�﷨����
	}
}
