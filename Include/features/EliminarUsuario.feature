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
@EliminarUsuario
Feature: Elimina Usuario
  I want to use this template for my feature file

  @Eliminar_Usuario
  Scenario Outline: Eliminar usuario en ambiente Visual
    Given Abro el navegador y voy a la pagina de usuario
    When Hago click sobre desatroy
    And Acepto el mensaje de alerta
    Then Debe generarse la <confirmacion> de eliminacion


    Examples: 
      | confirmacion  |
      | "Usuario was successfully destroyed." |