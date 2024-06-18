import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://eco.aut.katalon.com/"

TrueTestScripts.navigate('/')

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Hover over div productDisplay"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_productDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3: Hover over div productDisplay.png')

"Step 4: Click on image productCardImg -> Navigate to page 'product/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_productCardImg'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4: Click on image productCardImg - Navigate to page product.png')

"Step 5: Click on button addToBasket"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5: Click on button addToBasket.png')

"Step 6: Click on button addToBasket"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_product/button_order'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6: Click on button addToBasket.png')

"Step 7: Click on span navigationButton"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7: Click on span navigationButton.png')

"Step 8: Click on input fullName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8: Click on input fullName.png')

"Step 9: Click on button signInToCheckout -> Navigate to page 'signin'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_signInToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9: Click on button signInToCheckout - Navigate to page signin.png')

"Step 10: Click on button signUp -> Navigate to page 'signup'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10: Click on button signUp - Navigate to page signup.png')

"Step 11: Click on button signIn -> Navigate to page 'signin'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11: Click on button signIn - Navigate to page signin.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Add Multiple Products to Basket and Sign In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
