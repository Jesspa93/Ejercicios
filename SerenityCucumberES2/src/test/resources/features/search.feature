# language: es
# encoding: iso-8859-1
Caracter�stica: Inicio de Sesi�n
  Yo como usuario con datos de acceso
  deseo poder ingresar a los modulos que puedo administrar
  para realizar los procesos pertinentes

  Esquema del escenario: Login Exitoso
    Dado que estoy en la pagina de logeo de mi aplicaci�n
    Cuando ingreso los datos de trabajo <usuario> y ciudad <password>    
    Entonces puedo ingresar a la pagina de libros

    Ejemplos:
    | usuario | password |
      | Contador | Bogot�, Bogot� D.C. |