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
@CreacionUsuario
Feature: Crear Usuario
  I want to use this template for my feature file

  @Crear_Nuevo_Usuario
  Scenario Outline: Crear usuario en ambiente Visual
    Given Abro el navegador y voy a la pagina de creacion de usuario
    When Hago click sobre nuevo usuario
    And Ingreso el nombre <nombre>
    And Ingreso el Apellido <apellido>
    And Ingreso el usuario <usuario>
    And Ingreso el password <password>
    When Doy click sobre crear usuario
    And Vuelvo a la seleccion de usuario
    Then El nombre de usuario debe ser <usuario>

    Examples: 
      | nombre   | apellido  | usuario    | password |
      | "juan"   | "jimenez" | "jjimenez" | "1234"   |
      | "diego"  | "acosta"  | "dacosta"  | "1212"   |
      | "carlos" | "costa"   | "ccosta"   | "1213"   |
      | "pedro"  | "vera"    | "pvera"    | "1214"   |
