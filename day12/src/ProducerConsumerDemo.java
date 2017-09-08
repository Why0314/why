
public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resource res = new Resource();
		Producer pro = new Producer(res);
		Consumer con = new Consumer(res);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		t1.start();
		t2.start();
		// new Thread(new Producer(res)).start();
		// new Thread(new Consumer(res)).start();
	}
}

class Resource {// Resource 资源
	private String name;
	private int count = 1;
	private boolean flag = false;

	public synchronized void set(String name) {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		this.name = name + "----" + count++;
		System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name);
		flag = true;
		this.notify();
	}

	public synchronized void out() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println(Thread.currentThread().getName() + "---消费者---" + this.name);
		flag = false;
		this.notify();

	}
}

class Producer implements Runnable {
	private Resource res;

	Producer(Resource res) {
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			res.set("商品");
		}
	}
}

class Consumer implements Runnable {
	private Resource res;

	Consumer(Resource res) {
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			res.out();
		}
	}

}