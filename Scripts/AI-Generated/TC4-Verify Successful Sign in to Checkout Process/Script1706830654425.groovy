import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink plant now > navigate to Page shop'

WebUI.enhancedClick(findTestObject('Page_home/hyperlink_shop'))

'Step 3: At Page shop, click on div object > navigate to Page product'

WebUI.enhancedClick(findTestObject('Page_shop/div_chamaedorea_elegans'))

'Step 4: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

'Step 5: At Page product, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_object'))

'Step 6: At Page product, click on button check out'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_check_out'))

'Step 7: At Page product, click on button sign in to checkout > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_sign_in_to_checkout'))

'Step 8: Add visual checkpoint at Page signin'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Successful Sign in to Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
