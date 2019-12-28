
/**
 * @author Feke
 *
 */
public abstract class User {

	private int userId;
	private String userPassword;
	private String registerDate;
	private int loginStatus;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	public boolean verifyLogin() {
		boolean verify = false;
		
		//get instructor id from database and check for validity
		//for now we simply check for the validity of administrator id
		//that mean for valid integer number and adminPassword for empty
		
		if(userId>0 && userPassword != "") {
			verify = true;
		}
		return verify;
	}
	
	public String getStatus(int userId) {
		String status = "unlogged";
		
		// Here is also check the status from the database
		// For now I use if user id is greater than 0 mean it logged unless it unlogged
		
		if(userId > 0) {
			status = "logged";
		}
		
		return status;
	}
}
