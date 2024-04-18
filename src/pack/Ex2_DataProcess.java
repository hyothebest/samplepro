package pack;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Binary Data Process
public class Ex2_DataProcess {
	public static void main(String[] args) throws Exception {
		Ex2_BinaryData bd = new Ex2_BinaryData();
		
		// <저장> 인코딩. 암호화
		// File f = new File("c:/work/iotest3.dat"); 은 아래 두 줄 합친 거
		File dir = new File("c:/work/");
		File f1 = new File(dir, "iotest3.dat");
		FileOutputStream fo = new FileOutputStream(f1);
		BufferedOutputStream bo = new BufferedOutputStream(fo, 1024);
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(bd);
		oo.close(); bo.close(); fo.close();
		
		// <읽기>
		File f2 = new File("c:/work/iotest3.dat");
		FileInputStream fi = new FileInputStream(f2);
		BufferedInputStream bi = new BufferedInputStream(fi, 1024);
		ObjectInputStream oi = new ObjectInputStream(bi);
		Object obj = oi.readObject();
		Ex2_BinaryData data = (Ex2_BinaryData)obj; //casting
		System.out.println(data.a);
		System.out.println(data.b);
		System.out.println(data.s1);
		System.out.println(data.s2);
		oi.close(); bi.close(); fi.close();
	}
}
