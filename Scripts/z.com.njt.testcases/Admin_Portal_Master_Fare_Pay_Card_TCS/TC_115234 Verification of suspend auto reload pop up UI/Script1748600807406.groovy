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

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.profile.page/Delete_Credit_Card_From_Manage_Saved_Payments'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Enter_min_reload_threshold_amounts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_VISA_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_random_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Random_Card_nickname'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_setup_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Switch to_1st_index_tab and_login_to_ Admin_portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/Click Fare Card tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_FarePayCard_Number'), 0)

String farePayCardNumber_admin = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_FarePayCard_Number'))

String actualCardNumber_admin = farePayCardNumber_admin.replaceAll('-', '')

println(actualCardNumber_admin)

WebUI.verifyElementText(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Card Value'), 
    'Card Value')

String cardValue_admin = WebUI.getText(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p-card value amount-admin'))

not_run: WebUI.callTestCase(findTestCase('com.admin.pages/FareCard_Page/Vealidate Fare card details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/FareCard_Page/Validate_Auto_reload_values'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/click_suspend_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.admin.pages/FareCard_Page/Create Note-popup-Suspend Auto Reload'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(0)

WebUI.refresh()

TestObject cardnumber = findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/span_fare_pay_cardNumber')

String actualText_cc = WebUI.getText(cardnumber)

String actualText_cc_portal = actualText_cc.replaceAll('-', '')

println('actualText_cc_portal: ' + actualText_cc_portal)

WebUI.verifyEqual(actualText_cc_portal, actualCardNumber_admin)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Verify_Fare_Pay_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

String Val = WebUI.getAttribute(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/status Auto reload-suspend-portal'), 
    'value')

WebUI.verifyEqual(Val, 'Suspend')

println('Test execution completed')

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Cancel_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Yes_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Verify_Auto Reload cancellation successful'), [:], FailureHandling.STOP_ON_FAILURE)

