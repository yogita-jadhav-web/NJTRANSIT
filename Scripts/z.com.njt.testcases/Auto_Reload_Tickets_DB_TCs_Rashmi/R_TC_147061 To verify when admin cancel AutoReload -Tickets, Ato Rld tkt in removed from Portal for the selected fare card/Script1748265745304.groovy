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

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/ProfileTAB'))

WebUI.click(findTestObject('FarePay_Card_ObjectRepo/FarePayCard_TAB'))

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_tickets_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Select_Bus_from_select_ticket_dropdown'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin portal _TC_objectRepo/input_route'), '22')

WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_continue_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/select_monthly_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/img_credit_card'))

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_confirm_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_FARE-PAY Card'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Auto Reload'), 
    'Auto Reload:')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Tickets'), 
    'Tickets')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/div_YES'), 
    'YES')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/div_YES'))

WebUI.scrollToElement(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Auto Reload_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Auto Reload_1'), 
    'AUTO RELOAD')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Ticket Details'), 
    'Ticket Details:')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Cancel Ticket'), 
    'Cancel Ticket')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Cancel Ticket'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Create Note'), 
    'Create Note')

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/textarea_hi ticket'), 
    'hi ticket')

WebUI.verifyElementClickable(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/div_NO'), 
    'NO')

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/span_Tickets'), 
    'Tickets:')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/span_No'), 
    'No')

