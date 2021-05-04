package testcases;

import org.testng.annotations.Test;

import applicationcomponents.ApplicationComponetsLogin;
import driverscript.DriverScript;
import utils.Utils1;

public class GmailTest {
	@Test
	public void testcases() throws Throwable {
		new DriverScript().loadData("tcn01");
		Utils1.openBrowser();
		Utils1.invokeApplication();
		new ApplicationComponetsLogin().performLogin();

	}
}
