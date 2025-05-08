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

FirstName = CustomKeywords.'kw_web.kw_Random.getRandomFirstName'()

WebUI.setText(findTestObject('UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_First Name'), FirstName)

LastName = CustomKeywords.'kw_web.kw_Random.getRandomLastName'()

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Last Name'), 
    LastName)

String email

email = CustomKeywords.'kw_web.kw_Random.generateRandomString'(8)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Email_email'), 
    email.toLowerCase() + GlobalVariable.EMAIL_EXTENSION)

WebUI.setText(findTestObject('student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Confirm Email_verifyEmail'), 
    email.toLowerCase() + GlobalVariable.EMAIL_EXTENSION)

String upperCase = CustomKeywords.'kw_web.kw_Random.generateRandomString'(1)

String smallLetter = CustomKeywords.'kw_web.kw_Random.generateRandomString'(4)

String number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(2)

String specialCharacters = CustomKeywords.'studentPortal.Student.randomSpecialCharacters'(2)

String actualPassword = (upperCase.toUpperCase() + smallLetter) + number

WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Password_password'), actualPassword + 
    specialCharacters)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Confirm Password'), 
    actualPassword + specialCharacters)

String Mobile_Number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(10)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Phone'), 
    Mobile_Number)

String zipcode = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(5)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_ZipPostalCode'), 
    zipcode)

String month = CustomKeywords.'studentPortal.Student.randomMonthGenerator'()

String date = CustomKeywords.'studentPortal.Student.randomDateGenerator'()

WebUI.setText(findTestObject('Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), month + 
    date)

WebUI.callTestCase(findTestCase('com.create.and.update.account.page/Click_on_submit_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.db.student.portal/get_link_from_dB'), [:], FailureHandling.STOP_ON_FAILURE)

