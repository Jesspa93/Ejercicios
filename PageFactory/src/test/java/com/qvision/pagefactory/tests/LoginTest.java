package com.qvision.pagefactory.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qvision.pagefactory.pages.BookPage;
import com.qvision.pagefactory.pages.LoginPage;

import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver;
	LoginPage pageLogin;
	BookPage pageBook;
	
	@Before
	public void cargarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		pageLogin = PageFactory.initElements(driver, LoginPage.class);
		pageBook = PageFactory.initElements(driver, BookPage.class);
	}
	
	@Test
	public void test() {
		pageLogin.iniciarSesion("test","secret");
		pageBook.ingresoLibros("2","3","4");
		assertTrue("No inicio sesión!",pageBook.validarLbl());
		assertEquals("2600", pageBook.total());
	}
	
	@After
	public void cerrarDriver() {
		//driver.close();
		//driver.quit();
	}
}
