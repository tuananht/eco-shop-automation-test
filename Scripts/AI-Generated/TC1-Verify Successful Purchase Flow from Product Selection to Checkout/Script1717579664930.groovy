import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.selectItemAddToBasketAndCheckout
import katalon.common.fillCheckoutDetailsConfirmOrderCompletePurchase

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://eco.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Click on link 'Sign In' -> Navigate to page 'signin'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on link Sign In - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link 'Shop' -> Navigate to page 'shop'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on link Shop - Navigate to page shop.png')

"Step 5: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_chamaedoreaElegansIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Hover over div.png')

"Step 6: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/header_chamaedoreaElegans'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on header.png')

"Step 7: Select item, add to basket, and proceed to checkout"

selectItemAddToBasketAndCheckout.execute()

"Step 8: Fill checkout details, confirm order, and complete purchase"

fillCheckoutDetailsConfirmOrderCompletePurchase.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Purchase Flow from Product Selection to Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
