package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class BookPage extends PageObject{
	
	@FindBy(xpath = "//div[@id='available']/h2")
	WebElement lblMensaje;
	
	public boolean validarLbl() {
		//return lblMensaje();
		boolean isVisible = false;
		try {
			if(lblMensaje.isDisplayed()) {
				isVisible = true;
			}
		}catch(Exception e){
			
		}
		return isVisible;
	}

}
