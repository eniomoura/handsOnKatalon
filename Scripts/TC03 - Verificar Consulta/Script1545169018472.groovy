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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('VerificarConsulta/a_Make Appointment'))

WebUI.setText(findTestObject('VerificarConsulta/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('VerificarConsulta/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('VerificarConsulta/button_Login'))

WebUI.click(findTestObject('VerificarConsulta/label_Apply for hospital readm'))

WebUI.click(findTestObject('VerificarConsulta/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('VerificarConsulta/td_11'))

WebUI.setText(findTestObject('VerificarConsulta/textarea_Comment_comment'), 'consulta')

WebUI.click(findTestObject('VerificarConsulta/button_Book Appointment'))

WebUI.check(findTestObject('VerificarConsulta/div_Appointment Confirmation'))

WebUI.click(findTestObject('VerificarConsulta/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('VerificarConsulta/a_History'))

WebUI.check(findTestObject('VerificarConsulta/div_History'))

WebUI.click(findTestObject('VerificarConsulta/a_Go to Homepage'))

