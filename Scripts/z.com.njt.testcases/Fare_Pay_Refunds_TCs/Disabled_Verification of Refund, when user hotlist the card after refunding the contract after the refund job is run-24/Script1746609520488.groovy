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

not_run: String farePayCardNumber = WebUI.getText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

not_run: String actualCardNumber = farePayCardNumber.replaceAll('-', '')

not_run: println(actualCardNumber)

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_Buy Tickets'), 0)

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_Buy Tickets'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input__origin'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/li_Allenhurst'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input__destination'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/li_Annandale'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Select Tickets'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input_Fare_re'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Proceed To Checkout'))

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/addNewCardRadioButton'))

not_run: String randomString = CustomKeywords.'kw_web.kw_Random.generateRandomString'(5)

not_run: WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input_concat(Cardholder, , s Name)_ccHolderName'), 
    randomString)

not_run: WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input_Card Number_ccDigits'), GlobalVariable.Visa_CC)

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/expYear'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/li_2032'))

not_run: WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input_CVV_cvv'), GlobalVariable.CC_Cvv)

not_run: String randomZipCode = CustomKeywords.'kw_web.kw_Random.generateRandomNDigitNumber'(5)

not_run: WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/input_Zip Code_zip'), randomZipCode)

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Proceed To Pay'))

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Proceed To Pay'))

not_run: WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'), 10)

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_TRX. History'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/th_ActionStatus'), 'Action/Status')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund'), 'Refund')

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/span_Refund Policy'), 'Refund Policy')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_No'), 'NO')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_Yes'), 'YES')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/button_Yes'))

not_run: String referenceNumber = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/reference'))

not_run: println(referenceNumber)

not_run: String[] parts = referenceNumber.split(': ')

not_run: String textPart = parts[0]

not_run: String actualRefnumberPart = parts[1]

not_run: println(actualRefnumberPart)

not_run: WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.ADMIN_PORTAL_URL) + '\', \'_blank\')', [])

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Guest_FarePayCard_TAB'))

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/farePayCardNumberSearchField'), actualCardNumber)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/searchButton'))

not_run: WebUI.scrollToElement(findTestObject('Fare_Card_Refund_Object_Repo/hotlistFarePayCard'), 10)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/hotlistFarePayCard'))

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/hotListDropDown'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/hotListReason'))

not_run: String commentBoxText = CustomKeywords.'kw_web.kw_Random.generateRandomString'(10)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/commentBoxText'), commentBoxText)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/saveButton'))

not_run: WebUI.delay(1)

not_run: String succesfulHotlistText = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/succesfulHotListText'))

not_run: WebUI.verifyEqual(succesfulHotlistText, 'Hotlist Fare Card is successful')

not_run: WebUI.switchToWindowIndex(0)

not_run: String hotListStatus = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/hotListStatusnCustomerPortal'))

not_run: WebUI.verifyEqual(hotListStatus, 'Defective')

not_run: WebUI.delay(60)

not_run: dbConnection = CustomKeywords.'com.web.db.NJT_Web_Database_Refunds.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url, 
    GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

not_run: String query = ('select * from p_web_trx_refunds where ID = \'' + actualRefnumberPart) + '\' order by ID desc;'

not_run: fromDBReferenceNumber = CustomKeywords.'com.web.db.NJT_Web_Database_Refunds.get_Reference_ID_Details'(dbConnection, 
    query)

not_run: WebUI.verifyEqual(actualRefnumberPart, fromDBReferenceNumber)

not_run: refundStatusfromDB = CustomKeywords.'com.web.db.NJT_Web_Database_Refunds.get_REFUND_STATUS_Details'(dbConnection, 
    query)

not_run: println('Refund Status' + refundStatusfromDB)

not_run: WebUI.verifyEqual('REJECTED', refundStatusfromDB)

not_run: refundAmountfromDB = CustomKeywords.'com.web.db.NJT_Web_Database_Refunds.get_REFUND_AMOUNT_Details'(dbConnection, 
    query)

not_run: WebUI.verifyEqual(refundAmountfromDB, 0)

not_run: WebUI.comment('Test Verification is Completed to Avoid Next Test case Failure again UnHotlist the Card.....')

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.refresh()

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/Guest_FarePayCard_TAB'))

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/farePayCardNumberSearchField'), actualCardNumber)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/searchButton'))

not_run: WebUI.scrollToElement(findTestObject('Fare_Card_Refund_Object_Repo/unHotlistFareCard'), 10)

not_run: WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/commentBoxText'), commentBoxText)

not_run: WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/saveButton'))

not_run: WebUI.delay(1)

//String succesfulHotlistText = WebUI.getText(findTestObject('Fare_Card_Refund_Object_Repo/UnHotListText'))
//WebUI.verifyEqual(succesfulHotlistText, 'De-Hotlist Fare card is successful')
not_run: WebUI.closeBrowser()

