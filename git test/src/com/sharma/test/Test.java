package com.sharma.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test extends TimerTask{

	public static void main(String[] args) {
		
		Test t =new Test();
		long ONCE_PER_DAY = 1000*60*60*24;
	     Calendar calendar = Calendar.getInstance();
	     calendar.set(Calendar.HOUR_OF_DAY, 12);
	     calendar.set(Calendar.MINUTE, 05);
	     calendar.set(Calendar.SECOND, 00);
	     Date time = calendar.getTime();
	     //t.scheduledExecutionTime();
	     Timer timer = new Timer();
	     
	     timer.schedule(t, 1, 5000);	
	}

	@Override
	public void run() {
		System.out.println("\n\n\n");
		Thread two = new Thread( new ThreadA("two"));
		Thread one = new Thread( new ThreadA("one"));
		two.setPriority(5);
		one.setPriority(5);
		two.start();
		one.start();
		//ThreadA.countDownLatch.countDown();		
	}
}
