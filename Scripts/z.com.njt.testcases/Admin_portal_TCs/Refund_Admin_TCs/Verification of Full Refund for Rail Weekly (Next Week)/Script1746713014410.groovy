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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import custom.JSUtils as JSUtils
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'),
	[:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

String initialCardValueText = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Card value-dashboard'))

String initialCardValue1 = initialCardValueText.substring(1, initialCardValueText.length())

String initialCardValue = initialCardValue1.replaceAll('[^\\d.]', '')

double formatedInitialCardValue = Double.parseDouble(initialCardValue)

println(formatedInitialCardValue)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Tickets_Rail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Weekly'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.callTestCase(findTestCase('com.login.admin.page/Wait for purchase success msg visible'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Verify_purchase_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Verify_10_trip_status_onaccount_details_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Verify_get_transaction_history'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/verify_create_note_popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Save_button_Create note popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/a_Refund Pending'),
	0)

WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/a_Refund Pending'))

actualRefnumberPart = WebUI.getText(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/Ref_number'))

println(actualRefnumberPart)

dbconnection = CustomKeywords.'com.web.db.NJT_Reload_Database.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url,
	GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

String query = ('select * from p_web_trx_refunds where ID = \'' + actualRefnumberPart) + '\' order by ID desc;'

dbrefundstatus = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStatus'(dbconnection, query)

WebUI.verifyEqual('INIT', dbrefundstatus)

String refundamount_Txn = WebUI.getText(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/Ref amount'))

String actualRefundValue1 = refundamount_Txn.substring(1, refundamount_Txn.length())

double formatedRefundValue1 = Double.parseDouble(actualRefundValue1)

int refundAmountInCents = ((Math.round(formatedRefundValue1 * 100)) as int)

// Print the result in cents
println('Refund amount in cents: ' + refundAmountInCents)

dbRefundAmount = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundAmountDetails'(dbconnection, query)

WebUI.verifyEqual(refundAmountInCents, dbRefundAmount)

dbReferenceID = CustomKeywords.'com.web.db.NJT_Reload_Database.getReferenceIDDetails'(dbconnection, query)

WebUI.verifyEqual(actualRefnumberPart, dbReferenceID)

String refundDate = WebUI.getText(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/Ref date'))

dbRefundDateandTime = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundDateDetails'(dbconnection, query)

// Define date formats
SimpleDateFormat uiDateFormat = new SimpleDateFormat('MM/dd/yyyy | HH:mm:ss')

SimpleDateFormat dbDateFormat = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss')

// Parse both the UI and DB date strings into Date objects
Date uiRefundDate = uiDateFormat.parse(refundDate // actual value from the UI
	)

Date dbRefundDate = dbDateFormat.parse(dbRefundDateandTime // expected value from the DB
	)

// Compare the dates
WebUI.verifyEqual(uiRefundDate, dbRefundDate)

dbComments = CustomKeywords.'com.web.db.NJT_Reload_Database.getCOMMENTSDetails'(dbconnection, query)

WebUI.verifyEqual('Refund process initiated', dbComments)

dbAppType = CustomKeywords.'com.web.db.NJT_Reload_Database.getAppTypeDetails'(dbconnection, query)

WebUI.verifyEqual('2', dbAppType)

dbRefundState = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStateDetails'(dbconnection, query)

WebUI.verifyEqual('2', dbRefundState)

WebUI.delay(120)

not_run: WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/close refund details pop up'))

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Verify_10_trip_status_onaccount_details_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Transaction history-Refund completed'), [:], FailureHandling.STOP_ON_FAILURE)

dbconnection = CustomKeywords.'com.web.db.NJT_Reload_Database.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url,
	GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

dbrefundstatus = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStatus'(dbconnection, query)

WebUI.verifyEqual('COMPLETED', dbrefundstatus)

WebUI.verifyEqual(refundAmountInCents, dbRefundAmount)

dbAppType = CustomKeywords.'com.web.db.NJT_Reload_Database.getAppTypeDetails'(dbconnection, query)

WebUI.verifyEqual(actualRefnumberPart, dbReferenceID)

WebUI.verifyEqual('2', dbAppType)

dbRefundState = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStateDetails'(dbconnection, query)

WebUI.verifyEqual('2', dbRefundState)

dbComments = CustomKeywords.'com.web.db.NJT_Reload_Database.getCOMMENTSDetails'(dbconnection, query)

WebUI.verifyEqual('Refund Completed', dbComments)

// Compare the dates
WebUI.verifyEqual(uiRefundDate, dbRefundDate)


