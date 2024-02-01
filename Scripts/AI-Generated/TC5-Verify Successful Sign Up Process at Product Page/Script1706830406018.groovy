import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink shop > navigate to Page producs'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_shop'))

'Step 3: At Page producs, click on button go back > navigate to Page shop'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_producs/button_go_back'))

'Step 4: At Page shop, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/div_object'))

'Step 5: At Page shop, click on div object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/div_object_1'))

'Step 6: At Page product, click on hyperlink sign up > navigate to Page signup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_sign_up'))

'Step 7: Add visual checkpoint at Page signup'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Sign Up Process at Product Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
