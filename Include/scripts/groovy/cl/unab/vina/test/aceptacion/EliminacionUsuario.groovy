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


class EliminacionUsuario {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Abro el navegador y voy a la pagina de usuario")
	public void abro_el_navegador_y_voy_a_la_pagina_de_usuario() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://localhost:3000/usuarios/')
	}

	@When("Hago click sobre desatroy")
	public void hago_click_sobre_desatroy() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_Destroy (1)'))
	}

	@When("Acepto el mensaje de alerta")
	public void acepto_el_mensaje_de_alerta() {
		WebUI.acceptAlert()
	}

	@Then("Debe generarse la {string} de eliminacion")
	public void debe_generarse_la_de_eliminacion(String string) {
		WebUI.verifyTextPresent(string , true)
		WebUI.closeBrowser()
	}
}