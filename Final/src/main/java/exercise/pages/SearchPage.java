package exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.elempleo.com/co/")

public class SearchPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElement btnAceppt;
	
	@FindBy(xpath="//input[@placeholder='Busca por cargo, profesión o empresa']")
	WebElement dropRol;
	
	@FindBy(xpath = "//*[@class=\"input-group\"]/span[1]/div/div/div[1]")
	WebElement btnSelect;
	
	@FindBy(xpath = "//input[@placeholder='¿En qué ciudad?']")
	WebElement btnCities;
	
	@FindBy(xpath = "//*[@class='tt-dataset tt-dataset-search']/div[2]")
	WebElement btnCity;

	public void initialSearch(String rol, String city) {
		
		btnAceppt.click();

		String rol2 = rol.substring(0 , rol.length()-4);
		
		dropRol.sendKeys(rol);
		btnSelect.click();
		
		btnCities.click();
		
	//	WebDriverWait myWaitVar = new WebDriverWait(getDriver(), 50);
	//	myWaitVar.until(ExpectedConditions.visibilityOf(btnCity));
		
		btnCity.click();
		
	}
		
}
