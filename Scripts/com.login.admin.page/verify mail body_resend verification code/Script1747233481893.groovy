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

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/font_NJ TRANSIT WEB - Account Verification Code'), 
    'NJ TRANSIT WEB - Account Verification Code')

Verification_code = WebUI.getText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/strong_473912'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment(Verification_code)

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/p_Thank you for creating your NJ TRANSIT account'), 
    'Thank you for creating your NJ TRANSIT account.')

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/p_To activate your account, please enter th_7fe338'), 
    'To activate your account, please enter the following verification code:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/p_Please note, this code will expire in 1 hour'), 
    'Please note, this code will expire in 1 hour.')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/p_You can use your NJ TRANSIT account login_d89132'), 
    'You can use your NJ TRANSIT account login on the NJT Mobile App, FARE-PAY/Tap & Ride Website, and Web Ticketing account.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_admintest Mailbox  Maildrop/p_Thank you,                               _81f8a3'), 
    0)

