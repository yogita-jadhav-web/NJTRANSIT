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

Mas_DB_Connection = CustomKeywords.'com.masqa.db.NJT_Mas_Database.get_MySQL_Mas_DBConnection'(GlobalVariable.NJT_Mas_DB_Url, 
    GlobalVariable.NJT_Mas_DB_UserName, GlobalVariable.NJT_Mas_DB_Password)

String maildrop = '%maildrop%'

String query = ('select * from g_users where user_type_id = 6 and ID like \'' + maildrop) + '\'order by create_date ASC;'

mail_web = CustomKeywords.'com.masqa.db.NJT_Mas_Database.get_web_email_from__g_users_table'(Mas_DB_Connection, query)

println('User_email_id:' + mail_web)

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input_Guest - FARE-PAY Card_emailId'), 
    mail_web)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Search'))

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/th_rashmi.ksmaildrop.cc'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/div_Find AccountSearchUser Account Details'), 
    0)

WebUI.callTestCase(findTestCase('com.login.admin.page/Click-change password link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/textarea_Password change'), 
    'Password change')

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__newPassword'), 
    GlobalVariable.ADMIN_PASSWORD)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input__reenterNewPassword'), 
    GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.openBrowser('https://cmsqa.cmsservices.us/njt-web/student-ticketing/login?university_code=2515&student_id=101')

not_run: WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch NJT Student Login Portal'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Email_email'), mail_web)

WebUI.setText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Password_password'), GlobalVariable.Admin_Password)

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

