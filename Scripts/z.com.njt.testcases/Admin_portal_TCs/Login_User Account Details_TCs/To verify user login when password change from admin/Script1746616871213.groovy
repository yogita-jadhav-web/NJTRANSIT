import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Search User with Email Id_pwd_change'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Click-change password link'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.login.admin.page/Change user password pop up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/p_Change User Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/textarea__cacheComments'), 
    0)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/textarea_Password change'), 
    'Password change')

String upperCase = CustomKeywords.'kw_web.kw_Random.generateRandomString'(1)

String smallLetter = CustomKeywords.'kw_web.kw_Random.generateRandomString'(4)

String number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(2)

String actualPassword = ((upperCase.toUpperCase() + smallLetter.toLowerCase()) + number) + '@'

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__newPassword'), 
    0)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__newPassword'), 
    actualPassword)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__reenterNewPassword'), 
    0)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__reenterNewPassword'), 
    actualPassword)

println(actualPassword)

WebUI.verifyElementClickable(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/div_User password has been updated successfully'), 
    0)

WebUI.navigateToUrl('https://cmsqa.cmsservices.us/njt-web/')

WebUI.setText(findTestObject('LoginTC_Object_Repository/Page_Sign In  NJ Transit/input_Email'), GlobalVariable.Email_Admin_pwdChange)

WebUI.setText(findTestObject('LoginTC_Object_Repository/Page_Sign In  NJ Transit/input_Password'), actualPassword)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Sign In  NJ Transit/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Add Fare-Pay Card  NJ Transit/h1_Manage FARE-PAY Card'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin portal _TC_objectRepo/Page_Add Fare-Pay Card  NJ Transit/h2-Enter Farepay card info'), 
    0)

