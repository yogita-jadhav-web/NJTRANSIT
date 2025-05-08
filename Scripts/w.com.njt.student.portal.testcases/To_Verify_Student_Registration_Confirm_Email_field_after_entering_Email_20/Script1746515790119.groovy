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
import static org.junit.Assert.assertFalse
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch_NJT_StudentPortal'), [:], FailureHandling.STOP_ON_FAILURE)

String email

email = CustomKeywords.'kw_web.kw_Random.generateRandomString'(8)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Email_email'), 
    email.toLowerCase() + GlobalVariable.EMAIL_EXTENSION)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Confirm Email_verifyEmail'), 
    email.substring(0, email.length() - 1).toLowerCase() + GlobalVariable.EMAIL_EXTENSION)

WebUI.verifyElementText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Email and Confirm Email must be same'), 
    GlobalVariable.CONFIRM_EMAIL_FIELD_VALIDATION_ERROR_MSG)

for (int i = 0; i < 19; i++) {
    WebUI.sendKeys(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Confirm Email_verifyEmail'), 
        Keys.chord(Keys.BACK_SPACE))
}

WebUI.verifyElementText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Email and Confirm Email must be same'), 
    GlobalVariable.CONFIRM_EMAIL_FIELD_VALIDATION_ERROR_MSG)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Confirm Email_verifyEmail'), 
    email.toLowerCase() + GlobalVariable.EMAIL_EXTENSION)

WebUI.closeBrowser()

