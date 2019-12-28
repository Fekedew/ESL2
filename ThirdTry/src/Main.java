
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Doing on Administrator user
		User admin = new Adminstrator();
		admin.setLoginStatus(1);
		admin.setRegisterDate("12-12-25019");
		admin.setUserId(1);
		admin.setUserPassword("adminpassword");


		// Doing on Instructor user
		User instructor = new Instructor();
		instructor.setUserId(2);
		instructor.setUserPassword("instructorPassword");
		instructor.setLoginStatus(0);
		instructor.setRegisterDate("20-12-2019");

		// Doing on Learner user
		User learner = new Learner();
		learner.setLoginStatus(0);
		learner.setRegisterDate("25-12-2019");
		learner.setUserId(3);
		learner.setUserPassword("learnerPassword");
		
		
		// Displaying all use information
		System.out.println("Id    Password        LoignStatus      RegisterDate" );
		System.out.println("==    ========        ===========      ============" );
		
		System.out.println(admin.getUserId() + "    "+ admin.getUserPassword() + "        "+admin.getLoginStatus() + "            "+admin.getRegisterDate() + "    ");
		System.out.println(instructor.getUserId() + "    "+ instructor.getUserPassword() + "   "+instructor.getLoginStatus() + "            "+instructor.getRegisterDate() + "    ");
		System.out.println(learner.getUserId() + "    "+ learner.getUserPassword() + "      "+learner.getLoginStatus() + "            "+learner.getRegisterDate() + "    ");
		
	}

}
