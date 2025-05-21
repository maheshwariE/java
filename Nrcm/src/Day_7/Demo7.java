package Day_7;

class MahiException extends Exception{
	public MahiException(String message) {
		super(message);
	}
}

public class Demo7 {
    public static void numCheck(int n) throws MahiException {
    	if(n%2==0) {
    		throw new MahiException("naku maths vachu");
    	}
    	else {
    		throw new MahiException("naku maths radu");
    	}
    }
	public static void main(String[] args) {
		try {
			numCheck(19);
		}catch(MahiException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy ");
		}
	}

}
