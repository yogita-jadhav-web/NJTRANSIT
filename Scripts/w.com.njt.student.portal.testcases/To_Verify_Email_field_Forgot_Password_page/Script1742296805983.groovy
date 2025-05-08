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

WebUI.callTestCase(findTestCase('w.com.njt.student.portal.testcases/To_Verify_Forgot Password Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'), 
    'ABD')

WebUI.verifyElementText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/p_Email is too short'), 
    'Email is too short')

not_run: WebUI.clearText(findTestObject('ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'))

WebUI.sendKeys(findTestObject('ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'), 
    Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'), 
    'abcdefghqw')

WebUI.verifyElementText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/p_User Email is invalid'), 
    'User Email is invalid')

WebUI.sendKeys(findTestObject('ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'), 
    Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/input_Enter User Email_email'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/ForgotPassword_Object_Repository/Page_Forgot Password  NJ Transit/p_User Email is required'), 
    'User Email is required')

