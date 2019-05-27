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
@ModificacionUsuario
Feature: Modificar Usuario
  I want to use this template for my feature file

  @Modificar_Usuario
  Scenario Outline: Modificar usuario en ambiente Visual
    Given Abro el navegador y voy a la pagina de usuarios.
    When Hago click sobre editar usuarios.
    And Ingreso el nuevo nombre. <nombre>
    And Ingreso el nuevo Apellido. <apellido>
    And Ingreso el nuevo usuario. <usuario>
    And Ingreso el nuevo password. <password>
    When Doy click sobre update usuario.
    And vuelvo a la seleccion de usuarios.
    Then El nuevo nombre debe ser. <usuario>
    And El nuevo Apellido debe ser. <apellido>
    And El nuevo usuario debe ser. <usuario>
    And El nuevo password debe ser. <password>

    Examples: 
      | nombre  | apellido  | usuario    | password |
      | "juana" | "jimenes" | "jjimenes" | "12345"  |
