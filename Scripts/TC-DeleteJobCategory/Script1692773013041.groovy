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

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/a_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.verifyElementPresent(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/span_AdminUser Management'), 
    0)

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/a_Job Categories'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/jobCategory')

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 'BA SCM2')

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_Save'))

WebUI.waitForElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 
    10)

WebUI.verifyElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_BA SCM_oxd-icon-button oxd-table-cel_0ca3f8'))

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_Yes, Delete'))

WebUI.waitForElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 10)

WebUI.verifyElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

WebUI.delay(3)

WebUI.click(findTestObject('AddJobCategory/Page_OrangeHRM/Page_OrangeHRM/i_Sales2_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('AddJobCategory/Page_OrangeHRM/Page_OrangeHRM/i_Sales4_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('Object Repository/AddJobCategory/Page_OrangeHRM/button_Yes, Delete'))

WebUI.waitForElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'), 10)

WebUI.verifyElementVisible(findTestObject('AddJobCategory/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

WebUI.closeBrowser()

