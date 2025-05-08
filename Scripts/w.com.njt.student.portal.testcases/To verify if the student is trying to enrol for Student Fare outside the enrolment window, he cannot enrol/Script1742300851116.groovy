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

WebUI.openBrowser(GlobalVariable.STUDENT_PORTAL_LOGIN_URL)

WebUI.setText(findTestObject('Object Repository/Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/input_Email_email'), 
    'gkvk@maildrop.cc')

WebUI.setEncryptedText(findTestObject('Object Repository/Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/button_Sign In'), 
    0)

WebUI.click(findTestObject('Object Repository/Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/span_Re-enrollment Failed'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enrolment_Stduent_Fare_outside_enrolment_window/Page_Sign In  NJ Transit/p_Invalid EmailPassword'), 
    0)

