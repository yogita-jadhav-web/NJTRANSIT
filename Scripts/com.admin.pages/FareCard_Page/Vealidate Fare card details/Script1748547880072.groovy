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

WebUI.verifyElementPresent(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_FarePayCard_Number'), 0)

String farePayCardNumber_admin = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Admin_FarePayCard_Number'))

String actualCardNumber_admin = farePayCardNumber_admin.replaceAll('-', '')

println(actualCardNumber_admin)

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

