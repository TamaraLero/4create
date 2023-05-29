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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

for (def index : (0..3)) {
    WebUI.click(findTestObject('Page_GreenKart/button_ADD TO CART Brocolli'))
}

WebUI.click(findTestObject('Page_GreenKart/button_ADD TO CART Carrot'))

WebUI.click(findTestObject('Page_GreenKart/button_ADD TO CART Tomato'))

WebUI.click(findTestObject('Page_GreenKart/button_ADD TO CART Potato'))

WebUI.click(findTestObject('Page_GreenKart/img Chart'))

WebUI.click(findTestObject('Page_GreenKart/div_PROCEED TO CHECKOUT'))

s = WebUI.getText(findTestObject('Page_GreenKart/txt_total amount'))

WebUI.setText(findTestObject('Page_GreenKart/input_Total_promoCode111'), s)

WebUI.click(findTestObject('Page_GreenKart/button_Apply'))

WebUI.click(findTestObject('Page_GreenKart/button_Place Order'))

WebUI.verifyElementHasAttribute(findTestObject('Page_GreenKart/SelectFromCountry'), 'disabled', 0)

WebUI.selectOptionByValue(findTestObject('Page_GreenKart/select_SelectCountry'), 'Algeria', true)

WebUI.click(findTestObject('Page_GreenKart/button_Proceed'))

WebUI.click(findTestObject('Page_GreenKart/input_Choose Country_chkAgree'))

WebUI.click(findTestObject('Page_GreenKart/button_Proceed'))

//
//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
WebUI.sendKeys(findTestObject('Page_GreenKart/logo_greenlogo'), Keys.chord(Keys.CONTROL, 'T'))

WebUI.navigateToUrl('http://www.webdriveruniversity.com/')

WebUI.scrollToElement(findTestObject('Page_GreenKart/section_Actions'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_GreenKart/h1_Actions'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

pageTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(pageTitle, '.*Actions.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Page_GreenKart/DRAG ME TO MY TARGET'), findTestObject('Page_GreenKart/DROP HERE'))

WebUI.verifyElementNotVisible(findTestObject('Page_GreenKart/Link 1'))

WebUI.mouseOver(findTestObject('Page_GreenKart/button_Hover Over Me First'))

WebUI.verifyElementVisible(findTestObject('Page_GreenKart/Link 1'))

WebUI.click(findTestObject('Page_GreenKart/Link 1'))

WebUI.verifyAlertPresent(0)

alertText = WebUI.getAlertText()

WebUI.acceptAlert()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://www.webdriveruniversity.com/Contact-Us/contactus.html')

WebUI.setText(findTestObject('Page_GreenKart/textarea_CONTACT US_message'), alertText)

