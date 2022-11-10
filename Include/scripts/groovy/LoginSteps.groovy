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



class LoginSteps {
	
	String title;
	@When("I click Login page button")
	def clickLoginPageButton() {
		Mobile.tap(findTestObject('Object Repository/login_page_btn'), 0)
	}
	
    @And("I input username (.*)")
	def inputUsernameLogin(String username) {
		Mobile.verifyElementExist(findTestObject('login_title'), 10)
		
//		title = Mobile.getAttribute(findTestObject('login_title'), 'contentDescription', 10)
//		
//		Mobile.verifyMatch(title, 'Login', false)
		Mobile.tap(findTestObject('Object Repository/Email_login_txt'), 0)
		Mobile.setText(findTestObject('Email_login_txt'), username, 10)
		
	}
    @And("I input password (.*)")
	def inputPasswordLogin(String password) {
		Mobile.tap(findTestObject('Password_login_txt'), 10)		
		Mobile.setText(findTestObject('Password_login_txt'), password, 10)		
	}
		
	@And("I click Login button")
	def clickLoginButton() {
		Mobile.tap(findTestObject('Object Repository/login_login_btn'), 0)
	}
    @Then("I am on homepage")
	def IAmOnHomepage() {
		Mobile.verifyElementExist(findTestObject('home_title'), 10)
		
//		title = Mobile.getAttribute(findTestObject('home_title'), 'contentDescription', 10)
//		
//		Mobile.verifyMatch(title, 'Products', false)
		
		Mobile.closeApplication()	
	}
	
	@Then("I am on Login page")
	def onLoginPage() {
		Mobile.verifyElementExist(findTestObject('login_title'), 10)
		
		title = Mobile.getAttribute(findTestObject('login_title'), 'contentDescription', 10)
		
		Mobile.verifyMatch(title, 'Login', false)
		
		Mobile.closeApplication()
	}

	
}