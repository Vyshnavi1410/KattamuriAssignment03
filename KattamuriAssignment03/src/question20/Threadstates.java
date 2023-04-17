package question20;

import question20.MyThread;

public class Threadstates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		System.out.println("t1 state: " + t1.getState());//new
		t1.start();
		//runnable
		System.out.println("t1 state before main sleep : " +t1.getState());
		Thread.sleep(1000);
		System.out.println("t1 state after main sleep : " +t1.getState());//TIMED_WAITING
		Thread.sleep(2000);
		System.out.println("t1 state after 2 main sleep : " +t1.getState());//terminated
		
		
		

	}

}
class MyThread implements Runnable{
    	   public void run() {
    		   try {
    			   Thread.sleep(2500);
    			   System.out.println("t1 in run(), state: " + Thread.currentThread().getState());
    			   
    		   }catch(InterruptedException e) {
    			   e.printStackTrace();
    		   }
    	   }
       

	}



