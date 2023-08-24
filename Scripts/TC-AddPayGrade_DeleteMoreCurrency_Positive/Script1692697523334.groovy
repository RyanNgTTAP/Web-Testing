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

WebUI.click(findTestObject('Object Repository/AddPayGrade/Page_OrangeHRM/a_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.verifyElementPresent(findTestObject('Object Repository/AddPayGrade/Page_OrangeHRM/span_AdminUser Management'), 0)

WebUI.click(findTestObject('Object Repository/AddPayGrade/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/AddPayGrade/Page_OrangeHRM/a_Pay Grades'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewPayGrades')

WebUI.click(findTestObject('AddPayGrade/Page_OrangeHRM/button_Test Grade 1_oxd-icon-button oxd-table-cell-action-space'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/payGrade/6')

WebUI.click(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Albanian Lek_oxd-table-cell oxd-padding-cell'))

WebUI.click(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Afghanistan Afghani_oxd-table-cell oxd-padding-cell'))

WebUI.click(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Yes, Delete'))

WebUI.closeBrowser()

