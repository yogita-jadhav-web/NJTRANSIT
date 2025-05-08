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

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch NJT Student Login Portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Email_email'), 'studentuser020@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Invalid email domain. The email that yo_b4388f_1'), 
    'Invalid email domain. The email that you entered does not match with the school\'s registers office.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/p_Invalid email domain. The email that you _f813ce'), 
    'Invalid email domain. The email that you entered does not match with the school\'s registers office.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Re-enrollment Failed'), 
    0)

WebUI.closeBrowser()

