package com.examen.steps;

import com.examen.pages.ResultPage;
import com.examen.pages.SearchPage;

import net.thucydides.core.annotations.Step;

public class SearchStep {

	SearchPage pageSearch;
	ResultPage pageResult;
	
	@Step
	public void ingresarPagina() {
		pageSearch.open();
	}
	
	@Step
	public void initialSearch(String usuario, String password) {
		pageSearch.initialSearch(usuario, password);
//		pageResult.selectJob(salary, date, job);
	}
	
}
