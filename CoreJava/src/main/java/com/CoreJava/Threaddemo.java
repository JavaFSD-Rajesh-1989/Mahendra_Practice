package com.CoreJava;

public class Threaddemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("New Thread");
		System.out.println(t);
	}
}
