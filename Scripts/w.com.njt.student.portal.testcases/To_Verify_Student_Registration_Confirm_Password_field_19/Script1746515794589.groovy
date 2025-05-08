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

String upperCase = CustomKeywords.'kw_web.kw_Random.generateRandomString'(1)

String smallLetter = CustomKeywords.'kw_web.kw_Random.generateRandomString'(4)

String number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(2)

String specialCharacters = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(2)

String actualPassword = (upperCase.toUpperCase() + smallLetter) + number

WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Password_password'), actualPassword + 
    specialCharacters)

WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Confirm Password_confirmPassword'), 
    actualPassword.substring(0, actualPassword.length() - 1) + specialCharacters)

WebUI.click(findTestObject('Object Repository/Page_Create Account  NJ Transit/p_Password and Confirm Password must be same'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Account  NJ Transit/p_Password and Confirm Password must be same'), 
    'Password and Confirm Password must be same')

for (int i = 0; i < (actualPassword.length() + specialCharacters.length()); i++) {
    WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Confirm Password_confirmPassword'), 
        Keys.chord(Keys.BACK_SPACE))
}

WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Confirm Password_confirmPassword'), 
    actualPassword + specialCharacters)

WebUI.closeBrowser()

