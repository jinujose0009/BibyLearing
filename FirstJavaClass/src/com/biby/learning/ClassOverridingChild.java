package com.biby.learning;

public class ClassOverridingChild  extends ClassOverRidingP{
	public void name(String abc) {
		System.out.println("from child ClassOverRidingP" + abc);
		super.name(abc);
	}
}
