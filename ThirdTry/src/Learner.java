public class Learner extends User {

	private String name;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean register() {
		boolean registerStatus = true;
		
		if (name.equals("") || phoneNumber.equals("")) {
			registerStatus = false;
		}
		
		return registerStatus;
	}
}
