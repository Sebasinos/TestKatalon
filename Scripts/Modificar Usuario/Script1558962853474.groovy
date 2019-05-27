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

WebUI.navigateToUrl('http://localhost:3000/usuarios/')

WebUI.click(findTestObject('Page_Arquitectura/a_Edit_2'))

WebUI.setText(findTestObject('Page_Arquitectura/input_Nombre_usuarionombre'), 'diega')

WebUI.setText(findTestObject('Page_Arquitectura/input_Apellido_usuarioapellido'), 'acostas')

WebUI.setText(findTestObject('Page_Arquitectura/input_Nombre usuario_usuarionombre_usuario'), 'dacostas')

WebUI.setEncryptedText(findTestObject('Page_Arquitectura/input_Password_usuariopassword'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_Arquitectura/input_Password_commit'))

WebUI.click(findTestObject('Page_Arquitectura/a_Back'))

WebUI.click(findTestObject('Page_Arquitectura/h1_Usuarios'))

WebUI.click(findTestObject('Page_Arquitectura/h1_Usuarios'))

WebUI.click(findTestObject('Page_Arquitectura/h1_Usuarios'))

WebUI.click(findTestObject('Page_Arquitectura/h1_Usuarios'))

WebUI.closeBrowser()

