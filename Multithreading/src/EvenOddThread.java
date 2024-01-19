
public class EvenOddThread implements Runnable{
	
	static int count = 1;
	
	Object object;


	public EvenOddThread(Object object) {
		this.object = object;
	}

	@Override
	public void run() {
		while(count <=10) {
			if(count%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread Name : "+Thread.currentThread().getName() +" value " +count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println("Thread Name :" + Thread.currentThread().getName() + " value " +count);
					count++;
					object.notify();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		Runnable r1 = new EvenOddThread(obj);
		Runnable r2 = new EvenOddThread(obj);
	
		new Thread(r1,"even").start();
		new Thread(r2,"odd").start();
	}

}
