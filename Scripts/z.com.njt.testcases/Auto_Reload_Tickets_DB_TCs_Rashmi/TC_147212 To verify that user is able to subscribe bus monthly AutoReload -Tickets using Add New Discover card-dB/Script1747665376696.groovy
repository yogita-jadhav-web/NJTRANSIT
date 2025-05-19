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

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/ProfileTAB'))

String userEmail = WebUI.getText(findTestObject('FarePay_Card_ObjectRepo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/FarePayCard_TAB'))

String farePayCardNumber = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String actualCardNumber = farePayCardNumber.replaceAll('-', '')

println(actualCardNumber)

WebUI.refresh()

WebUI.delay(5)

WebUI.callTestCase(findTestCase('com.profile.page/Delete_Credit_Card_From_Manage_Saved_Payments'), [:], FailureHandling.OPTIONAL)

String script = 'window.scrollTo(0, -200);'

WebUI.executeJavaScript(script, null)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

String beforeRefundCartValue = WebUI.getText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/cardValue'))

String initialCardValue = beforeRefundCartValue.substring(1, beforeRefundCartValue.length())

String replacedinitialCardValue = initialCardValue.replaceAll('[^\\d.]', '')

double formatedCardValue = Double.parseDouble(replacedinitialCardValue)

println(formatedCardValue)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_tickets_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Select_Bus_from_select_ticket_dropdown'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin portal _TC_objectRepo/input_route'), '22')

WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'))

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_continue_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/select_monthly_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Card_nickname_Amex'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/input_Card_Number'), FailureHandling.STOP_ON_FAILURE)

creditCardNumber = WebUI.getAttribute(findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/input_Card_Number'),
	'value')

println(creditCardNumber + ' Credit Card Number')

String lastFourDigitsPymtcardNum = creditCardNumber.substring(creditCardNumber.length() - 4)

System.out.println('Last four digits: ' + lastFourDigitsPymtcardNum)

WebUI.click(findTestObject('fareCardNum_ExistingCC/Page_Fare-Pay Dashboard  NJ Transit/input_CardNickname'))

cardNickname = WebUI.getAttribute(findTestObject('fareCardNum_ExistingCC/Page_Fare-Pay Dashboard  NJ Transit/input_CardNickname'),
	'value')

println(cardNickname + ' Card Nick name')

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/ClickOnConfimButton'))

WebUI.delay(5)

dbConnection = CustomKeywords.'com.web.db.Validate_g_subscription.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url,
	GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

String query = ('select * from g_subscription where FARECARD = \'' + actualCardNumber) + '\' order by FARECARD desc;'

fromDBUserID = CustomKeywords.'com.web.db.Validate_g_subscription.get_USER_ID_from_p_sub_Table'(dbConnection, query)

WebUI.verifyEqual(userEmail, fromDBUserID)

fareCard = CustomKeywords.'com.web.db.Validate_g_subscription.get_FareCardNumber'(dbConnection, query)

WebUI.verifyEqual(actualCardNumber, fareCard)

dbAmount = CustomKeywords.'com.web.db.Validate_g_subscription.get_Amount'(dbConnection, query)

WebUI.verifyEqual(dbAmount, dbAmount)

dbStatus = CustomKeywords.'com.web.db.Validate_g_subscription.get_Status'(dbConnection, query)

WebUI.verifyEqual('1', dbStatus)

ttID = CustomKeywords.'com.web.db.Validate_g_subscription.get_TT_ID'(dbConnection, query)

WebUI.verifyEqual('24701', ttID)

paymentcardNum = CustomKeywords.'com.web.db.Validate_g_subscription.get_PaymentCardNumber'(dbConnection, query)

WebUI.verifyEqual(lastFourDigitsPymtcardNum, paymentcardNum)

paymentcardName = CustomKeywords.'com.web.db.Validate_g_subscription.get_Paymethod_ID'(dbConnection, query)

WebUI.verifyEqual(cardNickname, paymentcardName)

WebUI.delay(Integer.parseInt(GlobalVariable.RefundDelayTime))

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Tickets'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Tickets'),
	'Tickets:')

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Yes'),
	'Yes')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

dbConnection1 = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url,
	GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

String queryforp_SubscriptionTable = ((('select * from p_subscription_trx  where USER_ID= \'' + userEmail) + '\' and RETRY_COMMENT=\'') +
'Success') + '\' order by USER_ID desc;'//CREATED_DATE

//String queryforp_SubscriptionTable = ('select * from p_subscription_trx  order by  USER_ID= \'' + userEmail)+ '\'  desc;'
userID_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_USER_ID_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual(userEmail, userID_from_P_SUB_TRNX_Table)

Amount_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_Amount_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual(dbAmount, Amount_from_P_SUB_TRNX_Table)

pay_REFID_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_PAY_REF_ID_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual(paymentcardName, pay_REFID_from_P_SUB_TRNX_Table)

creditCardNumber_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_Credit_Card_Number_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual(lastFourDigitsPymtcardNum, creditCardNumber_from_P_SUB_TRNX_Table)

retryCount_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_Retry_Count_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual('1', retryCount_from_P_SUB_TRNX_Table)

retryComment_from_P_SUB_TRNX_Table = CustomKeywords.'com.web.db.Validate_p_subscription_trx.get_Retry_Comment_from_p_subscription_TRNX_Table'(
	dbConnection1, queryforp_SubscriptionTable)

WebUI.verifyEqual('Success', retryComment_from_P_SUB_TRNX_Table)

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/button_Auto Reload'),
	0)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/button_Auto Reload'))

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/ticketsTab'))

WebUI.scrollToElement(findTestObject('Fare_Card_Refund_Object_Repo/AutoReloadCancelButton'), 0)

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/AutoReloadCancelButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/CancelAutoReloadYesBTN'), FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/button_TRX. History'),
	0)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/button_TRX. History'))

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Refund'),
	'Refund')

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Refund'))

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/span_Refund Policy'),
	'Refund Policy')

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/button_Yes'))

WebUI.delay(Integer.parseInt(GlobalVariable.RefundDelayTime))

println('Test Passed Successfully....')

WebUI.closeBrowser()


