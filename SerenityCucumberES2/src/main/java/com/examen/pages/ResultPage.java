package com.examen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ResultPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"WorkAreaFilter1\"]")
	WebElement work;
	
	public void selectJob(String salary, String date, String area) {
		
		System.out.print(salary);
		System.out.print(date);
		System.out.print(area);
		
		//Select dropdown = new Select(work);
		//dropdown.selectByVisibleText(area);
	}
}
