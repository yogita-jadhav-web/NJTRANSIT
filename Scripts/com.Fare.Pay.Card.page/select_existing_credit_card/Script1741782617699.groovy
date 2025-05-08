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

TestObject credit_card = findTestObject('Object Repository/Page_Fare-Pay Dashboard  NJ Transit/img_credit_card')

def card_name = WebUI.getAttribute(credit_card, 'alt')

TestObject credit_cvv = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/input__cvv')

println('card_name :' + card_name)

CustomKeywords.'com.test.data.kw_card_test_data.fetchCardDetails'(cardType)

if (card_name.equalsIgnoreCase('American Express card')) {
    //American Express card
    WebUI.comment('Existing credit card is visible')

    //	card_name
    WebUI.click(credit_card)

    WebUI.setText(credit_cvv, GlobalVariable.SelectedCardCVV)
} else {
    WebUI.click(credit_card)

    WebUI.setText(credit_cvv, GlobalVariable.SelectedCardCVV)

    WebUI.comment('credit card is not visible')
}

