package Day_7;
import java.util.*;
public class MostImportant {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		try {
			System.out.println("enter the class name");
			String className=s1.next();
			Class.forName(className);   //check wheather the class is present or not
			System.out.println("the class found." +className );
		}catch(ClassNotFoundException e) {
			
			System.out.println("the class not found." );
		}finally {
			s1.close();
		}

	}

}
