/**
 * @author Feke
 *
 */
public class Instructor extends User {

	private String instructorName;
	private String address;
	
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean register() {
		boolean registerStatus = true;
		
		if (instructorName.equals("") || address.equals("")) {
			registerStatus = false;
		}
		
		return registerStatus;
	}

}
