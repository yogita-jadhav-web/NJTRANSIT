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

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch_NJT_StudentPortal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.student.portal/user.creation/UserRegistration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/div_User created successfully. A verificati_bb94a3_1'), 
    'User created successfully. A verification code has been sent to your email ID. Please verify.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_Verification link has been sent to adnama_cb8979'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_If you have not received the email, pleas_253e02'), 
    'If you have not received the email, please check your spam or junk folder. To resend click on regenerate button.')

WebUI.scrollToElement(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/button_Regenerate'), 
    0)

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/button_Regenerate'))

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/div_Verification code sent successfully'), 
    'Verification code sent successfully.')

WebUI.closeBrowser()

