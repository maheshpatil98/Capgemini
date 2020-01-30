import max.NameExceptions;

public class PersonClass {
	private String firstname;
	private String lastname;
	private char Gender;
	
	
	public PersonClass(){
		firstname= "Jon";
		lastname="Snow";
		Gender = 'M' ;
	}
	
	


	public PersonClass(String fname, String lname, char gd) throws NameExceptions {
		firstname = fname;
		lastname= lname;
		Gender = gd;
	    
	
	if(fname==null || lname ==null)
		throw new NameExceptions("Please insert the right input or close the program whichever u feel right its upto you");
		
	}	
	

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String fname) {
		this.firstname = fname;
	}


	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lname) {
		this.lastname = lname;
	}
	
	
	public char getGender() {
		return Gender;
	}

	public void setGender(char gd) {
		Gender = gd;
	}
	
	public void print(PersonClass pc){
		System.out.println(firstname +"  " +lastname + "   "+ Gender);
	}
	





	public static void main(String[] args) throws NameExceptions {
		PersonClass p = new PersonClass( null,null,'M');
		PersonClass p1 = new PersonClass();
		
		p.print(p);
		p1.print(p1);

		
		

	}
	
	

}
