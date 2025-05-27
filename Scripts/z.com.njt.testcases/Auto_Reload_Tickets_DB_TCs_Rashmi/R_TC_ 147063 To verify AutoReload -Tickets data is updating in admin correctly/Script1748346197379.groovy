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

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Add_Value'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_Auto_Reload_Button'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/validate_card_value_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/click_on_tickets_tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/velidate_selected_ticket_details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.auto.reload.page/validate_selected_plan'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('com.auto.reload.page/validate_select_ticket_dropdown_Options'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_Select Ticket'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_Bus'), 
    'Bus')

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_Bus'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input__route'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input__route'))

not_run: WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input__route'), 
    '22')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'), 
    '22-North Bergen - Union City - Hoboken')

not_run: select_rout = WebUI.getText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_22-North Bergen - Union City - Hoboken'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_1'), 
    '1')

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_Confirm_MuiBackdrop-root MuiBackdrop-in_dc6c6c'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_1'), 
    '1')

not_run: WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_1'))

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/button_Continue'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Select Plan_planMethods'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_Monthly Adult  - 67.00'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_Monthly Adult  - 67.00'), 
    'Monthly Adult - $67.00')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Select Plan_planMethods'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_AVymsu(XXXX XXXX XXXX 0286)_paymentMethods'))

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_concat(Cardholder, , s Name)_ccHolderName'), 
    'ASDD')

WebUI.setEncryptedText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Card Number_ccDigits'), 
    'gECNrpRrZE8c58gpTl5H5m8EM7csNIO/')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Card Number_ccDigits'), 
    '')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_2034'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/li_2028'))

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_CVV_cvv'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Zip Code_zip'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Card Nickname_cardName'), 
    'VISA')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/input_Card Nickname_cardName'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/button_Confirm'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/button_Confirm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Fare-Pay Dashboard  NJ Transit/div_NJ TRANSIT will automatically reload a _c300bc'), 
    0)

WebUI.newTab('')

WebUI.navigateToUrl('https://cmsqa.cmsservices.us/njt-web/')

WebUI.navigateToUrl('https://cmsqa.cmsservices.us/admin-portal/')

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/input__userName'), 
    'rashmi.ks@conduent.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/input__password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Login'))

WebUI.setText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/input_Guest - FARE-PAY Card_emailId'), 
    'rashmi.k@maildrop.cc')

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_Search'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/th_rashmi.kmaildrop.cc'))

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/button_FARE-PAY Card'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Auto Reload'), 
    'Auto Reload')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Ticket Type'), 
    'Ticket Type:')

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Monthly Adult'), 
    'Monthly Adult')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Monthly Adult'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Ticket Details'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Monthly Adult-Bus (Route-NORTH BERGEN - U_efe417'), 
    'Monthly Adult-Bus (Route-NORTH BERGEN - UNION CITY - HOBOKEN | Zones-1)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Monthly Adult-Bus (Route-NORTH BERGEN - U_efe417'), 
    0)

WebUI.click(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Credit Card Number'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_Credit Card Number'), 
    'Credit Card Number:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Portal-Auto Reload Tickets/Page_Conduent Transport Solutions, Inc/p_XXXX-XXXX-XXXX-1111'), 
    0)

