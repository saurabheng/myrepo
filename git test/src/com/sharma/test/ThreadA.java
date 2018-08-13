package com.sharma.test;

import java.util.concurrent.CountDownLatch;

public class ThreadA implements Runnable {

	public static final CountDownLatch countDownLatch  = new CountDownLatch(1);
	public ThreadA(){
		
	}
	public ThreadA(String name){
		this.name=name;
	}
	private String name;
	@Override
	public void run() {
		System.out.println("in run method started "+System.currentTimeMillis()+" "+this.getName());
		/*try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		callOne();
		System.out.println("in run method ending "+System.currentTimeMillis()+" "+this.getName());

	}
	private void callOne() {
		System.out.println("in call one started "+System.currentTimeMillis()+" "+this.getName());
		/*try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for(int i=0;i<1000000000;i++) {
			
		}
		System.out.println("in call one ending "+System.currentTimeMillis()+" "+this.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ThreadA [name=" + name + "]";
	}

}
