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

// 📌 1. Define TestObject for all Type column cells (adjust column index if needed)
TestObject typeColumnCells = new TestObject("typeColumnCells")
typeColumnCells.addProperty("xpath", ConditionType.EQUALS, "//table/tbody/tr/th[3]") // assuming 3rd column is Type

// 📌 2. Define TestObject for header to click
TestObject typeColumnHeader = new TestObject("typeColumnHeader")
typeColumnHeader.addProperty("xpath", ConditionType.EQUALS, "//table/thead/tr/th[3]") // assuming 3rd column is Type

// 📌 3. Reusable method to fetch Type text values
List<String> fetchTypeValues(TestObject obj) {
	List<WebElement> elements = WebUiCommonHelper.findWebElements(obj, 10)
	List<String> typeList = []
	for (WebElement el : elements) {
		String text = el.getText().trim()
		if (text) {
			typeList.add(text)
		}
	}
	return typeList
}

// ✅ Step 1: Validate default Z-A (Descending)
List<String> initialTypeList = fetchTypeValues(typeColumnCells)
println "📌 Initial Type List:"
println initialTypeList

List<String> expectedDesc = new ArrayList<>(initialTypeList)
expectedDesc.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER))

if (initialTypeList.equals(expectedDesc)) {
	KeywordUtil.markPassed("✅ Type list is in Descending (Z-A) order by default.")
} else {
	KeywordUtil.markFailed("❌ Default Type list is NOT in Descending (Z-A) order.")
	println "Expected Descending: " + expectedDesc
}

// ✅ Step 2: Click to sort A-Z (Ascending)
WebUI.scrollToPosition(200, 500)
WebUI.click(typeColumnHeader)
WebUI.delay(2)

List<String> ascTypeList = fetchTypeValues(typeColumnCells)
println "🔼 Type List After Click (A-Z):"
println ascTypeList

List<String> expectedAsc = new ArrayList<>(ascTypeList)
expectedAsc.sort(String.CASE_INSENSITIVE_ORDER)

if (ascTypeList.equals(expectedAsc)) {
	KeywordUtil.markPassed("✅ Type list sorted in Ascending (A-Z) order after click.")
} else {
	KeywordUtil.markFailed("❌ Type list NOT sorted in Ascending (A-Z) order.")
	println "Expected Ascending: " + expectedAsc
}

// ✅ Step 3: Click again to sort Z-A (Descending)
WebUI.click(typeColumnHeader)
WebUI.delay(2)

List<String> descTypeList = fetchTypeValues(typeColumnCells)
println "🔽 Type List After Second Click (Z-A):"
println descTypeList

List<String> expectedDescAgain = new ArrayList<>(descTypeList)
expectedDescAgain.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER))

if (descTypeList.equals(expectedDescAgain)) {
	KeywordUtil.markPassed("✅ Type list sorted in Descending (Z-A) order after second click.")
} else {
	KeywordUtil.markFailed("❌ Type list NOT sorted in Descending (Z-A) order after second click.")
	println "Expected Descending Again: " + expectedDescAgain
}

