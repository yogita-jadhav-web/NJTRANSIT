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

WebUI.click(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Verify Email  NJ Transit/input_securityCode'))

Mas_DB_Connection = CustomKeywords.'com.masqa.db.NJT_Mas_Database.get_MySQL_Mas_DBConnection'(GlobalVariable.NJT_Mas_DB_Url, 
    GlobalVariable.NJT_Mas_DB_UserName, GlobalVariable.NJT_Mas_DB_Password)

OTP_Value = CustomKeywords.'com.masqa.db.NJT_Mas_Database.get_Expired_OTP_from_DB'(Mas_DB_Connection, GlobalVariable.randomEmail)

WebUI.setText(findTestObject('Object Repository/UserRegistration_object_Repository/Page_Verify Email  NJ Transit/input_securityCode'), 
    OTP_Value)

WebUI.callTestCase(findTestCase('com.login.page/Click_Verify_Verification_Code_Button'), [:], FailureHandling.STOP_ON_FAILURE)

