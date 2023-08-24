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

WebUI.callTestCase(findTestCase('TC_Login_Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddJobTitle/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/AddJobTitle/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/AddJobTitle/Page_OrangeHRM/a_Job Titles'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList')

WebUI.click(findTestObject('Object Repository/AddJobTitle/Page_OrangeHRM/span_Customer Success Manager_oxd-checkbox-_406818'))

WebUI.click(findTestObject('Page_OrangeHRM/span_Odis Adalwin_oxd-checkbox-input oxd-ch_8de85a'))

WebUI.click(findTestObject('AddJobCategory/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('Object Repository/AddJobTitle/Page_OrangeHRM/button_Yes, Delete'))

WebUI.waitForElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 10)

WebUI.verifyElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

WebUI.delay(3)

WebUI.closeBrowser()

