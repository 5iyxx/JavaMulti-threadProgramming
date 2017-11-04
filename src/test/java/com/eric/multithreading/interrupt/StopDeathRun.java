package com.eric.multithreading.interrupt;

import com.eric.multithreading.interrupt.StopDeathThread;

public class StopDeathRun {

	public static void main(String[] args) {
		StopDeathThread thread=new StopDeathThread();
        thread.start();
	}
}
