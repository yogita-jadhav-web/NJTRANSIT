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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.callTestCase(findTestCase('com.admin.pages/Guest_Tap_and_Ride_page/Verify_CC_Card_Logos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/CC_card_Input field'), 0)

String displayedDay = WebUI.getText(findTestObject('Admin-Portal-Guest-Tap-And-Ride/date'), FailureHandling.STOP_ON_FAILURE).trim()

//  Get today's day from system date in "dd" format
String currentDay = new SimpleDateFormat('dd').format(new Date())

// Compare both values
if (displayedDay == currentDay) {
    println('Displayed day matches today\'s date.')
} else {
    println('Displayed day does NOT match today\'s date.')
}

String DisplayedYear = WebUI.getText(findTestObject('Admin-Portal-Guest-Tap-And-Ride/year'), FailureHandling.STOP_ON_FAILURE).trim()

// Get the current year in 'yy' format
String currentYear = new SimpleDateFormat('yy').format(new Date() // e.g., "25"
    )

// Compare both
if (DisplayedYear == currentYear) {
    println('Displayed year matches the current year in YY format.')
} else {
    println('Displayed year does NOT match the current year.')
}

WebUI.verifyElementNotClickable(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/Search button_admin'))

