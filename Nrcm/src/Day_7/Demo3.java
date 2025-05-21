package Day_7;
import java.io.*;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException {
		 
		File obj =new File("C:\\Users\\PC\\OneDrive\\Desktop\\Chocolate.java");
		Scanner Reader = new Scanner(obj);
		while (Reader.hasNextLine()) {
			String data = Reader.nextLine();
			System.out.println(data);
			throw new FileNotFoundException("file kanipinchatle");
		}
		Reader.close();
	}

}
