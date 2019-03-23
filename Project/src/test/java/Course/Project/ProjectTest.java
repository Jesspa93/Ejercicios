package Course.Project;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTest {

	WebDriver driver;
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	String[] bar = null;
	
	@Before
	public void initDriver(){
		System.out.println("Inicio Proyecto de Automatizacion");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ieee.org/");
	}
	
	@Before
	public void file() {
		File archivo = null;
		archivo = new File("archivo.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = "";

			while ((linea = br.readLine()) != null) {
				try {

					String[] bar = linea.split(" ");
					System.out.print(bar);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	@Test
	public void test() {
		LoginM pageLog = new LoginM(driver);
		pageLog.init(bar);
		//Assert.assertTrue(pageLogin.validateSession());
		Assert.assertNotEquals(true, pageLog.validateSession());
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}

}