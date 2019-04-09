package exercise.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class ResultPage extends PageObject {

	@FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div/div[1]/div")
	WebElement salario;

	@FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div")
	WebElement fecha;

	@FindBy(xpath = "//*[@id=\"WorkAreaFilter1\"]")
	WebElement trabajo;

	DataPage datePage;

//------------------------------------------------------------------------------------

	public void selectSalary(String salary) {

		System.out.print(salary);
		
		String s = null;
		
		switch(salary) {
		case "Menos de $1":
			s = "salary2";
			break;
		case "$1 a $1,5":
			s = "salary3";
			break;
		case "1,5 a $2":
			s = "salary4";
			break;
		case "$2 a $2,5":
			s = "salary5";
			break;
		case "$2,5 a $3":
			s = "salary6";
			break;
		case "$3 a $3,5":
			s = "salary7";
			break;
		case "$3,5 a $4":
			s = "salary8";
			break;
		case "$4 a $4,5":
			s = "salary9";
			break;
		case "$4,5 a $5":
			s = "salary10";
			break;
		case "$5,5 a $6":
			s = "salary23";
			break;
		case "$6,5 a $8":
			s = "salary27";
			break;
		case "$8 a $10":
			s = "salary28";
			break;
		case "$10 a $12,5":
			s = "salary29";
			break;
		case "$12,5 a $15":
			s = "salary30";
			break;
		case "$15 a $18":
			s = "salary31";
			break;
		case "$18 a $21":
			s = "salary32";
			break;
		case "Más de $21":
			s = "salary33";
			break;
		case "Confidencial":
			s = "salary35";
			break;			
		}

		List<WebElement> valores = salario.findElements(By.xpath("//input[@name='SalaryInfo1']"));

		for (WebElement val : valores) {
			if (val.getAttribute("id").equals(s)) {
				System.out.print(val.getAttribute("id"));
				val.click();
			}
		}
	}

// -------------------------------------------------------------------------------------

	public void selectDate(String date) {

		String a = "0";

		switch (date) {

		case "Hoy y ayer":
			a = "1";
			break;

		case "Hace 1 semana":
			a = "2";
			break;

		case "Hace 2 semanas":
			a = "3";
			break;

		case "Hace 1 mes":
			a = "4";
			break;

		case "Hace más de 1 mes":
			a = "6";
			break;

		}

	//	WebDriverWait myWaitVar = new WebDriverWait(getDriver(), 70);
	//	myWaitVar.until(ExpectedConditions.visibilityOf(fecha));
		
		
		 try { 
			 Thread.sleep(5000); 
			 } catch (InterruptedException e) { 
				 // TODO Auto-generated catch block 
				 e.printStackTrace(); 
				 }
		 

		List<WebElement> options = fecha.findElements(By.xpath("//input[@name='PublishDatesInfo1']"));

		for (WebElement time : options) {
			if (time.getAttribute("value").equals(a)) {
				System.out.print(time.getAttribute("id"));
				time.click();
			}
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//-----------------------------------------------------------------------------

	public void selectArea(String area) {

		Select dropdown = new Select(trabajo);
		dropdown.selectByVisibleText(area);

		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

	}

// ----------------------------------------------------------------------------

	public void getEvidenceTxt() {

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("evidences/infoCompanies.txt");
			pw = new PrintWriter(fichero);

			for (int i = 1; i < 21; i++) {
				String title = getDriver()
						.findElement(
								By.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[" + i + "]/div[1]/ul/li[1]/h2/a"))
						.getAttribute("title");
				String company = getDriver().findElement(By
						.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[" + i + "]/div[1]/ul/li[2]/h3/span[2]/span"))
						.getText();
				pw.println(i + ". " + title + " | " + company);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void getEvidencePNG() {
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File("evidences/screen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
