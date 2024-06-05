import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Click on link Sign In - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Hover over div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_search/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Hover over div.png')

"Step 5: Enter input value in input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_search/input_searchProduct'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Enter input value in input field.png')

"Step 6: Click on button 'Add to basket'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/button_addToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on button Add to basket.png')

"Step 7: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/button_checkOut'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7: Click on span.png')

"Step 8: Click on button 'CHECK OUT'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on button CHECK OUT.png')

"Step 9: Fill checkout details, confirm order, and complete purchase"

fillCheckoutDetailsConfirmOrderCompletePurchase.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Purchase Flow with Search and Add to Basket Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
