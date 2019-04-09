package com.qvision.capacitacion.steps;

import com.qvision.capacitacion.pages.BookPage;
import com.qvision.capacitacion.pages.LoginPage;

public class LoginStep {
	
	LoginPage pageLogin;
	BookPage pageBook;
	
	public void openApp() {
		pageLogin.open();
	}
	
	public void typeData(String user, String passw) {
		pageLogin.iniciarSesion(user, passw);
	}
	
	public boolean validateLogin() {
		return pageBook.validarLbl();
	}
}
