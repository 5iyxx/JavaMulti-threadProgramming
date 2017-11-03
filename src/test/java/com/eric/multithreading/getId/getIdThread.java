package com.eric.multithreading.getId;

public class getIdThread {

	public static void main(String[] args) {

		Thread runThread=Thread.currentThread();
		System.out.println(runThread.getName()+" "+runThread.getId());
	}
}
