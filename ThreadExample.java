package day27;
class threads1 extends Thread {
	public void run() {
		for(int i  =  1; i <= 10;i ++) {
			if(i % 2 != 0) {
				System.out.println("Odd Number : " + i);
			}
		}
	}
}
class threads2 extends Thread {
	public void run() {
		for(int i  =  1; i <= 10;i ++) {
			if(i % 2 == 0) {
				System.out.println("Even Number : " + i);
			}
		}
	}
}
public class ThreadExample {
    public static void main(String[] args) {
        threads1 th1 = new threads1();
        threads2 th2 = new threads2();
        th1.start();
        th1.setPriority(1);
        th2.start();
        th2.setPriority(10);
        
    }
}
