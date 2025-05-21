package Day_8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		try {
			File Obj = new File("C:\\Users\\PC\\OneDrive\\Desktop\\Sem2.java");
			Scanner R = new Scanner(Obj);
			while(R.hasNextLine()) {
				String data = R.nextLine();
				System.out.println(data);
			}
			R.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}

	}

}
