package com.eric.multithreading.interrupt;

public class InterruptedRun2 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1�� = "+Thread.interrupted()+Thread.currentThread().getName());
		System.out.println("�Ƿ�ֹͣ2�� = "+Thread.interrupted());
		System.out.println("end!");
	}

}
