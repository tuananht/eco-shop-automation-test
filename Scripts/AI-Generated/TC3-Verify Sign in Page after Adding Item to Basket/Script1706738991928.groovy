import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page home, click on img object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/img_object'))

'Step 4: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

'Step 5: At Page product, click on hyperlink sign in > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_sign_in'))

'Step 6: Add visual checkpoint at Page signin'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Sign in Page after Adding Item to Basket_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
