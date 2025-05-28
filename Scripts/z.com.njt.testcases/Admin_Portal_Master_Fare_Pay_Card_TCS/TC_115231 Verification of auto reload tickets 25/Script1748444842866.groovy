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

not_run: WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('FarePay_Card_ObjectRepo/ProfileTAB'))

not_run: WebUI.click(findTestObject('FarePay_Card_ObjectRepo/FarePayCard_TAB'))

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_tickets_tab'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/Select_Bus_from_select_ticket_dropdown'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Admin portal _TC_objectRepo/input_route'), '22')

not_run: WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'))

not_run: WebUI.delay(2)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_continue_button'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/select_monthly_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/img_credit_card'))

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_confirm_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.profile.page/Delete_Credit_Card_From_Manage_Saved_Payments'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/ProfileTAB'))

String userEmail = WebUI.getText(findTestObject('FarePay_Card_ObjectRepo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/FarePayCard_TAB'))

String farePayCardNumber = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String actualCardNumber = farePayCardNumber.replaceAll('-', '')

println(actualCardNumber)

WebUI.refresh()

WebUI.delay(5)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

String beforeRefundCartValue = WebUI.getText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Fare_Card_Refund_Object_Repo/cardValue'))

String initialCardValue = beforeRefundCartValue.substring(1, beforeRefundCartValue.length())

String replacedinitialCardValue = initialCardValue.replaceAll('[^\\d.]', '')

double formatedCardValue = Double.parseDouble(replacedinitialCardValue)

println(formatedCardValue)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_tickets_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Select_HBLR_from_select_ticket_dropdown'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_continue_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/monthly adult_option'))

String monthly_Adult_portal_text = WebUI.getText(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/monthly adult_option'))

String monthly_Adult_portal_trim_text = (monthly_Adult_portal_text.split('-')[0]).trim()

println(monthly_Adult_portal_trim_text)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_VISA_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Card_nickname_VISA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Fare-Pay Dashboard  NJ Transit/input_Card_Number'), FailureHandling.STOP_ON_FAILURE)

creditCardNumber = WebUI.getAttribute(findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/input_Card_Number'), 
    'value')

println(creditCardNumber + ' Credit Card Number')

String lastFourDigitsPymtcardNum = creditCardNumber.substring(creditCardNumber.length() - 4)

System.out.println('Last four digits: ' + lastFourDigitsPymtcardNum)

WebUI.click(findTestObject('fareCardNum_ExistingCC/Page_Fare-Pay Dashboard  NJ Transit/input_CardNickname'))

cardNickname = WebUI.getAttribute(findTestObject('fareCardNum_ExistingCC/Page_Fare-Pay Dashboard  NJ Transit/input_CardNickname'), 
    'value')

println(cardNickname + ' Card Nick name')

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_confirm_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Switch to_1st_index_tab and_login_to_ Admin_portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_FARE-PAY Card'))

WebUI.verifyElementText(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Auto Reload_1'), 
    'AUTO RELOAD')

WebUI.verifyElementText(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Ticket Details'), 
    'Ticket Details:')

not_run: WebUI.click(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_XXXX-XXXX-XXXX-0286'))

String creditcardnumber_admin = WebUI.getText(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_XXXX-XXXX-XXXX-0286'), 
    'value')

String lastfourdigit_CCnum_admin = creditcardnumber_admin.split('-')[-1]

println(lastfourdigit_CCnum_admin + ' Credit Card Number')

WebUI.verifyEqual(lastfourdigit_CCnum_admin, lastFourDigitsPymtcardNum)

WebUI.verifyElementPresent(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Ticket Type'), 
    0)

String Ticket_type = WebUI.getText(findTestObject('Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Monthly Adult'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(Ticket_type, monthly_Adult_portal_trim_text)

