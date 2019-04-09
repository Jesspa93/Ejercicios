package com.capacitacion.idioma.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.examen.steps.SearchStep;

import cucumber.api.DataTable;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SearchStepdefinitions {
	
	@Steps
	SearchStep stepLogin;

	@Dado("^que estoy en la pagina de logeo de mi aplicación$")
	public void queEstoyEnLaPaginaDeLogeoDeMiAplicación() {
		stepLogin.ingresarPagina();
	}

	@Cuando("^ingreso los datos de trabajo (.*) y ciudad (.*)$")
	public void ingresoLosDatos(String usuario, String password) {
	/*	List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
	    String user = data.get(0).get("user");
	    String password = data.get(0).get("pass");
	    stepLogin.initialSearch(user, password);*/
		stepLogin.initialSearch(usuario, password);
	}

	@Entonces("^puedo ingresar a la pagina de libros$")
	public void puedoIngresarALaPaginaDeLibros() {
	    
	}
	
}
