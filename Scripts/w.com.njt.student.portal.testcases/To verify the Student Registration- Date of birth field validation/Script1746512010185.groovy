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

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), 
    '23/23')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_Date Of Birth is invalid'), 
    'Date Of Birth is invalid')

WebUI.sendKeys(findTestObject('Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), 
    Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), 
    '23')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/p_Date Of Birth is too short'), 
    'Date Of Birth is too short')

WebUI.sendKeys(findTestObject('Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), 
    Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), 
    '12/12')

WebUI.closeBrowser()

