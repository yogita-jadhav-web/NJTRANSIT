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

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Create Note'), 
    'Create Note')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Close'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/div_Action'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/input_Site Map_action'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/label_Hotlist Reason'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Please Select Hotlist Reason'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/div_Comments'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Please provide the reason in the below co_e38858'), 
    'Please provide the reason in the below comments section')

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Your comments must be at least 5 characters'), 
    'Your comments must be at least 5 characters.')

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotListDropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotListReason-defective'))

String commentBoxText = CustomKeywords.'kw_web.kw_Random.generateRandomString'(10)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/commentBoxText'), commentBoxText)

