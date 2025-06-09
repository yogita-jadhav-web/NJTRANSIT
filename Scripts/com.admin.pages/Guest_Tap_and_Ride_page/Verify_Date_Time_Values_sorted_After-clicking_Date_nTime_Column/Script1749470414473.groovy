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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat

// 📌 Define the reusable method to fetch parsed Date objects
// 📌 Prepare column cell locator (adjust td[2] as needed)
TestObject dateTimeCellsObj = new TestObject('DateTimeCells')

dateTimeCellsObj.addProperty('xpath', ConditionType.EQUALS, '//table/tbody/tr/th[1]')

//FailureHandling.STOP_ON_FAILURE)
// 📌 Date format
SimpleDateFormat sdf = new SimpleDateFormat('MM/dd/yyyy | HH:mm:ss')

// ✅ Step 1: Fetch Initial (assumed DESC)
List<Date> initialDates = fetchDateColumnValues(dateTimeCellsObj, sdf)

println('📌 Initial Date & Time values (default):')

initialDates.each({
		println(sdf.format(it))
	})

List<Date> expectedDesc = new ArrayList(initialDates)

Collections.sort(expectedDesc, Collections.reverseOrder())

if (initialDates == expectedDesc) {
	KeywordUtil.markPassed('✅ Initial list is in Descending order.')
} else {
	KeywordUtil.markWarning('⚠️ Initial list is NOT in expected Descending order.')
}

// ✅ Step 2: Click Header to sort Ascending
// 📌 Column header object for clicking
WebUI.scrollToPosition(200, 500)

TestObject headerObj = findTestObject('Object Repository//Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/div_DateTime')
String headerObj_txt=WebUI.getText(headerObj)
println("header_obj_text  is:" +headerObj_txt)
WebUI.click(headerObj)

WebUI.delay(5)

List<Date> afterAscClickDates = fetchDateColumnValues(dateTimeCellsObj, sdf)
println('\n🔽 Date & Time values sorted as  Ascending order after click on Daten time header')

afterAscClickDates.each({
		println(sdf.format(it))
	})
List<Date> expectedAsc = new ArrayList(afterAscClickDates)

Collections.sort(expectedAsc)

if (afterAscClickDates == expectedAsc) {
	KeywordUtil.markPassed('✅ List is sorted in Ascending order after first click.')
} else {
	KeywordUtil.markFailed('❌ Sorting to Ascending failed after click.')
}

// ✅ Step 3: Click Header to sort Descending again
WebUI.click(headerObj)

WebUI.delay(2)

List<Date> afterDescClickDates = fetchDateColumnValues(dateTimeCellsObj, sdf)

println('\n🔽 Date & Time values after sorting Descending again:')

afterDescClickDates.each({
		println(sdf.format(it))
	})

List<Date> expectedDescAgain = new ArrayList(afterDescClickDates)

Collections.sort(expectedDescAgain, Collections.reverseOrder())

if (afterDescClickDates == expectedDescAgain) {
	KeywordUtil.markPassed('✅ List is sorted in Descending order after second click.')
} else {
	KeywordUtil.markFailed('❌ Sorting to Descending failed after second click.')
}

List<Date> fetchDateColumnValues(TestObject columnObj, SimpleDateFormat sdf) {
	List<WebElement> elements = WebUiCommonHelper.findWebElements(columnObj, 10)

	List<Date> dates = []

	for (WebElement el : elements) {
		String text = el.getText().trim()

		try {
			dates.add(sdf.parse(text))
		}
		catch (Exception e) {
			KeywordUtil.markWarning("⚠️ Invalid date skipped: $text")
		}
	}
	
	return dates
}

