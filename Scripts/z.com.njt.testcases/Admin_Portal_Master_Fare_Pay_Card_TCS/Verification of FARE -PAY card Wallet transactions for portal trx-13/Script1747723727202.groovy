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

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FarePay_Card_ObjectRepo/ProfileTAB'))

String userEmail = WebUI.getText(findTestObject('Object Repository/FarePay_Card_ObjectRepo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('Object Repository/FarePay_Card_ObjectRepo/FarePayCard_TAB'))

String farePayCardNumber = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String portalCardStatus = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Card_Status'))

String portalCardValue = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Card_Value'))

String actualCardNumber = farePayCardNumber.replaceAll('-', '')

println(actualCardNumber)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/button_Bus'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/path'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/li_2-Jersey City - Journal Square - Secaucus'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/span_Select Tickets'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/input_Fare_rj'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Page_Fare-Pay Dashboard  NJ Transit/span_Proceed To Checkout'))

WebUI.click(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/CardValuePaymentRadioBTN'))

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Proceed To Pay'), 0)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Proceed To Pay'))

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'), 10)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/th_ActionStatus'), 'Action/Status')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('com.njt.web.db/Verify_trx_type_and_bos_data'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund'), 'Refund')

String PortaltransactionTime = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Tranx_Time'))

String PortaltransactionID = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Trnx_ID'))

String PortalticketType = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Ticket_Type'))

String Portalproduct = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_product_Name'))

String Portalroute = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Route_Name'))

String formattedPortalroute = Portalroute.replace('-', ' TO ')

String PortalticketExpiration = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_TicketExp_Time'))

String Portalamount = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_trnx_Amount'))

String PortalpaymentType = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Payment_Type'))

WebUI.delay(2)

WebUI.refresh()

String portalActiveTickets = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Active_Tickets'))

WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.ADMIN_PORTAL_URL) + '\', \'_blank\')', [])

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/input_Guest - FARE-PAY Card_emailId'), userEmail)

WebUI.click(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/button_Search'))

WebUI.click(findTestObject('Object Repository/FarePay_Card_ObjectRepo/ClickOnEmail_fromAdmin'))

WebUI.click(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/button_FARE-PAY Card'))

String AdminfarePayCardNumber = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_FarePayCard_Number'))

String AdminCardValueAmount = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_CardValue_Amount'))

String AdminCardStatus = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Card_Status'))

String AdminActiveTickets = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Active_Tickets'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Select FARE-PAY Card'), 
    'Select FARE-PAY Card')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Card Number'), 
    'Card Number:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Card Value'), 
    'Card Value')

WebUI.scrollToElement(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Auto Reload'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Auto Reload'), 
    'Auto Reload:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Active Tickets'), 
    'Active Tickets:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Future Tickets'), 
    'Future Tickets:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Card Value'), 
    'Card Value')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Tickets'), 'Tickets')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Card Status'), 
    'Card Status:')

WebUI.scrollToElement(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/button_Hotlist FARE-PAY Card'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/button_Hotlist FARE-PAY Card'), 
    'Hotlist FARE-PAY Card')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/button_Get Transactions History'), 
    'Get Transactions History')

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/button_Get Transactions History'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(200, 400)

String AdmintransactionTime = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Tranx_Time_and_and_Date'))

String FormattedAdmintransactionTime = AdmintransactionTime.replace(' |', '')

String AdmintransactionID = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Tranx_ID'))

String AdminticketType = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Ticket_Type'))

String Adminproduct = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Product_Name'))

String Adminroute = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Route'))

String AdminticketExpiration = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_ticket_Expiry'))

String FormattedAdminticketExpiration = AdminticketExpiration.replace(' |', '')

String Adminamount = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_trnx_Amount'))

String AdminpaymentType = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_Payment_Type'))

String AdminactionStatus = WebUI.getText(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/button_TR'))

WebUI.verifyEqual(farePayCardNumber, AdminfarePayCardNumber)

WebUI.verifyEqual(portalCardStatus, AdminCardStatus)

WebUI.verifyEqual(portalActiveTickets, AdminActiveTickets)

WebUI.verifyEqual(portalCardValue, AdminCardValueAmount)

WebUI.verifyEqual(PortaltransactionTime, FormattedAdmintransactionTime)

WebUI.verifyEqual(PortaltransactionID, AdmintransactionID)

WebUI.verifyEqual(PortalticketType, AdminticketType)

WebUI.verifyEqual(Portalproduct, Adminproduct)

not_run: WebUI.verifyEqual(formattedPortalroute.toLowerCase(), Adminroute.toLowerCase())

WebUI.verifyEqual(PortalticketExpiration, FormattedAdminticketExpiration)

WebUI.verifyEqual(Portalamount, Adminamount)

WebUI.verifyEqual(PortalpaymentType, AdminpaymentType)

WebUI.verifyEqual(AdminactionStatus, 'TR')

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'), 10)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'))

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund'))

WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund Policy'), 'Refund Policy')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_Yes'))

WebUI.delay(Integer.parseInt(GlobalVariable.RefundDelayTime))

WebUI.closeBrowser()

