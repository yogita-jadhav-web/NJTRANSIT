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

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_buy_tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Select_Tariff_Type_From_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/Monthly radio button-Bus'))

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_to_Checkout_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Proceed_To_Pay_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'), 
    10)

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'))

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund'))

WebUI.verifyElementPresent(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund Policy'), 
    0)

WebUI.click(findTestObject('full_refund_Rail_10_trip/Pop ups/Yes button -Refund policy pop up'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/pop up-2'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_Refund Pending'), 
    0)

WebUI.refresh()

WebUI.delay(3)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_on_buy_tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Buy_Tickets_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Select_Tariff_Type_From_Bus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Select_Tickets_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/Monthly radio button-Bus'))

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Proceed_to_Checkout_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Proceed_To_Pay_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/div_You are only allowed to purchase one ticket per validity period'), 
    6)

