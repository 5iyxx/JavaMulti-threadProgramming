package com.eric.multithreading.using;

import com.eric.multithreading.using.RankThread;

public class RankThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RankThread t1 = new RankThread(1);
		RankThread t2 = new RankThread(2);
		RankThread t3 = new RankThread(3);
		RankThread t4 = new RankThread(4);
		RankThread t5 = new RankThread(5);
		RankThread t6 = new RankThread(6);
		RankThread t7 = new RankThread(7);
		RankThread t8 = new RankThread(8);
		RankThread t9 = new RankThread(9);
		RankThread t10 = new RankThread(10);
		RankThread t11 = new RankThread(11);
		RankThread t12 = new RankThread(12);
		RankThread t13 = new RankThread(13);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
	}
}
