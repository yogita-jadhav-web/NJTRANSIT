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
import java.math.BigDecimal as BigDecimal
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

not_run: WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

String initialCardValueText = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Card value-dashboard'))

String initialCardValue1 = initialCardValueText.substring(1, initialCardValueText.length())

String initialCardValue = initialCardValue1.replaceAll('[^\\d.]', '')

double formatedInitialCardValue = Double.parseDouble(initialCardValue)

println(formatedInitialCardValue)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_buy_tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Tickets_Bus_Interstate_Route_193'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Purchase ticket-Interstate-Bus/Page_Fare-Pay Dashboard  NJ Transit/input_Fare_rc'))

String getRefundValue = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Refund amount-select ticket page'))

String passValue = getRefundValue.substring(1, getRefundValue.length())

double formatedPassValue = Double.parseDouble(passValue)

println(formatedPassValue)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_to_Checkout_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Proceed_To_Pay_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('purchase_card_success msg/Page_Fare-Pay Dashboard  NJ Transit/div_Purchase successful. Please check your transaction history for more information on your tickets, and check your email for the transaction receipt'), 
    8)

WebUI.delay(2)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Verify_purchase_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'), 
    10)

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'))

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund'))

WebUI.verifyElementPresent(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund Policy'), 
    0)

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_Yes'))

WebUI.delay(2)

String refundText = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/pop up-2'))

String[] parts = refundText.split(': ')

String textPart = parts[0]

String actualRefnumberPart = parts[1]

println(actualRefnumberPart)

dbconnection = CustomKeywords.'com.web.db.NJT_Reload_Database.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url, 
    GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

String query = ('select * from p_web_trx_refunds where ID = \'' + actualRefnumberPart) + '\' order by ID desc;'

dbReferenceID = CustomKeywords.'com.web.db.NJT_Reload_Database.getReferenceIDDetails'(dbconnection, query)

WebUI.verifyEqual(actualRefnumberPart, dbReferenceID)

dbrefundstatus = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStatus'(dbconnection, query)

WebUI.verifyEqual('INIT', dbrefundstatus)

WebUI.scrollToElement(findTestObject('full_refund_Rail_10_trip/Refund pending-Link trnx page'), 0)

WebUI.click(findTestObject('full_refund_Rail_10_trip/Refund pending-Link trnx page'))

String refundDate = WebUI.getText(findTestObject('full_refund_Rail_10_trip/Refund Date-Time- Transaction screen'))

dbRefundDateandTime = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundDateDetails'(dbconnection, query)

// Define date formats
SimpleDateFormat uiDateFormat = new SimpleDateFormat('MM/dd/yyyy HH:mm:ss')

SimpleDateFormat dbDateFormat = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss')

// Parse both the UI and DB date strings into Date objects
Date uiRefundDate = uiDateFormat.parse(refundDate // actual value from the UI
    )

Date dbRefundDate = dbDateFormat.parse(dbRefundDateandTime // expected value from the DB
    )

// Compare the dates
WebUI.verifyEqual(uiRefundDate, dbRefundDate)

//WebUI.verifyEqual(refundDate, dbRefundDateandTime)
String refundamount_Txn = WebUI.getText(findTestObject('full_refund_Rail_10_trip/refundAmount-TransactionHistory'))

String actualRefundValue1 = refundamount_Txn.substring(1, refundamount_Txn.length())

double formatedRefundValue1 = Double.parseDouble(actualRefundValue1)

int refundAmountInCents = ((Math.round(formatedRefundValue1 * 100)) as int)

// Print the result in cents
println('Refund amount in cents: ' + refundAmountInCents)

dbRefundAmount = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundAmountDetails'(dbconnection, query)

WebUI.verifyEqual(refundAmountInCents, dbRefundAmount)

dbComments = CustomKeywords.'com.web.db.NJT_Reload_Database.getCOMMENTSDetails'(dbconnection, query)

WebUI.verifyEqual('Refund process initiated', dbComments)

dbAppType = CustomKeywords.'com.web.db.NJT_Reload_Database.getAppTypeDetails'(dbconnection, query)

WebUI.verifyEqual('1', dbAppType)

dbRefundState = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStateDetails'(dbconnection, query)

WebUI.verifyEqual('7', dbRefundState)

WebUI.delay(120)

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'), 
    50)

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'))

WebUI.verifyElementPresent(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/refund completed-link'), 0)

WebUI.click(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/refund completed-link'))

String transactionPageRefNum1 = WebUI.getText(findTestObject('full_refund_Rail_10_trip/referenceNumberTrnsactionHistory'))

WebUI.verifyEqual(actualRefnumberPart, transactionPageRefNum1)

String transactionRefundAmount = WebUI.getText(findTestObject('full_refund_Rail_10_trip/refundAmount-TransactionHistory'))

String actualRefundValue = transactionRefundAmount.substring(1, transactionRefundAmount.length())

double formatedRefundValue = Double.parseDouble(actualRefundValue)

WebUI.verifyEqual(formatedPassValue, formatedRefundValue)

WebUI.delay(120)

WebUI.verifyEqual(actualRefnumberPart, dbReferenceID)

dbrefundstatus = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStatus'(dbconnection, query)

WebUI.verifyEqual('COMPLETED', dbrefundstatus)

WebUI.verifyEqual(uiRefundDate, dbRefundDate)

WebUI.verifyEqual(refundAmountInCents, dbRefundAmount)

WebUI.verifyEqual('1', dbAppType)

WebUI.verifyEqual('7', dbRefundState)

dbComments = CustomKeywords.'com.web.db.NJT_Reload_Database.getCOMMENTSDetails'(dbconnection, query)

WebUI.verifyEqual('Refund Completed', dbComments)

WebUI.refresh()

WebUI.delay(20)

WebUI.refresh()

WebUI.delay(20)

String finalCardValueText = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Card value-dashboard'))

println(finalCardValueText)

String finalCardValue1 = finalCardValueText.substring(1, finalCardValueText.length())

String finalCardValue = finalCardValue1.replaceAll('[^\\d.]', '')

double formatedfinalCardValue = Double.parseDouble(finalCardValue)

println(formatedfinalCardValue)

double TotalPassandCardValue = formatedInitialCardValue + formatedPassValue

WebUI.verifyEqual(TotalPassandCardValue, formatedfinalCardValue)

