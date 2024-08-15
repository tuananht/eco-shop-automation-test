import katalon.truetest.TrueTestScripts
import katalon.common.completeShippingAndPaymentInformation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Hover over div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_search/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Hover over div productDetails.png')

"Step 5: Enter input value in input searchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_search/input_searchProduct'), var_1_input_searchProduct)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Enter input value in input searchProduct.png')

"Step 6: Click on button addToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/button_addToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button addToBasket.png')

"Step 7: Click on span navigationButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on span navigationButton.png')

"Step 8: Click on input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on input fullName.png')

"Step 9: Complete shipping and payment information for order"

completeShippingAndPaymentInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Search Product and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}