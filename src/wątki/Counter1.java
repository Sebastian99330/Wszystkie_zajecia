package w¹tki;

//dziedziczenie po Thread
//implements Runnable
class Counter1 extends Thread {
	 public void run() {
	     for (int i = 0; i < 10; i++) {
	         System.out.println(" Counter : " + i);
	     }
	     System.out.println(" Counter finished .");
	 }
	
	 public static void main(String[] args) {
	     Counter1 c = new Counter1();
	     //Thread t = new Thread(c);	//has to be on implementing runnable
	     System.out.println(" Counter1 created .");
	     
	
	     c.start();
	     System.out.println(" Counter1 started .");
	
	     System.out.println(" Main finished .");
	 }
}

//lub implementacja Runnable
class Counter2 implements Runnable {
 public void run() {
     for (int i = 0; i < 10; i++) {
         System.out.println(" Counter : " + i);
     }
     System.out.println(" Counter finished .");
 }

 public static void main(String[] args) {
     Counter2 c = new Counter2();
     Thread t = new Thread(c);
     System.out.println(" Counter2 created .");

     t.start();
     System.out.println(" Counter2 started .");

     System.out.println(" Main finished .");
 }
}