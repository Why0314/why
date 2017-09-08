/*
 * 线程间通讯
 * 其实就是多个线程在操作同一个资源，
 * 但是操作的动作不同。
 * 
 * 
 * wait:
 * notify();
 * notifyAll();
 * 
 * 都使用在同步中，因为要对持有监视器（锁）的线程操作。
 * 所以要在使用在同步中，因为只有同步才具有锁。
 * 
 * 为什么这些操作线程的方法要定义Object类中呢？
 * 因为这些方法在操作同步中线程时，都必须要标示它们所操作线程持有的锁，
 * 只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒。
 * 不可以对不同锁中的线程进行唤醒。
 * 
 * 也就是说，等待和唤醒必须是一个锁
 * 
 * 而锁可以是任意对象，所以可以被任意对象调用的方法定义Object类中
 */
class Res2 {
	private String name;
	private String sex;
	private boolean flag;
	
	public synchronized void set(String name,String sex){
		if(flag){
			try {
				this.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	public synchronized void out(){
		if(!flag){
			try {
				this.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
		System.out.println(name+"------"+sex);
		flag = true;
		this.notify();
	}
}

class Input2 implements Runnable {
	private Res2 r;

	Input2(Res2 r) {
		this.r = r;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		while (true) {							
				if (x == 0) {
					r.set("mike","man");
					
				} else {
					r.set("丽丽","女女女女");
					
				}
				x = (x + 1) % 2;
					
		}
	}

}

class Output2 implements Runnable {
	private Res2 r;

	Output2(Res2 r) {
		this.r = r;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			r.out();
		}
	}

}

public class InputOutputDemo2 {
	public static void main(String[] args) {
		Res r = new Res();
	
		/*Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();*///简化为 如下
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
		
	}
}
