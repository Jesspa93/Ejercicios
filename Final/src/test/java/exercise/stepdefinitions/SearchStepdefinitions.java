package exercise.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import exercise.steps.SearchStep;
import net.thucydides.core.annotations.Steps;

public class SearchStepdefinitions {
	
	@Steps
	SearchStep stepSearch;

	@Dado("^que estoy en la pagina de inicio de empleos$")
	public void queEstoyEnLaPaginaDeInicioDeEmpleo() {
		stepSearch.openSearch();
	}
    
	@Cuando("^ingreso los datos de trabajo (.*), ciudad (.*), salario (.*), fecha (.*) y area (.*)$")
	public void ingresoLosDatos(String usuario, String password, String salario, String fecha, String area) {
		stepSearch.initialSearch(usuario, password);
		stepSearch.select(salario, fecha, area);
	}

	@Entonces("^puedo realizar mi busqueda especifica$")
	public void puedoRealizarMiBusquedaEspecifica() {
		stepSearch.evidences();
	}
}
