package com.eric.multithreading;

public class LoginServletRun {

	public static void main(String[] args) {
		ALogin a=new ALogin();
		a.start();
		BLogin b=new BLogin();
		b.start();
	}
}
