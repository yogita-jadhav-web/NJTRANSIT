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

WebUI.callTestCase(findTestCase('com.login.page/Launch_NJT_Portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.create.and.update.account.page/Click_on_create_account_button'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.create.and.update.account.page/Enter_Mandatory_Fields'), [:], FailureHandling.STOP_ON_FAILURE)

FirstName = CustomKeywords.'kw_web.kw_Random.getRandomFirstName'()

WebUI.setText(findTestObject('UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_First Name'), FirstName)

LastName = CustomKeywords.'kw_web.kw_Random.getRandomLastName'()

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Last Name'), 
    LastName)

Email_Id = CustomKeywords.'kw_web.web.generate_Random_EmailId'(FirstName)

GlobalVariable.randomEmail = Email_Id

println('GlobalVariable.randomEmail : ' + GlobalVariable.randomEmail)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Email'), 
    Email_Id)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Confirm Email'), 
    Email_Id)

WebUI.setEncryptedText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Confirm Password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

String Mobile_Number = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(10)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_Phone'), 
    Mobile_Number)

String zipcode = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(5)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Create Account  NJ Transit/input_ZipPostalCode'), 
    zipcode)

WebUI.callTestCase(findTestCase('com.create.and.update.account.page/Click_on_submit_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Verify_User_Created_successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.back()

WebUI.back()

WebUI.delay(2)

WebUI.callTestCase(findTestCase('com.create.account.db.page/Login_With_InactiveUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Enter_Valid_Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Verify_Inactive_User_Message'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Verify_Email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Send_Code_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Verify_Resend_Code_Message'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.create.account.db.page/Enter_OTP_Using_Random_User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_Verify_Verification_Code_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Verify_User_Activated_Successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://cmsqa.cmsservices.us/njt-web/student-ticketing/login?university_code=2515&student_id=101')

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Email_email'), Email_Id)

WebUI.setEncryptedText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.scrollToElement(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Sign In'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Re enrollment successfull_heading'), 'Re-enrollment Successful')

WebUI.verifyElementText(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Re enrolment success-P2'), 'Please allow up to 5 minutes for the verification email to arrive.')

WebUI.verifyElementText(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Re enlorment success-p3'), 'If you have not received the email, please check your spam or junk folder. To resend click on regenerate button.')

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Re generate button'), 0)

WebUI.executeJavaScript('window.open(\'https://maildrop.cc/\', \'_blank\')', [])

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/input_Contact Us_flex-auto rounded-md borde_d34ab1'), 
    actualEmail)

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_View Mailbox (1)'))

WebUI.delay(70)

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Refresh Mailbox'))

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/a_Verify Email Address'), 
    'Verify Email Address')

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/a_Verify Email Address'))

WebUI.switchToWindowIndex(2)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/div_User activated successfully'))

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/div_User activated successfully'), 
    'User activated successfully.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_You have Successfully activated your NJ T_ca5d10'), 
    'You have Successfully activated your NJ TRANSIT student mobile account')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Use your account to purchase discounted s_452b14'), 
    'Use your account to purchase discounted student monthly passes.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Your student account is valid through Jul_ccf3b6'), 
    'Your student account is valid through July 31st, 2025.')

WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.STUDENT_LOGIN_URL) + '\', \'_blank\')', [])

WebUI.switchToWindowIndex(3)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Student_Login_Page_Objects/input_Email_email'), 
    actualEmail + GlobalVariable.EMAIL_EXTENSION)

WebUI.setText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Student_Login_Page_Objects/input_Password_password'), 
    actualPassword + specialCharacters)

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Student_Login_Page_Objects/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Student_Login_Page_Objects/span_Re-enrollment Failed'), 
    'Re-enrollment Failed')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Student_Login_Page_Objects/p_Your account is already active as a stude_88dc7d'), 
    'Your account is already active as a student for the current enrollment period. Your current enrollment period will end on July 31, 2025.')

WebUI.closeBrowser()

