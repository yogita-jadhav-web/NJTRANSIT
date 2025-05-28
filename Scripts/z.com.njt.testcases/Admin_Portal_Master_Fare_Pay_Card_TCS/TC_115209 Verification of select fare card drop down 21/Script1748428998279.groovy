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

WebUI.click(findTestObject('Object Repository/FarePay_Card_ObjectRepo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('Object Repository/FarePay_Card_ObjectRepo/FarePayCard_TAB'))

String farePayCardNumber = WebUI.getText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String actualCardNumber = farePayCardNumber.replaceAll('-', '')

println(actualCardNumber)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_Add FARE-PAY Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details'), [:], FailureHandling.STOP_ON_FAILURE)

String farePayCardNumber2 = WebUI.getText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String actualCardNumber2 = farePayCardNumber2.replaceAll('-', '')

println(actualCardNumber2)

not_run: WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/validate_multiple_FP_Cards'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/click_Farecard_dropdown_adminpage'))

WebUI.selectOptionByIndex(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/click_Farecard_dropdown_adminpage'), 
    1)

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

println('Test Execution completed here,now unregistering the extra fare card that we added in further steps')

WebUI.switchToWindowIndex(0)

WebUI.delay(0)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.closeBrowser()

