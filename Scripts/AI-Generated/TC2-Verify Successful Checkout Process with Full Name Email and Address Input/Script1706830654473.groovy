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

'Step 2: At Page home, click on hyperlink sign in > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_sign_in'))

'Step 3: At Page signin, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_email'), input_email)

'Step 4: At Page signin, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_password'), input_password)

'Step 5: At Page signin, click on button sign in > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_sign_in'))

'Step 6: At Page home, click on hyperlink plant now > navigate to Page shop'

WebUI.enhancedClick(findTestObject('Page_home/hyperlink_shop'))

'Step 7: At Page shop, click on div object > navigate to Page product'

WebUI.enhancedClick(findTestObject('Page_shop/div_chamaedorea_elegans'))

'Step 8: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

'Step 9: At Page product, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_object'))

'Step 10: At Page product, click on button check out > navigate to Page checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_check_out'))

'Step 11: At Page checkout, click on button next step'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_next_step'))

'Step 12: At Page checkout, input on input fullname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_fullname'), input_fullname)

'Step 13: At Page checkout, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), input_email_1)

'Step 14: At Page checkout, input on input address'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_address'), input_address)

'Step 15: At Page checkout, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_object'), input_object)

'Step 16: At Page checkout, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_object_1'))

'Step 17: At Page checkout, click on button next step'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_next_step_1'))

'Step 18: Add visual checkpoint at Page checkout'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Checkout Process with Full Name Email and Address Input_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
