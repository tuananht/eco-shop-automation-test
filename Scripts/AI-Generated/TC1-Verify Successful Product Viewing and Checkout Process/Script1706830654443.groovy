import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
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

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page home, click on hyperlink recommended > navigate to Page recommended'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_recommended'))

'Step 4: At Page recommended, click on img object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/img_object'))

'Step 5: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

'Step 6: At Page product, click on hyperlink home > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_home'))

'Step 7: At Page home, click on hyperlink see all'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_see_all'))

'Step 8: At Page home, click on hyperlink see all > navigate to Page recommended'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_see_all'))

'Step 9: At Page recommended, click on h5 object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/h5_object'))

'Step 10: At Page recommended, click on h5 object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/h5_object'))

'Step 11: At Page recommended, click on hyperlink view account'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/hyperlink_view_account'))

'Step 12: At Page recommended, click on hyperlink view account > navigate to Page account'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/hyperlink_view_account'))

'Step 13: At Page account, click on li object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/li_object'))

'Step 14: At Page account, click on li object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/li_object'))

'Step 15: At Page account, click on li object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/li_object_1'))

'Step 16: At Page account, click on li object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/li_object_1'))

'Step 17: At Page account, click on hyperlink shop'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/hyperlink_shop'))

'Step 18: At Page account, click on hyperlink shop > navigate to Page shop'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/hyperlink_shop'))

'Step 19: At Page shop, click on h5 object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/h5_object'))

'Step 20: Add visual checkpoint at Page product'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Product Viewing and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
