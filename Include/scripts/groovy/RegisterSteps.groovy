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



class RegisterSteps {
	String title;

	@And("I click Register page button")
	def clickRegisterPageButton() {
		Mobile.tap(findTestObject('Object Repository/register_page_btn'), 0)
	}

	@And("I input new fullname (.*)")
	def inputNewFullnameLogin(String fullname) {
		Mobile.verifyElementExist(findTestObject('Register_btn'), 10)
		Mobile.tap(findTestObject('Object Repository/Fullname_register_txt'), 0)
		Mobile.setText(findTestObject('Fullname_register_txt'), fullname, 10)
	}

	@And("I input new username (.*)")
	def inputNewUsernameLogin(String username) {
		Mobile.tap(findTestObject('Object Repository/Email_register_txt'), 0)
		Mobile.setText(findTestObject('Email_register_txt'), username, 10)
	}
	@And("I input new password (.*)")
	def inputNewPasswordLogin(String password) {
		Mobile.tap(findTestObject('Password_register_txt'), 10)
		Mobile.setText(findTestObject('Password_register_txt'), password, 10)
	}

	@And("I click Register button")
	def clickRegisterButton() {
		Mobile.tap(findTestObject('Object Repository/Register_btn'), 0)
	}

	@Then("I am on Register page")
	def onRegisterPage() {
		Mobile.verifyElementExist(findTestObject('Register_btn'), 10)
		Mobile.closeApplication()
	}
}