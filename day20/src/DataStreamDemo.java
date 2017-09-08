import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// writeData();

		//readData();
		//writeUTFDemo();
		readUTFDemo();
	}

	public static void readUTFDemo() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("utfData.txt"));
		String s = dis.readUTF();
		System.out.println(s);
		dis.close();
	}

	public static void writeUTFDemo() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("utfData.txt"));
		dos.writeUTF("松岛枫");
		dos.close();
	}

	public static void readData() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		int i = dis.readInt();
		boolean b = dis.readBoolean();
		double d = dis.readDouble();
		System.out.println(i);
		System.out.println(b);
		System.out.println(d);

		dis.close();
	}

	public static void writeData() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

		dos.writeInt(234);
		dos.writeBoolean(true);
		dos.writeDouble(998.456);

		dos.close();
	}

}
