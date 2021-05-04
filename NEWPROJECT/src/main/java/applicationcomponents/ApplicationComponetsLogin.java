package applicationcomponents;

import pages.GmailPage;

public class ApplicationComponetsLogin {


	public void performLogin() {
		GmailPage 	page=new GmailPage();
		page.clickOnSignIn();
		page.enterGmailId();
		page.clickNextButton();
		//page.enterPassword();

	}
}
