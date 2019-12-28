import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AdminstratorTest {
	
	Adminstrator adminObj;
	
	@Before
	public void setUp() {
		adminObj = new Adminstrator();
	}

	@Test
	public void testGetAdminName() {
		adminObj.setAdminName("Fekedew Hailemariam");
		assertEquals("Fekedew Hailemariam", adminObj.getAdminName());
	}


	@Test
	public void testApprove() {
		
		assertEquals(false, adminObj.approve(-4));
	}

}
