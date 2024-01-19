import java.util.List;

public class User {
	
	private String name;
	private int phone;
	private List<String> email;
	
	
	public User(String name, int phone, List<String> email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public List<String> getEmail() {
		return email;
	}


	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	
	

}
