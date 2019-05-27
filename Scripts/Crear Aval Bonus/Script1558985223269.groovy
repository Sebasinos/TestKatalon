import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/avaladors/')

WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_New Avalador'))

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Rut usuario_avaladorrut_usuario'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Rut aval_avaladorrut_aval'), '12121234')

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Nombre aval_avaladornombre_aval'), 'sebas')

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Apellido paterno aval_avaladorapellido_paterno_aval'), 
    'inos')

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Apellido materno aval_avaladorapellido_materno_aval'), 
    'hurt')

WebUI.setText(findTestObject('Object Repository/Page_Arquitectura/input_Renta liquida_avaladorrenta_liquida'), '2000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_20142015201620172018201920202021202220232024'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Arquitectura/select_12345678910111213141516171819202122232425262728293031'), 
    '14', true)

WebUI.click(findTestObject('Object Repository/Page_Arquitectura/input_Fecha inscripcion usuario_commit'))

WebUI.click(findTestObject('Object Repository/Page_Arquitectura/a_Back'))

WebUI.click(findTestObject('Object Repository/Page_Arquitectura/h1_Avaladors'))

WebUI.closeBrowser()

