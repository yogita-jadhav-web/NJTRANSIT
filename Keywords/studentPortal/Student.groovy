package studentPortal

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import io.netty.util.internal.ThreadLocalRandom

public class Student {

	@Keyword
	public String randomSpecialCharacters(int limit) {
		// List of special characters
		String specialChars = "~`!@#_-+={[}]|:<,>.?/";
		// Create a Random object
		Random random = new Random();
		// StringBuilder to accumulate the 8 special characters
		StringBuilder randomString = new StringBuilder(8);
		// Generate 8 random special characters
		for (int i = 0; i < limit; i++) {
			char randomSpecialChar = specialChars.charAt(random.nextInt(specialChars.length()));
			randomString.append(randomSpecialChar);
		}
		return randomString.toString();
	}

	@Keyword
	public String randomMonthGenerator() {
		int monthNumber = ThreadLocalRandom.current().nextInt(1, 13);

		// Format with leading zero
		String formattedMonth = String.format("%02d", monthNumber);
		return formattedMonth;
	}

	@Keyword
	public String randomDateGenerator() {
		Random random = new Random();

		// Generate a random date between 1 and 31
		int date = random.nextInt(31) + 1;

		// Format with leading zero if needed
		String formattedDate = String.format("%02d", date);
		return formattedDate;
	}

	@Keyword
	public void validateZIPCODE_BasedOnSelectedDropDown(String CountryXpath,String country,String zipCode) {
		// Step 1: Select a country from the dropdown (example: USA)
		String country1 = country

		WebUI.selectOptionByLabel(findTestObject(CountryXpath), country1, false)

		// Step 2: Enter the zip code (assume the user input is captured)
		String enteredZipCode = zipCode  // For example, USA zip code

		// Step 3: Define a method to validate zip code length based on selected country
		boolean isZipCodeValid = false

		switch(country) {
			case 'United States (US)':
			// Validate USA zip code (length should be 5)
				isZipCodeValid = enteredZipCode.length() == 5
				break
			case 'India':
			// Validate India zip code (length should be 6)
				isZipCodeValid = enteredZipCode.length() == 6
				break
			case 'Canada':
			// Validate Canada zip code (length should be 6, considering the format 'A1A 1A1')
			// Removing space to check length
				enteredZipCode = enteredZipCode.replace(" ", "")
				isZipCodeValid = enteredZipCode.length() == 6
				break
			default:
				WebUI.comment("No validation logic for the selected country.")
				break
		}

		// Step 4: Check if the zip code is valid for the selected country
		if (isZipCodeValid) {
			WebUI.comment("Zip code is valid for " + country1)
		} else {
			WebUI.comment("Zip code is invalid for " + country1)
		}
	}
}
