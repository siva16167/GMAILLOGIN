package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils1 {
	public 	 static WebDriver driver;

	// launch the browser

	public static void openBrowser() {

		// set up the webdrivermanager
		WebDriverManager.chromedriver().setup();

		// instantiate a chromedriver class
		driver=new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


	}
	public static void invokeApplication() {

		// navigate url
		String url="https://www.google.com/search?q=gmail+login&rlz=1C1CHBD_enIN880IN880&oq=gmail&aqs=chrome.2.69i60j69i59l2j69i57j0i433j69i61l3.12946j0j7&sourceid=chrome&ie=UTF-8";
		driver.get(url);


	}

}
