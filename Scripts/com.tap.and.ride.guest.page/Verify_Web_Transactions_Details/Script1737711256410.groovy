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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String td_DateTime = WebUI.getText(findTestObject('Object Repository/Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/td_DateTime'), 
    FailureHandling.STOP_ON_FAILURE)

println('td_DateTime :' + td_DateTime)

KeywordUtil.logInfo("Date/Time: $td_DateTime")

TestObject trxNoElement = findTestObject('Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/button_Trip_Trx_No')

String trx_Number = WebUI.getText(trxNoElement, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("trx_Number: $trx_Number")

println('trx_Number : ' + trx_Number)

String tagName = WebUI.getAttribute(trxNoElement, 'tagName')

// Validate that the Trx No. is not a hyperlink
if (tagName.equalsIgnoreCase('a')) {
    println('Validation Failed: Trx No. is a hyperlink.')
} else {
    println('Validation Passed: Trx No. is not a hyperlink.')
}

String td_Type = WebUI.getText(findTestObject('Object Repository/Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/td_Type'), 
    FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("td_Type: $td_Type")

println('td_Type :' + td_Type)

String td_Amount = WebUI.getText(findTestObject('Object Repository/Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/td_Amount'), 
    FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("td_Amount: $td_Amount")

println('td_Amount :' + td_Amount)

String status = WebUI.getText(findTestObject('Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/div_Approved'))

KeywordUtil.logInfo("status: $status")

String td_PaymentProviderNumber = WebUI.getText(findTestObject('Object Repository/Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/td_PaymentProviderNumber'), 
    FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo("td_PaymentProviderNumber: $td_PaymentProviderNumber")

println('td_PaymentProviderNumber :' + td_PaymentProviderNumber)

TestObject printCell = findTestObject('Object Repository/Trx_object_repository/Page_Tap  Ride Dashboard  NJ Transit/td_Reversed')

String cellContent = WebUI.getText(printCell)

// Validate the cell content is empty or has a specific value
if (cellContent.isEmpty() || (cellContent.trim() == '')) {
    println('Validation Passed: Print receipt icon is absent.')
} else {
    println('Validation Failed: Unexpected content in the cell.')
}

WebUI.comment('print receipt icon is absent')

