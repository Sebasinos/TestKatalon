#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@CreacionUsuarioBonus
Feature: Crear Aval
  I want to use this template for my feature file

  @Crear_Nuevo_Aval
  Scenario Outline: Crear usuario en ambiente Visual
    Given Abro el navegador e ingreso a crear avalador
    When Hago click sobre nuevo avalador
    And Ingreso el rut del usuario <rutuser>
    And Ingreso el rut del aval <rutaval>
    And Ingreso el nombre del aval <nombre>
    And Ingreso el apellido paterno del aval <apellidop>
    And Ingreso el apellido materno del aval <apellidom>
    And Ingreso la renta liquida <rent>
    And selecciono el año de inscripcion del usuario <ano>
    And selecciono el mes de inscripcion del usuario <mes>
    And selecciono el dia de inscripcion del usuario <dia>
    When Doy click sobre crear avalador
    And Vuelvo a la seleccion de avalador
    Then El nombre rut del aval debe ser <rutaval>

    Examples: 
      | rutuser     | rutaval    | nombre | apellidop | apellidom | rent      | ano    | mes | dia |
      | "123456789" | "12121212" | "Seba" | "inos"    | "hurt"    | "2000000" | "2017" | "4" | "7" |
