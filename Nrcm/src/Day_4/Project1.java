package Day_4;

public class Project1 {
    private String firstName;
    private String lastName;
    private String emailId;
    private long phoneNumber;
     
    public void setFirstName(String fn) {
    	firstName=fn;
    }
    public void setLastName(String ln) {
    	lastName=ln;
    }
    public void setEmailId(String ei) {
    	emailId=ei;
    }
    public void setPhoneNum(long l) {
    	phoneNumber=l;
    }
    public String getFirstName() {
    	return firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public String getEmailId() {
    	return emailId;
    }
    public long  getPhoneNum() {
    	return phoneNumber;
    }
    
	public static void main(String[] args) {
		Project1 p1=new Project1();
		p1.setFirstName("mahi");
		p1.setLastName("Maheshwari");
		p1.setEmailId("mahi@gmail.com");
		p1.setPhoneNum(8358756556l);
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getEmailId());
		System.out.println(p1.getPhoneNum());
		

	}

}
