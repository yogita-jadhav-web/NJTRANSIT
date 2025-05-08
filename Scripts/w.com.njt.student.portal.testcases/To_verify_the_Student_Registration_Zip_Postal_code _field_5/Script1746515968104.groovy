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

String onlyThreeNumbers = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(3)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
    onlyThreeNumbers)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_ZipPostal Code is too short'), 
    'Zip/Postal Code is too short')

for (int i = 0; i < onlyThreeNumbers.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
        Keys.chord(Keys.BACK_SPACE))
}

String onlyfourNumbers = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(4)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
    onlyfourNumbers)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_ZipPostal Code is invalid'), 
    'Zip/Postal Code is invalid')

for (int i = 0; i < onlyfourNumbers.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
        Keys.chord(Keys.BACK_SPACE))
}

String alphabets = CustomKeywords.'kw_web.kw_Random.generateRandomString'(5)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
    alphabets)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_ZipPostal Code is invalid'), 
    'Zip/Postal Code is invalid')

for (int i = 0; i < alphabets.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
        Keys.chord(Keys.BACK_SPACE))
}

String fiveSpecialCharacter = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(5)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
    fiveSpecialCharacter)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_ZipPostal Code is invalid'), 
    'Zip/Postal Code is invalid')

for (int i = 0; i < fiveSpecialCharacter.length(); i++) {
    WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
        Keys.chord(Keys.BACK_SPACE))
}

String validFiveDigitZipCode = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(5)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_ZipPostal Code_zipCode'), 
    validFiveDigitZipCode)

WebUI.closeBrowser()

