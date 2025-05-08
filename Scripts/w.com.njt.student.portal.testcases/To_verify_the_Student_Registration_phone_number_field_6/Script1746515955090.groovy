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

String fourDigitPHNO = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(4)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
    fourDigitPHNO)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Phone Number is too short'), 
    GlobalVariable.PHONE_NUMBER_VALIDATION_MSG1)

for (int i = 0; i < fourDigitPHNO.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
        Keys.chord(Keys.BACK_SPACE))
}

String nineDigitPHNO = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(9)

String oneSpecialCharacter = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(1)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
    nineDigitPHNO + oneSpecialCharacter)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Phone Number is invalid'), 
    GlobalVariable.PHONE_NUMBER_VALIDATION_MSG2)

for (int i = 0; i < (nineDigitPHNO.length() + oneSpecialCharacter.length()); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
        Keys.chord(Keys.BACK_SPACE))
}

String alphabets = CustomKeywords.'kw_web.kw_Random.generateRandomString'(10)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
    alphabets)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Phone Number is invalid'), 
    GlobalVariable.PHONE_NUMBER_VALIDATION_MSG2)

for (int i = 0; i < alphabets.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
        Keys.chord(Keys.BACK_SPACE))
}

String nineDigitPHNO1 = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(9)

String alphabets1 = CustomKeywords.'kw_web.kw_Random.generateRandomString'(1)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
    nineDigitPHNO1 + alphabets1)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Phone Number is invalid'), 
    GlobalVariable.PHONE_NUMBER_VALIDATION_MSG2)

for (int i = 0; i < (alphabets.length() + nineDigitPHNO.length()); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
        Keys.chord(Keys.BACK_SPACE))
}

String validPHNO = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(10)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Phone_phoneNo'), 
    validPHNO)

WebUI.closeBrowser()

