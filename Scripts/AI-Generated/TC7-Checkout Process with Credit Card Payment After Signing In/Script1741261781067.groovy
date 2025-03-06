import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link SignIn2 -> Navigate to page 'signin#signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SignIn2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link SignIn2 - Navigate to page signinsignin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Hover over div HomeContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_HomeContent2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Hover over div HomeContent2.png')

"Step 5: Click on image homeProduct (HomeProduct2) -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_homeProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_homeProduct', ['image_homeProduct_divNthChild': image_homeProduct_divNthChild, 'image_homeProduct_divNthOfType': image_homeProduct_divNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on image homeProduct HomeProduct2 - Navigate to page productproduct.png')

"Step 6: Click on div SelectSize"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SelectSize'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div SelectSize.png')

"Step 7: Click on div SizeOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SizeOption'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div SizeOption.png')

"Step 8: Click on button AddToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on button AddToBasket.png')

"Step 9: Click on button Shopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Shopping2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button Shopping.png')

"Step 10: Click on button Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Plus'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on button Plus.png')

"Step 11: Click on button CheckOut -> Navigate to page 'step1 checkout#checkout/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_CheckOut'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on button CheckOut - Navigate to page step1 checkoutcheckoutstep1.png')

"Step 12: Click on button NextStep -> Navigate to page 'step2 checkout#checkout/step2'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step1_checkout/button_NextStep'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button NextStep - Navigate to page step2 checkoutcheckoutstep2.png')

"Step 13: Click on input FullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step2_checkout/input_FullName'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on input FullName.png')

"Step 14: Enter input value in input FullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step2_checkout/input_FullName'), input_FullName)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Enter input value in input FullName.png')

"Step 15: Press key Tab on input FullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_step2_checkout/input_FullName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Press key Tab on input FullName.png')

"Step 16: Enter input value in input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step2_checkout/input_EmailAddress'), input_EmailAddress)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Enter input value in input EmailAddress.png')

"Step 17: Press key Tab on input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_step2_checkout/input_EmailAddress'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Press key Tab on input EmailAddress.png')

"Step 18: Press key Tab on input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_step2_checkout/input_EmailAddress'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Press key Tab on input EmailAddress.png')

"Step 19: Enter input value in input ShippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step2_checkout/input_ShippingAddress'), input_ShippingAddress)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Enter input value in input ShippingAddress.png')

"Step 20: Click on input PhoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step2_checkout/input_PhoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on input PhoneNumber.png')

"Step 21: Enter input value in input PhoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step2_checkout/input_PhoneNumber'), input_PhoneNumber)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Enter input value in input PhoneNumber.png')

"Step 22: Click on label InternationalShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step2_checkout/label_InternationalShipping'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on label InternationalShipping.png')

"Step 23: Click on button NextStep -> Navigate to page 'step3 checkout#checkout/step3'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step2_checkout/button_NextStep'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on button NextStep - Navigate to page step3 checkoutcheckoutstep3.png')

"Step 24: Click on label CreditCardPayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step3_checkout/label_CreditCardPayment'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on label CreditCardPayment.png')

"Step 25: Enter input value in input NameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step3_checkout/input_NameOnCard'), input_NameOnCard)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Enter input value in input NameOnCard.png')

"Step 26: Press key Tab on input NameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_step3_checkout/input_NameOnCard'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Press key Tab on input NameOnCard.png')

"Step 27: Enter input value in input CardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step3_checkout/input_CardNumber'), input_CardNumber)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27-Enter input value in input CardNumber.png')

"Step 28: Click on input ExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step3_checkout/input_ExpiryDate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 28-Click on input ExpiryDate.png')

"Step 29: Click on input ExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step3_checkout/input_ExpiryDate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29-Click on input ExpiryDate.png')

"Step 30: Click on input CCV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step3_checkout/input_CCV'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30-Click on input CCV.png')

"Step 31: Enter input value in input CCV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_step3_checkout/input_CCV'), input_CCV)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31-Enter input value in input CCV.png')

"Step 32: Click on button Confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_step3_checkout/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32-Click on button Confirm - Navigate to page .png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Checkout Process with Credit Card Payment After Signing In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}