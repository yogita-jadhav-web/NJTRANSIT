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

// 🔧 Create a TestObject for Trx No cells (adjust column index if needed)
TestObject trxNoCells = new TestObject("trxNoCells")
//trxNoCells.addProperty("xpath", ConditionType.EQUALS, "//table/tbody/tr/th[2]")  // assuming 1st column is Trx No
trxNoCells.addProperty("xpath", ConditionType.EQUALS, "//table/tbody/tr/th[2]")


// 🔧 Create a TestObject for header click
TestObject trxNoHeader = new TestObject("trxNoHeader")
trxNoHeader.addProperty("xpath", ConditionType.EQUALS, "//table/thead/tr/th[2]")  // assuming header column 1

// 🔁 Reusable method to get integer values
List<Integer> fetchTrxNumbers(TestObject obj) {
	List<WebElement> elements = WebUiCommonHelper.findWebElements(obj, 10)
	List<Integer> numbers = []
	for (WebElement el : elements) {
		String text = el.getText().trim()
		if (text.isInteger()) {
			numbers.add(text.toInteger())
		} else {
			KeywordUtil.markWarning("⚠️ Non-numeric Trx No skipped: $text")
		}
	}
	return numbers
}

// ✅ Step 1: Validate initial descending order
List<Integer> initialTrxNos = fetchTrxNumbers(trxNoCells)
println "📌 Initial Trx No list:"
println initialTrxNos.size()
println initialTrxNos

List<Integer> expectedDesc = new ArrayList<>(initialTrxNos)
expectedDesc.sort(Collections.reverseOrder())

/*if (initialTrxNos.equals(expectedDesc)) {
	KeywordUtil.markPassed("✅ Trx No list is in Descending order by default.")
} else {
	KeywordUtil.markFailed("❌ Default Trx No list is not in Descending order.")
}*/

// ✅ Step 2: Click header to sort Ascending
WebUI.scrollToPosition(200, 500)
WebUI.click(trxNoHeader)
WebUI.delay(2)

List<Integer> ascTrxNos = fetchTrxNumbers(trxNoCells)
println "🔼 Trx No list after clicking header (Ascending):"
println ascTrxNos

List<Integer> expectedAsc = new ArrayList<>(ascTrxNos)
expectedAsc.sort()/*

if (ascTrxNos == expectedAsc) {
	KeywordUtil.markPassed("✅ Trx No sorted in Ascending order after click.")
} else {
	KeywordUtil.markFailed("❌ Trx No NOT sorted in Ascending order after click.")
}*/

// ✅ Step 3: Click header again to sort Descending

WebUI.click(trxNoHeader)
WebUI.delay(2)

List<Integer> descAgainTrxNos = fetchTrxNumbers(trxNoCells)
println "🔽 Trx No list after clicking header again (Descending):"
println descAgainTrxNos
/*
List<Integer> expectedDescAgain = new ArrayList<>(descAgainTrxNos)
expectedDescAgain.sort(Collections.reverseOrder())

if (descAgainTrxNos == expectedDescAgain) {
	KeywordUtil.markPassed("✅ Trx No sorted in Descending order after second click.")
} else {
	KeywordUtil.markFailed("❌ Trx No NOT sorted in Descending order after second click.")
}*/
