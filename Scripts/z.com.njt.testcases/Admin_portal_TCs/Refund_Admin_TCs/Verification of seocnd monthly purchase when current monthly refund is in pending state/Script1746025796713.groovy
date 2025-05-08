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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_buy_tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Select_Tariff_Type_From_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/Monthly radio button-Bus'))

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_to_Checkout_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/input_123.00_paymentMethods'))

WebUI.setText(findTestObject('Page_Add Payment Card  NJ Transit/input_Card Number'), GlobalVariable.VISA)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/input_CVV_cvv'), '123')

WebUI.callTestCase(findTestCase('com.fare.pay.refund.page/add_CardHolder_name-Creditcard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.fare.pay.refund.page/Zip_code_CC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/span_Proceed To Pay'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('com.login.admin.page/Wait for purchase success msg visible'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Verify_purchase_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/verify_monthly_ticket_status_on_account_details_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Verify_get_transaction_history'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/verify_create_note_popup'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.login.admin.page/success_msg'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/a_Refund Pending'), 
    0)

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_buy_tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Ticket_Bus_without_Tarrif'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/Monthly radio button-Bus'))

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_to_Checkout_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/span_Proceed To Pay'))

WebUI.waitForElementVisible(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/div_You are only allowed to purchase one ticket per validity period'), 
    3)

WebUI.verifyElementText(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/div_You are only allowed to purchase one ticket per validity period'), 
    'You are only allowed to purchase only one ticket per validity period.')

