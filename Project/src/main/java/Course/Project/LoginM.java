package Course.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class LoginM {

	WebDriver driver;
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	WebElement message;
	String[] bar = null;

	// Constructor
	public LoginM(WebDriver driverA) {
		this.driver = driverA;
	}

	public void init(String[] barA) {

		this.bar = barA;

		// driver.get("https://www.ieee.org/");
		WebElement btnSign = driver.findElement(By.id("mn-signin-link"));
		btnSign.click();
		System.out.print(bar);
		/*WebElement txtName = driver.findElement(By.id("username"));
		txtName.sendKeys(bar[0]);
		WebElement txtPasswd = driver.findElement(By.id("password"));
		txtPasswd.sendKeys(bar[1]);
		WebElement btnEntrar = driver.findElement(By.id("modalWindowRegisterSignInBtn"));
		btnEntrar.click();*/

		}

	public boolean validateSession() {

		boolean validation = true;
		try {
			message = driver.findElement(By.id("ieeesigninform-validationerrors"));

			if (message.isDisplayed()) {
				validation = false;
			}

		} catch (Exception a) {
			System.out.print(a.getMessage());
		}

		return validation;
	}
}