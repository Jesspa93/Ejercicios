package com.qvision.pagefactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage {
	
	@FindBy(xpath = "//div[@id='available']/h2")
	WebElement lblMensaje;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input")
	WebElement txtCore;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input")
	WebElement txtRuby;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input")
	WebElement txtPython;
	
	@FindBy(xpath = "//*[@id=\"available\"]/input[1]")
	WebElement btnAdd;
	
	@FindBy(id = "total")
	WebElement txtTotal;
	
	public boolean validarLbl() {
		boolean isVisible = false;
		try {
			if(lblMensaje.isDisplayed()) {
				isVisible = true;
			}
		}catch(Exception e){
			
		}
		return isVisible;
	}
	
	public void ingresoLibros(String core, String ruby, String python) {
		txtCore.sendKeys(core);
		txtRuby.sendKeys(ruby);
		txtPython.sendKeys(python);
		btnAdd.click();
	}
	
	public int total() {
		return Integer.parseInt(txtTotal.getAttribute("value"));
	}
}
