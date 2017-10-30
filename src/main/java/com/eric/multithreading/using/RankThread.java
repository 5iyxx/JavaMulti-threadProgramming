package com.eric.multithreading.using;

public class RankThread extends Thread {

	private int i;
	public RankThread(int i){
		super();
		this.i=i;
	}
	@Override
	public void run(){
		System.out.println(i);
	}
}
