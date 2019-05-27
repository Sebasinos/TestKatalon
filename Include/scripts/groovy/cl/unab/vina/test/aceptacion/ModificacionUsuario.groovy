package cl.unab.vina.test.aceptacion
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class ModificacionUsuario {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Abro el navegador y voy a la pagina de usuarios.")
	public void abro_el_navegador_y_voy_a_la_pagina_de_usuarios() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://localhost:3000/usuarios/')
	}

	@When("Hago click sobre editar usuarios.")
	public void hago_click_sobre_editar_usuarios() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_Edit_2'))
	}

	@When("Ingreso el nuevo nombre. {string}")
	public void Ingreso_el_nuevo_nombre(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Nombre_usuarionombre'), string)
	}

	@When("Ingreso el nuevo Apellido. {string}")
	public void Ingreso_el_nuevo_Apellido(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Apellido_usuarioapellido'), string)
	}

	@When("Ingreso el nuevo usuario. {string}")
	public void ingreso_el_nuevo_usuario(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Nombre usuario_usuarionombre_usuario'), string)
	}

	@When("Ingreso el nuevo password. {string}")
	public void ingreso_el_nuevo_password(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Password_usuariopassword'), string)
	}

	@When("Doy click sobre update usuario.")
	public void doy_click_sobre_update_usuario() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/input_Password_commit'))
	}

	@When("vuelvo a la seleccion de usuarios.")
	public void vuelvo_a_la_seleccion_de_usuarios() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_Back'))
	}

	@Then("El nuevo nombre debe ser. {string}")
	public void el_nuevo_nombre_debe_ser(String string) {
		WebUI.verifyTextPresent(string , true)
	}

	@Then("El nuevo Apellido debe ser. {string}")
	public void el_nuevo_Apellido_debe_ser(String string) {
		WebUI.verifyTextPresent(string , true)
	}

	@Then("El nuevo usuario debe ser. {string}")
	public void el_nuevo_usuario_debe_ser(String string) {
		WebUI.verifyTextPresent(string , true)
	}

	@Then("El nuevo password debe ser. {string}")
	public void el_nuevo_password_debe_ser(String string) {
		WebUI.verifyTextPresent(string , true)
		WebUI.closeBrowser()
	}
}