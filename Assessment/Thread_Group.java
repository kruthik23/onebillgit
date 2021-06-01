package com.onebill;

public class Thread_Group implements Runnable{

	  public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
	   		Thread_Group group = new Thread_Group();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");   // invoking ThreadGroup class
            
          Thread t1 = new Thread(tg1, group,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, group,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, group,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  

}
