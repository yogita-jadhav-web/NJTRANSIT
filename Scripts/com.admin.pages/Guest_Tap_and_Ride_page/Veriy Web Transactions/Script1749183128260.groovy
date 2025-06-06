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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/Transaction_trx_no_firstRow_data'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/th_transaction_type_value-firstRow_data'), 
    0)

// Step 1: Get the transaction type value from the first row
TestObject transactionTypeObj = findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/th_transaction_type_value-firstRow_data')

String transactionType = WebUI.getText(transactionTypeObj)

// Step 2: Decision logic
if (transactionType.equalsIgnoreCase('web')) {
    println('Transaction type is \'web\'. Proceeding to click the web link.')

    TestObject transactionNumberObj = findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/Transaction_trx_no_firstRow_data')

    WebElement txnNumElement = WebUiCommonHelper.findWebElement(transactionNumberObj, 10)

    // Step 3: Check if it is a hyperlink
    // ✅ Step 3: Use getTagName() on Selenium WebElement
    String tagName = txnNumElement.getTagName()

    String parentTag = txnNumElement.findElement(By.xpath('..')).getTagName()

    if (tagName.equalsIgnoreCase('a') || parentTag.equalsIgnoreCase('a')) {
        KeywordUtil.markFailed('❌ Transaction number is a hyperlink — should NOT be for type \'web\'.')
    } else {
        println('✅ Transaction number is NOT a hyperlink.')
    }
} else {
    println('ℹ️ Transaction type is not \'web\'. No validation needed.')
}

