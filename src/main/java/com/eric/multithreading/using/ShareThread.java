package com.eric.multithreading.using;

public class ShareThread extends Thread {

	private int count=5;
	public void run(){
		super.run();
		count--;
		//��ʾ����Ҫ��for��䣬��Ϊʹ�ú������߳̾͵ò������еĻ�����
		//һֱ��һ���߳̽��м�������
		System.out.println("��" + this.currentThread().getName() + "���㣬count=" + count);
	}
}
