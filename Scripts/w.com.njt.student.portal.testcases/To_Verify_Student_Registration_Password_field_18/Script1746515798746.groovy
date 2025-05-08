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

String twoCharacters = CustomKeywords.'kw_web.kw_Random.generateRandomString'(2)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    twoCharacters)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Password is invalid'), 
    GlobalVariable.PASSWORD_FIELD_ERROR_MSG)

for (int i = 0; i < twoCharacters.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
        Keys.chord(Keys.BACK_SPACE))
}

String twentyCharacters = CustomKeywords.'kw_web.kw_Random.generateRandomString'(20)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    twentyCharacters)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Password is invalid'), 
    GlobalVariable.PASSWORD_FIELD_ERROR_MSG)

for (int i = 0; i < twentyCharacters.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
        Keys.chord(Keys.BACK_SPACE))
}

String onlyAlphabets = CustomKeywords.'kw_web.kw_Random.generateRandomString'(8)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    onlyAlphabets)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Password is invalid'), 
    GlobalVariable.PASSWORD_FIELD_ERROR_MSG)

for (int i = 0; i < onlyAlphabets.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
        Keys.chord(Keys.BACK_SPACE))
}

String onlyNumbers = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(8)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    onlyNumbers)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Password is invalid'), 
    GlobalVariable.PASSWORD_FIELD_ERROR_MSG)

for (int i = 0; i < onlyAlphabets.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
        Keys.chord(Keys.BACK_SPACE))
}

String onlySpecialCharacters = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(8)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    onlySpecialCharacters)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Password is invalid'), 
    GlobalVariable.PASSWORD_FIELD_ERROR_MSG)

for (int i = 0; i < onlySpecialCharacters.length(); i++) {
    WebUI.sendKeys(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
        Keys.chord(Keys.BACK_SPACE))
}

String upperCase = CustomKeywords.'kw_web.kw_Random.generateRandomString'(1)

String smallLetter = CustomKeywords.'kw_web.kw_Random.generateRandomString'(4)

String number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(2)

String specialCharacters = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(2)

String actualPassword = (upperCase.toUpperCase() + smallLetter) + number

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Password_password'), 
    actualPassword + specialCharacters)

WebUI.closeBrowser()

