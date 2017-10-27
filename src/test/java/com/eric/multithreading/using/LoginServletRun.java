package com.eric.multithreading.using;

import com.eric.multithreading.ALogin;
import com.eric.multithreading.BLogin;

public class LoginServletRun {

	public static void main(String[] args) {
		ALogin a=new ALogin();
		a.start();
		BLogin b=new BLogin();
		b.start();
	}
}
