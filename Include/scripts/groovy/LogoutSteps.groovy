import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LogoutSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am already login")
	def alreadyLogin() {
		Mobile.startApplication('C:\\Users\\Dell\\Downloads\\app-release.apk', false)
		Mobile.tap(findTestObject('Object Repository/login_page_btn'), 0)
		Mobile.tap(findTestObject('Object Repository/Email_login_txt'), 0)
		Mobile.setText(findTestObject('Email_login_txt'), 'ujang@umail.com', 10)
		Mobile.tap(findTestObject('Password_login_txt'), 10)
		Mobile.setText(findTestObject('Password_login_txt'), 'ujang123', 10)
		Mobile.tap(findTestObject('Object Repository/login_login_btn'), 0)

		Mobile.verifyElementExist(findTestObject('home_title'), 10)
	}

	@When("I click Logout button")
	def clickLogoutButton() {
		Mobile.tap(findTestObject('Object Repository/logout_btn'), 0)
	}
}