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

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Monthly'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Weekly pass adult-radion button'))

String getRefundValue = WebUI.getText(findTestObject('full_refund_Rail_10_trip/full_refund_Rail_10_trip/Refund amount-select ticket page'))

String passValue = getRefundValue.substring(1, getRefundValue.length())

double formatedPassValue = Double.parseDouble(passValue)

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

WebUI.verifyElementText(findTestObject('full_refund_Rail_10_trip/Pop ups/paragraph-weekly-refund policy pop up'), 'Prior to the first business day of the calendar month/week you will receive a full refund. After the start of the month/week, if the refund is requested immediately following the purchase, the full amount charged for the monthly/weekly pass will be refunded. For all other refunds, the cost of two one-way tickets will be deducted from the refund amount for each business day you had the pass.')

WebUI.verifyElementText(findTestObject('full_refund_Rail_10_trip/Pop ups/Paragraph2-10Trip-Refund policy pop up'), 'After refund, the ticket(s) will not be available for use. Do you want to continue?')

WebUI.verifyElementPresent(findTestObject('full_refund_Rail_10_trip/Pop ups/No button-Refund policy pop up'), 0)

WebUI.verifyElementPresent(findTestObject('full_refund_Rail_10_trip/Pop ups/Yes button -Refund policy pop up'), 0)

WebUI.comment('Our Validation is completed successfully and we are doing refund to avoid next test case failures.')

WebUI.click(findTestObject('full_refund_Rail_10_trip/Pop ups/Yes button -Refund policy pop up'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(60)

