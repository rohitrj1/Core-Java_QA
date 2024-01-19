
public class EvenOddPrintThread implements Runnable {
	
	static int count = 1;
	Object object;
	
	
	
	
	public EvenOddPrintThread(Object object2) {
		this.object = object2;
	}

	@Override
	public void run() {
		while(count<=10) {
			if(count%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thrad Name "+ Thread.currentThread().getName() +" value " + count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println("Thread Name "+ Thread.currentThread().getName() +" value " + count);
					count++;
					object.notify();
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Object object = new Object();
		
		Runnable r1 = new EvenOddPrintThread(object);
		Runnable r2 = new EvenOddPrintThread(object);
		
		new Thread(r1, "even").start();
		new Thread(r2, "odd").start();
		
		
	}
	
	

}
