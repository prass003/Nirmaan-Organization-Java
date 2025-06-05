package day27;
class threads1 {
	public void Display1() {
		for(int i  =  1; i <= 10;i ++) {
			if(i % 2 != 0) {
				System.out.println("Odd Number : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
class threads2  {
	public void Display2() {
		for(int i  =  1; i <= 10;i ++) {
			if(i % 2 == 0) {
				System.out.println("Even Number : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
public class ThreadExample {
    public static void main(String[] args) {
    	threads1 t1 = new threads1();
    	threads2 t2 = new threads2();
    	
    	Runnable r1 = () -> t1.Display1();
    	Runnable r2 = () -> t2.Display2();
    	
    	Thread th1 = new Thread(r1) ;
    	Thread th2 = new Thread(r2) ;
    	
    	th1.setPriority(10);
    	th1.start();
    	th1.setPriority(1);
    	th2.start();
        
    }
}
