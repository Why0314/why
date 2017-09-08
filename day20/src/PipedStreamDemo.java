import java.io.*;

public class PipedStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		in.connect(out);
		
		Read r = new Read(in);
		Write w = new Write(out);
		new Thread(r).start();
		new Thread(w).start();
	}

}

class Read implements Runnable {
	private PipedInputStream in;

	Read(PipedInputStream in) {
		this.in = in;
	}

	public void run() {
		try {
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf, 0, len);
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			throw new RuntimeException("管道读取流失败");

		}
	}
}

class Write implements Runnable {
	private PipedOutputStream out;

	Write(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			out.write("why love jsd".getBytes());
			out.close();
		} catch (Exception e) {
			throw new RuntimeException("管道输出流失败");
		}
	}

}
