/*
join:
当A线程执行到B线程的.join()方法时，A就会等待，等B线程都执行完，A才会执行

join可以用来临时加入线程执行。
*/
class Demo implements Runnable{
	public void run(){
		for(int x = 0 ; x < 60 ; x++){
			System.out.println(Thread.currentThread().toString()+"-----"+x);
			Thread.yield();//释放当前线程的运行资格，运行别的线程
		}
	}
}
class JoinDemo{
	public static void main(String[] args) throws Exception{
		
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		//Thread t3 = new Thread(d);
		t1.start();
	    t1.setPriority(Thread.MAX_PRIORITY);//设置优先级为最高10
	//	t1.join();//此时t2和主线程等待  会先执行完t1,再往下执行   t2和main交替执行
		t2.start();	
		//t3.start();	
		//如果把t1.join();放在这个位置  此时主线程等待  先交替执行完t1和t2
		for(int x = 1;x < 60;x++){
			//System.out.println("main-----"+x);
		}
		System.out.println("over");
	}
}