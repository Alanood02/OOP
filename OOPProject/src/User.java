import java.time.LocalDate;
import java.util.*;
public class User extends Person {
	//data fields 
	private String  username;
    private String  password;
    private LocalDate dateCreated;
    private static int AccountNumber = 0;
    
    
    //constructors
    public User(){
    	dateCreated = LocalDate.now();
    	AccountNumber += 1;
    }
    public User(String username, String password){
    	try{
	    	setUsername(username);
	    	setPassword(password);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    }
    
	public User(String name, String email, String mobile, Date birthDate , String username, String password){
    	super(name,email,mobile,birthDate);
    	try{
	    	setUsername(username);
	    	setPassword(password);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	
    }
    //Getters and setters
    public String getUsername() {
    	return username;
    }

    public void setUsername(String username) throws Exception {
    	boolean checkUserName = username.matches("[a-zA-Z0-9]{6,15}");
    	if(!checkUserName){
    		throw new Exception("username must only contains alphanumeric characters for minimum 6 digits");
    	}
    	else
    	    this.username = username;
    }

	public String getPassword() {
	    return password;
    }
	
	public void setPassword(String password) throws Exception{
		boolean checkPassword = password.matches("[a-zA-Z0-9]{8,}");
		if(!checkPassword){
			throw new Exception("password must only contains alphanumeric characters for minimum 6 digits");
		}
		else
	        this.password = password;
	}
	
	public int getAccountNumber(){
		return AccountNumber;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	
    
 
    public String toString() {
        return super.toString()+"\nusername: "+ username + "\nPassword: " + password ;
  }


}
