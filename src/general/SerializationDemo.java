package general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main (String args[]) throws Exception{
		
		Demo demo = new Demo();
		demo.s = "Kannusamy";
		
		//Serialization
		File f = new File("C:/Users/Pavithra Senthil/Documents/SerializeEx.txt");
		FileOutputStream fos = new FileOutputStream(f);	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		
		//DeSerialization
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);	
		Demo demo1 = (Demo) ois.readObject();
		System.out.println("value:"+demo1.s);
	}
}


class Demo implements Serializable{
	
	String s;
}