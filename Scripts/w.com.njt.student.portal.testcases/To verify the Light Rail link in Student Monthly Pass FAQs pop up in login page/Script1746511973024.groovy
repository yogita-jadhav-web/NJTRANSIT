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

WebUI.click(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Student Monthly Pass FAQs'))

WebUI.scrollToElement(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/a_light rail'), 0)

WebUI.click(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/a_light rail'))

WebUI.switchToWindowTitle('Light Rail Tickets | New Jersey Public Transportation Corporation')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/ui links/Page_Light Rail Tickets  New Jersey Public _7be798/main_Light Rail Tickets NJ TRANSIT introduc_be23ab'), 
    0)

WebUI.closeBrowser()

