package Day_8;
import java.io.*;
//if file is not there "write"will create the file and then write in it
public class Test13 {

	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("C:\\Users\\PC\\OneDrive\\Desktop\\Sem2.java");
		f1.write("hi mahi how are you");
		f1.close();
		System.out.println("succes");

	}

}
