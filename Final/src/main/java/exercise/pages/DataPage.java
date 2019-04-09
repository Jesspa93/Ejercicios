package exercise.pages;

public class DataPage {
	
public int dates(String fecha) {
		
		int a = 0;
		
		switch(fecha) {
		
		case "Hoy y ayer":
			a = 1;
			break;
		
		case "Hace 1 semana":
			a = 2;
			break;
			
		case "Hace 2 semanas":
			a = 3;
			break;
		
		case "Hace 1 mes":
			a = 4;
			break;
		
		case "Hace más de 1 mes":
			a = 6;
			break;
			
		}
		
		return a;
		// TODO Auto-generated method stub
		
	}

}
