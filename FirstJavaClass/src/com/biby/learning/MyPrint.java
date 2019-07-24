package com.biby.learning;

public class MyPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hellow world");
		ClassB abc = new ClassB();
		abc.Display();
		abc.print();
		
		ClassC bcd = new ClassC();
		bcd.Display();
		bcd.print();
		bcd.InterfaceM();
		
		ClassOverloading bcf = new ClassOverloading();
		bcf.name("biby");
		bcf.name();
		
		ClassOverridingChild ngf = new ClassOverridingChild();
		ngf.name("jinu");
		

	}

}
