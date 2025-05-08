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

WebUI.scrollToElement(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'), 
    10)

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'))

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs_1'), 
    'Student Monthly Pass FAQs')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/a_bus_1'), 
    'bus')

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/a_bus_1'))

WebUI.switchToWindowIndex(1)

String actualUrl = WebUI.getUrl()

String expectedUrl = GlobalVariable.BUS_URL

// Verify the URL (Exact Match)
WebUI.verifyMatch(actualUrl, expectedUrl, false)

WebUI.closeBrowser()

