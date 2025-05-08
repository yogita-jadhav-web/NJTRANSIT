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

WebUI.callTestCase(findTestCase('com.student.portal/user.creation/Existing_User_Registration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/div_This email already exist. It appears yo_040fbc'), 
    'This email already exist. It appears you have registered with either our mobile app, web ticketing or tap & ride account. Please login with your existing credentials to register your farecard.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Registration Failed'), 
    'Registration Failed')

WebUI.scrollToElement(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_This email already exist. It appears you _cbd0a1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_This email already exist. It appears you _cbd0a1'), 
    'This email already exist. It appears you have registered with either our mobile app, web ticketing or tap & ride account. Please login with your existing credentials to register your farecard.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_For re-enrollment please try login into t_f6e7fa'), 
    'For re-enrollment please try login into the application using MyTix Student Monthly Pass – Account Management option from your university portal.')

WebUI.closeBrowser()

