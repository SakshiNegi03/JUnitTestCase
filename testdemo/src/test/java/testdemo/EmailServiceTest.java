package testdemo;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmailServiceTest {
	
	private EmailService  emailService = new EmailService();
	
	private Order order = new Order(2,"iPhone 12", 80000);
	
	@Test(expected = RuntimeException.class)
    public void sendEmailRuntimeExceptionTest()
    {
		emailService.sendEmail(order);
        System.out.println(" found exception occur !!");
    }
 
    @Test
	public void sendEmailTest() {
    	boolean isEmailSent =emailService.sendEmail(order, "test");
    	assertTrue(isEmailSent);
		
	}

}
