package exercise.steps;

import exercise.pages.ResultPage;
import exercise.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchStep {
	
	SearchPage pageSearch;
	ResultPage pageResult;
	
	@Step
	public void openSearch() {
		pageSearch.open();
	}
	
	@Step
	public void initialSearch(String rol, String city) {
		pageSearch.initialSearch(rol, city);
	}
	
	@Step
	public void select(String salary, String date, String job) {	
		pageResult.selectSalary(salary);
		pageResult.selectDate(date);
		pageResult.selectArea(job);
		
	}
	
	@Step
	public void evidences() {
		pageResult.getEvidenceTxt();
		pageResult.getEvidencePNG();
	}
	

}
