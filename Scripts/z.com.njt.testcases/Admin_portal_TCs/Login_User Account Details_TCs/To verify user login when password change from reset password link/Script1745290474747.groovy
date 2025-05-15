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

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108393_To_verify_user_activation_with_new_verification_code'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.ADMIN_PORTAL_URL) + '\', \'_blank\')', [])

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

not_run: WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.ADMIN_PORTAL_URL) + '\', \'_blank\')', [])

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('com.login.admin.page/Search User with Email Id_pwd_change'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Tap_on_Reset_password_link_admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Switch to mail drop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Search email via mail box_inactive user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Admin portal _TC_objectRepo/Page_jgibaz Mailbox  Maildrop/div_NJ TRANSIT WEB - Account Password Reset'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/div_NJ TRANSIT WEB - Account Password Reset'), 
    'NJ TRANSIT WEB - Account Password Reset')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/p_We received a request to reset the passwo_86d6d7'), 
    'We received a request to reset the password for your NJ TRANSIT account.\n If you made this request, please click the button below to proceed.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/a_Reset                  Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/p_Please note, this link will expire in 1 hour'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/a_Reset                  Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/h1_Reset Password'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/span_New Password'), 
    20)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/input_New Password_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/span_Confirm Password'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/input_Confirm Password_verifyPassword'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/button_Reset Password'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/button_Reset Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/div_Reset password success'), 
    'Reset password success.')

WebUI.waitForElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/h1_Sign In'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/input_Email_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/input_Email_email'), 
    GlobalVariable.randomEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/input_New Password_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/button_Sign In'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_ilnccc Mailbox  Maildrop/div_FARE-PAY Card Number'), 
    0)

