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

String FirstName = CustomKeywords.'kw_web.kw_Random.getRandomFirstName'()

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_First Name'), 
    FirstName)

String LastName = CustomKeywords.'kw_web.kw_Random.getRandomLastName'()

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Last Name'), 
    LastName)

String emailCapi = CustomKeywords.'kw_web.kw_Random.generateRandomString'(2)

String email = CustomKeywords.'kw_web.kw_Random.generateRandomString'(6)

String actualEmail = emailCapi.toUpperCase() + email.toLowerCase()

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Email_email'), 
    actualEmail + GlobalVariable.EMAIL_EXTENSION)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Confirm Email_verifyEmail'), 
    actualEmail + GlobalVariable.EMAIL_EXTENSION)

WebUI.setText(findTestObject('Object Repository/Page_Create Account  NJ Transit/input_Password_password'), 'Test@123')

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Confirm Password'), 
    'Test@123')

String Mobile_Number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(10)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Phone'), 
    Mobile_Number)

String zipcode = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(5)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_ZipPostalCode'), 
    zipcode)

//String month = CustomKeywords.'studentPortal.Student.randomMonthGenerator'()
//String date = CustomKeywords.'studentPortal.Student.randomDateGenerator'()
//WebUI.setText(findTestObject('Student_Portal/Page_Create Account  NJ Transit/input_Date Of Birth (MMDD)_dateOfBirth'), month + 
//  date)
WebUI.callTestCase(findTestCase('com.create.and.update.account.page/Click_on_submit_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('window.open(\'https://maildrop.cc/\', \'_blank\')', [])

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Maildrop_Email template - Student account registration/View this email box'))

WebUI.setText(findTestObject('Object Repository/Page_Maildrop_Email template - Student account registration/View this email box'), 
    actualEmail)

WebUI.click(findTestObject('Object Repository/Page_unequal.wallaby3730 Mailbox  Maildrop/button_View MailboxGo'))

WebUI.delay(120)

WebUI.click(findTestObject('Object Repository/Page_unequal.wallaby3730 Mailbox  Maildrop/button_Refresh Mailbox'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maildrop_Email template - Student account registration/Subject line-Email'), 
    0)

WebUI.delay(2)

not_run: WebUI.verifyElementPresent(findTestObject('Page_lthyddyw Mailbox  Maildrop/div_Email Verification for NJ TRANSIT MyTix_0b4600'), 
    0)

WebUI.scrollToElement(findTestObject('Page_Maildrop_Email template - Student account registration/verification text -part1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Maildrop_Email template - Student account registration/verification text -part1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Maildrop_Email template - Student account registration/verification text -part2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Maildrop_Email template - Student account registration/Page_Maildrop_Email template - Student account registration/Verify email address link'), 
    0)

