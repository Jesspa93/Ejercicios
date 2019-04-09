package com.qvision.capacitacion.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")

public class LoginPage extends PageObject {
	@FindBy(name = "user")
	WebElement txtUsuario;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@class='button']")
	WebElement btnLogin;
	
	public void iniciarSesion(String usuario, String password) {
		txtUsuario.sendKeys(usuario);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
}
