package com.CoreJava;


@FunctionalInterface
interface myinterface {

	int calculation(int a, int b);
}
public class lambdaexample {
	public static void main(String[] args) {
		myinterface s = (a,b)-> a + b;
		int result = s.calculation(5,3);
		System.out.println(result);
	}
	
}
