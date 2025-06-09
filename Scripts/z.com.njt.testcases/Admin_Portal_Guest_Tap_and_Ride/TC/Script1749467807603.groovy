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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import java.text.SimpleDateFormat
import java.util.*


// 1. Create a TestObject to select all Date & Time cells (e.g., column 2)
TestObject dateTimeCellsObj = new TestObject("DateTimeCells")
dateTimeCellsObj.addProperty("xpath", ConditionType.EQUALS, "//table/tbody/tr/td[2]")

// 2. Define date format
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss")

// Utility method to fetch and parse dates from the column
List<Date> fetchDateColumnValues(TestObject columnObj, SimpleDateFormat sdf) {
	List<WebElement> elements = WebUiCommonHelper.findWebElements(columnObj, 10)
	List<Date> dates = []
	for (WebElement el : elements) {
		try {
			dates.add(sdf.parse(el.getText().trim()))
		} catch (Exception e) {
			 KeywordUtil.markWarning("⚠️ Invalid date skipped: ${el.getText().trim()}")
		}
	}
	return dates
}

// 3. Fetch original values (before clicking header)
List<Date> originalDates = fetchDateColumnValues(dateTimeCellsObj, sdf)

// 4. Check if original list is in DESCENDING order
List<Date> sortedDescending = new ArrayList<>(originalDates)
Collections.sort(sortedDescending, Collections.reverseOrder())

if (originalDates == sortedDescending) {
	KeywordUtil.markPassed("✅ Initial Date & Time values are in descending order (as expected).")
} else {
	KeywordUtil.markFailed("❌ Initial Date & Time values are NOT in descending order.")
}

// 5. Click on column header to trigger ASC sort
WebUI.click(findTestObject('Object Repository/YourHeader_DateTime'))
WebUI.delay(2)  // wait for UI to update

// 6. Fetch updated values
List<Date> newDates = fetchDateColumnValues(dateTimeCellsObj, sdf)

// 7. Check if new list is in ASCENDING order
List<Date> sortedAscending = new ArrayList<>(newDates)
Collections.sort(sortedAscending)

if (newDates == sortedAscending) {
	KeywordUtil.markPassed("✅ After clicking, Date & Time values are in ascending order.")
} else {
	KeywordUtil.markFailed("❌ After clicking, Date & Time values are NOT in ascending order.")
}
