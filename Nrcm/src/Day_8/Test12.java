package Day_8;
import java.io.*;
public class Test12 {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\PC\\OneDrive\\Desktop\\Sem.java");
        if(f1.createNewFile()) {
        	System.out.println("file created");
        }else {
        	System.out.println("not created");
        }
	}

}
