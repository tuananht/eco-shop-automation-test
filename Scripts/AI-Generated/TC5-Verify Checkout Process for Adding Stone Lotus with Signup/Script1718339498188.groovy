import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.completeCheckoutWithCreditCard
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addStoneLotusToBasketAndCheckout
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://eco.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link signUp -> Navigate to page 'signup'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Click on link signUp - Navigate to page signup.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop2 -> Navigate to page 'shop'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on link shop2 - Navigate to page shop.png')

"Step 5: Hover over div herringbonePineTreeIndoorPlants"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Hover over div herringbonePineTreeIndoorPlants.png')

"Step 6: Click on button addToBasket"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button addToBasket.png')

"Step 7: Click on span navigationButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on span navigationButton.png')

"Step 8: Click on button close"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on button close.png')

"Step 9: Add stone lotus to basket and proceed to checkout"

addStoneLotusToBasketAndCheckout.execute()

"Step 10: Complete checkout process with credit card payment"

completeCheckoutWithCreditCard.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Checkout Process for Adding Stone Lotus with Signup_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
