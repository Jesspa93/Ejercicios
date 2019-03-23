package com.qvision.pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
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
