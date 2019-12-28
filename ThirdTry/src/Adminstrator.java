/**
 * @author Feke
 *
 */
public class Adminstrator extends User {
	
	private String adminName;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public boolean approve(int instructorId) {
		boolean aprove = false;
		
		//get instructor id from database and check for validity
		//for now we simply check for the validity of instructorId
		//that mean for valid integer number and adminPassword for empty
		
		if(instructorId>0) {
			aprove = true;
		}
		return aprove;
	}

}
