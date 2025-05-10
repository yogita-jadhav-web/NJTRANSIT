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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import custom.JSUtils as JSUtils
import org.openqa.selenium.By as By


dbconnection = CustomKeywords.'com.web.db.NJT_Reload_Database.get_MySQL_Web_DBConnection'(GlobalVariable.NJT_Web_DB_Url, 
    GlobalVariable.NJT_Web_DB_UserName, GlobalVariable.NJT_Web_DB_Password)

dbrefundstatus = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStatus'(dbconnection, query)

WebUI.verifyEqual('COMPLETED', dbrefundstatus)

WebUI.verifyEqual(refundAmountInCents, dbRefundAmount)

dbAppType = CustomKeywords.'com.web.db.NJT_Reload_Database.getAppTypeDetails'(dbconnection, query)

WebUI.verifyEqual(actualRefnumberPart, dbReferenceID)

WebUI.verifyEqual('2', dbAppType)

dbRefundState = CustomKeywords.'com.web.db.NJT_Reload_Database.getRefundStateDetails'(dbconnection, query)

WebUI.verifyEqual('2', dbRefundState)

dbComments = CustomKeywords.'com.web.db.NJT_Reload_Database.getCOMMENTSDetails'(dbconnection, query)

WebUI.verifyEqual('Refund Completed', dbComments)

// Compare the dates
WebUI.verifyEqual(uiRefundDate, dbRefundDate)

