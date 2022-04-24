import java.util.*;
public class Person {
	//data fields
    private String  name;
    private String  email;
    private String  mobile;
    private Date    birthDate;
    
    //constructors
    public Person() {
    	this("","","",null);
    }
    
    public Person(String name, String email,String mobile, Date birthDate){
    	this.name = name;
    	this.email = email;
    	this.mobile = mobile;
    	this.birthDate =birthDate;  	
    }

    //Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
	  boolean checkName = name.matches("[a-zA-Z]{2,}");  //only letters, will accept a name with at least 2 letters
	  if(checkName == false){
		  throw new Exception("Name is not valid");
	  }
	  else{
	      this.name = name;}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
	  boolean checkEmail = email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	  if(!checkEmail){		  
		  throw new Exception("Email is not valid");
	  }
	  else
		  this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) throws Exception {
		boolean checkMobile = mobile.matches("05[\\d]{8}");
		if(!checkMobile){
			throw new Exception("Mobile number is not valid");
		}
		else
		    this.mobile = mobile;
	}
	
    public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
//		boolean checkDate = (birthDate.toString()).matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");// DD/MM/YYYY
//		if(!checkDate){
//			System.out.println("Date is not valid");
//		}
//		else
			this.birthDate = birthDate;
		
	}

	//methods
	public String toString(){
		return "Name: " + name + "\nEmail:" + email + "\nMobile number:" + mobile +"\nBirthDate: " + birthDate;
	}
}
