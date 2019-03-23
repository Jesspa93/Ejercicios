import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Principal {

	WebDriver driver;
	
	@Before
	public void initDriver(){
		System.out.println("Inicio Proyecto de Automatizacion");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}
	
	@Test
	public void test() {
		Login pageLogin = new Login(driver);
		pageLogin.initSession("test","secreto");
		Assert.assertTrue(pageLogin.validateSession());
		//Assert.assertNotEquals(true, pageLogin.validateSession());
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}

}