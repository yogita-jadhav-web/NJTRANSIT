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

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Click_Guest_Tap_and_Ride_option_admin_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify_Credit_card_and_Account_ID_options_with_radio_buttons_Guest_Tap_n_ride_'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Click_and_Verify_account_id_radio_button'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Enter AmexCard_Account_Id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/click search button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Amex Card details_admin Guest Tap n Ride page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Click Transaction History button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Transaction Info_fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Transaction Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 500)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Click Trips Option'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Trips fields_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Trips _Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Click_Transactions'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Click Trans No'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Trip No _Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify Trip_No_ Details_Popup_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

