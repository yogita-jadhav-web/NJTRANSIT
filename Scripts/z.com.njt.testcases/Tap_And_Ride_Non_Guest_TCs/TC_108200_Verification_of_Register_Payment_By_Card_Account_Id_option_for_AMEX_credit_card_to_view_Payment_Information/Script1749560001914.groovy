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

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Click_On_Tap_And_Ride_Tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Unregistered_Tap_and_ride_Card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Click_On_By_Card_Account_Id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Enter_card_account_id'), [('cardType') : 'Amex'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Click_On_Register_Payment_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Verify_Your_Tap_and_Ride_card_has_been_registered_successfully'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Verify_Credit_Card_Logo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Validate_Account_Id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Verify_Card_Nickname_as_account_id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/VerifyPaymentDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/VerifyPaymentDates'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Verify_Trx_History_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

