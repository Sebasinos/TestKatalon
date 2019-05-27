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


class CrearAvalBonus {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Abro el navegador e ingreso a crear avalador")
	public void abro_el_navegador_e_ingreso_a_crear_avalador() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://localhost:3000/avaladors/')
	}

	@When("Hago click sobre nuevo avalador")
	public void hago_click_sobre_nuevo_avalador() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_New Avalador'))
	}

	@When("Ingreso el rut del usuario {string}")
	public void ingreso_el_rut_del_usuario(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Rut usuario_avaladorrut_usuario'), string)
	}

	@When("Ingreso el rut del aval {string}")
	public void ingreso_el_rut_del_aval(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Rut aval_avaladorrut_aval'), string)
	}

	@When("Ingreso el nombre del aval {string}")
	public void ingreso_el_nombre_del_aval(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Nombre aval_avaladornombre_aval'), string)
	}

	@When("Ingreso el apellido paterno del aval {string}")
	public void ingreso_el_apellido_paterno_del_aval(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Apellido paterno aval_avaladorapellido_paterno_aval'),
				string)
	}

	@When("Ingreso el apellido materno del aval {string}")
	public void ingreso_el_apellido_materno_del_aval(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Apellido materno aval_avaladorapellido_materno_aval'),
				string)
	}

	@When("Ingreso la renta liquida {string}")
	public void ingreso_la_renta_liquida(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Renta liquida_avaladorrenta_liquida'),string)
	}

	@When("selecciono el año de inscripcion del usuario {string}")
	public void selecciono_el_año_de_inscripcion_del_usuario(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_20142015201620172018201920202021202220232024'),
				string, true)
	}

	@When("selecciono el mes de inscripcion del usuario {string}")
	public void selecciono_el_mes_de_inscripcion_del_usuario(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'),
				string, true)
	}

	@When("selecciono el dia de inscripcion del usuario {string}")
	public void selecciono_el_dia_de_inscripcion_del_usuario(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_12345678910111213141516171819202122232425262728293031'),
				string, true)
	}

	@When("Doy click sobre crear avalador")
	public void doy_click_sobre_crear_avalador() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/input_Fecha inscripcion usuario_commit'))
	}

	@When("Vuelvo a la seleccion de avalador")
	public void vuelvo_a_la_seleccion_de_avalador() {
		WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_Back'))
	}

	@Then("El nombre rut del aval debe ser {int}")
	public void el_nombre_rut_del_aval_debe_ser(Integer int1) {
		WebUI.verifyTextPresent(int1 , true)
		WebUI.closeBrowser()
	}
}