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

WebUI.click(findTestObject('MarcarConsulta/a_Make Appointment'))

WebUI.setText(findTestObject('MarcarConsulta/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('MarcarConsulta/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('MarcarConsulta/button_Login'))

WebUI.click(findTestObject('MarcarConsulta/label_Apply for hospital readm'))

WebUI.click(findTestObject('MarcarConsulta/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('MarcarConsulta/td_11'))

WebUI.setText(findTestObject('MarcarConsulta/textarea_Comment_comment'), 'consulta')

WebUI.click(findTestObject('MarcarConsulta/button_Book Appointment'))

WebUI.check(findTestObject('MarcarConsulta/div_Appointment Confirmation'))

WebUI.closeBrowser()

