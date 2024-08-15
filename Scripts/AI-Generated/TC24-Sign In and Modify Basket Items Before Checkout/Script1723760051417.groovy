import katalon.truetest.TrueTestScripts
import katalon.common.completeShippingAndPaymentInformation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop2 -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on link shop2 - Navigate to page shop.png')

"Step 5: Hover over div herringbonePineTreeIndoorPlants"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Hover over div herringbonePineTreeIndoorPlants.png')

"Step 6: Click on button addToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on button addToBasket.png')

"Step 7: Click on button checkOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_checkOut'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on button checkOut.png')

"Step 8: Click on div basketItemDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/div_basketItemDetails'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on div basketItemDetails.png')

"Step 9: Click on span plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_plus'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on span plus.png')

"Step 10: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_minus'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on button minus.png')

"Step 11: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_minus'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on button minus.png')

"Step 12: Click on button plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_plus'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on button plus.png')

"Step 13: Click on span minusButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on span minusButton.png')

"Step 14: Click on span minusButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 14-Click on span minusButton.png')

"Step 15: Click on span minusButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 15-Click on span minusButton.png')

"Step 16: Click on input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 16-Click on input fullName.png')

"Step 17: Complete shipping and payment information for order"

completeShippingAndPaymentInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Sign In and Modify Basket Items Before Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}