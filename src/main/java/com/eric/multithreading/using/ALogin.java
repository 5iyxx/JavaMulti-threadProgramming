package com.eric.multithreading.using;

public class ALogin extends Thread {

	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
