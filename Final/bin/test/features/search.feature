# language: es
# encoding: iso-8859-1
Característica: Busqueda de Empleo
  Yo como usuario deseo poder encontrar empleo 
  con datos especificos de busqueda

  Esquema del escenario: Busqueda Exitosa
    Dado que estoy en la pagina de inicio de empleos
    Cuando ingreso los datos de trabajo <rol>, ciudad <city>, salario <salary>, fecha <date> y area <job>    
    Entonces puedo realizar mi busqueda especifica

    Ejemplos:
    | rol | city | salary | date | job |
    | Contador | Bogotá, Bogotá D.C. | $1 a $1,5 | Hace 1 semana | Administrativa y Financiera |