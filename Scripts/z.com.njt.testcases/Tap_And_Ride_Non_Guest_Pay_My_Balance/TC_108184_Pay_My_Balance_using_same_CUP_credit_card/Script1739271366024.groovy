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

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/TapRideAccId_ObjRepo/Page_Add Payment Card  NJ Transit/input_Card Account Id'), 
    GlobalVariable.CUP_Account_Id)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Click_On_Register_Payment_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/click_pay_my_balance_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_random_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_CUP_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_To_Add_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/verify_Payment_Successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Click_On_Txn_History_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Click_On_Search_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.guest.page/Verify_Web_Transactions_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

