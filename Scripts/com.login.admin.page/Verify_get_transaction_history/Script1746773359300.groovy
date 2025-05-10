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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.interactions.Actions as Actions

WebUI.scrollToElement(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Get Transactions History'), 
    10)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Get Transactions History'))

WebUI.scrollToPosition(100, 400)

/*void scrollByAmount(int pixels) {
	WebDriver driver = DriverFactory.getWebDriver()

	JavascriptExecutor js = (JavascriptExecutor) driver

	js.executeScript("window.scrollBy(0, $pixels);")
}

scrollByAmount(500 // scroll down
    )*/
not_run: WebUI.scrollToElement(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/div_TR'), 
    -500)

//WebUI.scrollToElement(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_TR'), 0)
WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_TR'))

