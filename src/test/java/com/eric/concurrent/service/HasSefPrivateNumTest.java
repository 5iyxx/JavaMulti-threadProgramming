package com.eric.concurrent.service;

public class HasSefPrivateNumTest {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef=new HasSelfPrivateNum();
		ThreadA athread=new ThreadA(numRef);
		athread.start();
		ThreadB bthread=new ThreadB(numRef);
		bthread.start();		
		
	}
}
