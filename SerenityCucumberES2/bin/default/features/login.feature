# language: es
# encoding: iso-8859-1

Característica: Inicio de Sesión
	Yo como usuario con datos de acceso
	deseo poder ingresar a los modulos que puedo administrar
	para realizar los procesos pertinentes
	
	Escenario: Login Exitoso 
		Dado que estoy en la pagina de logeo de mi aplicación
		Cuando ingreso el usuario <usuario> y el password <password>
		Entonces puedo ingresar a la pagina de libros