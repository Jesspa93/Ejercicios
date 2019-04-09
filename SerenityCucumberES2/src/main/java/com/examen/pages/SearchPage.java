package com.examen.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.elempleo.com/co/")
public class SearchPage extends PageObject {

	@FindBy(xpath="//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElement btnAcepto;
	
	@FindBy(xpath="//input[@placeholder='Busca por cargo, profesión o empresa']")
	WebElement drop1;
	
	@FindBy(xpath="//input[@placeholder='¿En qué ciudad?']")
	WebElement drop;
	
	@FindBy(xpath="/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[3]/button")
	WebElement btnBuscar;
	
	
	
	public void initialSearch(String usuario, String password) {
		btnAcepto.click();
		
		drop1.sendKeys(usuario);
		drop.sendKeys(password);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnBuscar.click();
	}
		
}