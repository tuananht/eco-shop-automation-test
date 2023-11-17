import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page signin'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/signin')

'step 2: Login at Page signin --> navigate to Page home'

'--> At signin page input username'

testObj = findTestObject('Object Repository/Page_signin/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/signin/(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.username)

'--> At signin page input password'

testObj = findTestObject('Object Repository/Page_signin/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/signin/(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.password)

'--> At signin page submit login form'

testObj = findTestObject('Object Repository/Page_signin/form_signin_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/signin/(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'--> Wait for login action to be completed'

WebUI.delay(15)

'step 3: At Page home click on hyperlink shop --> navigate to Page shop'

testObj = findTestObject('Object Repository/Page_home/hyperlink_shop')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page shop click on div chamaedorea elegans --> navigate to Page product chamaedorea elegans'

testObj = findTestObject('Object Repository/Page_shop/div_chamaedorea_elegans')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/shop(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product chamaedorea elegans click on button order'

testObj = findTestObject('Object Repository/Page_product/button_order')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page product chamaedorea elegans click on button basket toggle'

testObj = findTestObject('Object Repository/Page_product/button_basket_toggle')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page product chamaedorea elegans click on button basket checkouts --> navigate to Page checkout step1'

testObj = findTestObject('Object Repository/Page_product/button_basket_checkout')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page checkout step1 click on button next step --> navigate to Page checkout step2'

testObj = findTestObject('Object Repository/Page_checkout_step1/button_next_step')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step1(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page checkout step2 input on input fullname'

testObj = findTestObject('Object Repository/Page_checkout_step2/input_fullname')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_fullname)

'step 9: At Page checkout step2 input on input email'

testObj = findTestObject('Object Repository/Page_checkout_step2/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_email)

'step 10: At Page checkout step2 input on input address'

testObj = findTestObject('Object Repository/Page_checkout_step2/input_address')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_address)

'step 11: At Page checkout step2 input on input phone'

testObj = findTestObject('Object Repository/Page_checkout_step2/input_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_phone)

'step 12: At Page checkout step2 click on label is international'

testObj = findTestObject('Object Repository/Page_checkout_step2/label_is_international')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page checkout step2 click on button next step --> navigate to Page checkout step3'

testObj = findTestObject('Object Repository/Page_checkout_step2/button_next_step')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step2(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page checkout step3 click on label cash'

testObj = findTestObject('Object Repository/Page_checkout_step3/label_cash')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step3(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 15: At Page checkout step3 click on button confirm --> navigate to Page home'

testObj = findTestObject('Object Repository/Page_checkout_step3/button_confirm')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/step3(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 16: Add visual checkpoint at Page home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Navigation to Product Page from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
