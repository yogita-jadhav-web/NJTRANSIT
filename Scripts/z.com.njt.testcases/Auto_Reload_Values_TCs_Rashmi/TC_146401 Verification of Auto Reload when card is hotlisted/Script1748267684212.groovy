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

WebUI.callTestCase(findTestCase('com.profile.page/Delete_Credit_Card_From_Manage_Saved_Payments'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_fare_pay_card_tab'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Add_Value'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/Enter_min_reload_threshold_amounts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_VISA_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_random_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Random_Card_nickname'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_setup_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_FARE-PAY Card'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/p_Auto Reload'), 
    'Auto Reload:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/p_Card Value'), 
    'Card Value')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_YES'), 
    'YES')

not_run: WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_Hotlist FARE-PAY CardGet Transactions History'))

not_run: WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_Card Value  StatusActiveThreshold Amoun_30d6a5'))

not_run: WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_Select FARE-PAY Card6375-0041-0260-7773_094b21'))

WebUI.scrollToElement(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Hotlist FARE-PAY Card'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Hotlist FARE-PAY Card'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/input_Site Map_action'), 
    '')

WebUI.click(findTestObject('Admin_Portal_Hotlisted card/select hotlist reason'))

not_run: WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_Cancel_MuiBackdrop-root MuiBackdrop-inv_f2b7ab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/li_Defective'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/li_Defective'))

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_a'), 
    'a')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_as'), 
    'as')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_asd'), 
    'asd')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_asdd'), 
    'asdd')

WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_asddd'), 
    'asddd')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Save'), 
    'Save')

WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_Hotlist Fare Card is successful'), 
    'Hotlist Fare Card is successful')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_De-Hotlist FARE-PAY Card'), 
    'De-Hotlist FARE-PAY Card')

not_run: WebUI.switchToWindowIndex('1')

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Fare-Pay Dashboard  NJ Transit/span_Defective'), 
    'Defective')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Fare-Pay Dashboard  NJ Transit/span_Card Status'), 
    'Card Status')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Fare-Pay Dashboard  NJ Transit/span_Auto Reload'), 
    'Auto Reload')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Fare-Pay Dashboard  NJ Transit/span_Card Value'), 
    'Card Value:')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Fare-Pay Dashboard  NJ Transit/span_No'), 
    'No')

println('test case get passed')

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Account_Search_with_Email_Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_FARE-PAY Card'))

not_run: WebUI.switchToWindowTitle('Conduent Transport Solutions, Inc.')

not_run: WebUI.rightClick(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_De-Hotlist FARE-PAY Card'))

WebUI.scrollToElement(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_De-Hotlist FARE-PAY Card'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_De-Hotlist FARE-PAY Card'))

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_a'), 
    'a')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_as'), 
    'as')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_ass'), 
    'ass')

not_run: WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_asss'), 
    'asss')

WebUI.setText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/textarea_asssa'), 
    'asssa')

WebUI.click(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/div_De-Hotlist Fare card is successful'), 
    'De-Hotlist Fare card is successful')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Hotlisted card/Page_Conduent Transport Solutions, Inc/button_Hotlist FARE-PAY Card'), 
    0)

