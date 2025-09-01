
public class Author {

	private String name;
	private String email;
	private	char gender;	
	

	public String GetName() {
		return name;
	}
	
	public String GetEmail() {
		return email;
	}
	
	public void SetEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		if (gender == 'f' || gender == 'm') {
			return gender;
		}else {
			return 'x';
		}
		
	}
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String toString() {
		 return String.format("Author[name=%s, email=%s, gender=%c]", name, email, gender);
	}
}





