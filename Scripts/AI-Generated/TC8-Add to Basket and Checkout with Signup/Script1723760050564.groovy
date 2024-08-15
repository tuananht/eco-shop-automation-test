import katalon.truetest.TrueTestScripts
import katalon.common.completeShippingAndPaymentInformation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addStoneLotusToBasketAndProceedToCheckout
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

"Step 2: Click on link signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link signUp - Navigate to page signup.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop2 -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link shop2 - Navigate to page shop.png')

"Step 5: Hover over div herringbonePineTreeIndoorPlants"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Hover over div herringbonePineTreeIndoorPlants.png')

"Step 6: Click on button addToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button addToBasket.png')

"Step 7: Click on button checkOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_checkOut'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button checkOut.png')

"Step 8: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button close.png')

"Step 9: Add stone lotus to basket and proceed to checkout"

addStoneLotusToBasketAndProceedToCheckout.execute()

"Step 10: Complete shipping and payment information for order"

completeShippingAndPaymentInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Add to Basket and Checkout with Signup_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}