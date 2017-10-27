package com.eric.multithreading;

public class BLogin extends Thread {

	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
