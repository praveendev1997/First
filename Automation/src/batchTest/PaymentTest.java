package batchTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaymentTest {
	@Test
	public void paymentInDollar() {
		Reporter.log("payment dollar");
	}
	@Test
	public void paymentInRupees()
	{
		Reporter.log("payment rupees");
	}
}
