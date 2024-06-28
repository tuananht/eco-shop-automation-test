import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.addIndoorPlantsAndCloseProcess
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import katalon.common.fillShippingAndPaymentDetails
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://eco.aut.katalon.com//"

TrueTestScripts.navigate('//')

"Step 2: Click on link signIn -> Navigate to page '/signin'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2: Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Add indoor plants to the basket and close the process"

addIndoorPlantsAndCloseProcess.execute()

"Step 5: Click on span plus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_plus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5: Click on span plus.png')

"Step 6: Click on span plus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_plus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6: Click on span plus.png')

"Step 7: Click on span plus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_plus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7: Click on span plus.png')

"Step 8: Click on button minus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_minus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8: Click on button minus.png')

"Step 9: Click on span minus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9: Click on span minus.png')

"Step 10: Click on span minus"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minus'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10: Click on span minus.png')

"Step 11: Click on input fullName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11: Click on input fullName.png')

"Step 12: Fill shipping and payment details to complete checkout"

fillShippingAndPaymentDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Checkout Process with Quantity Adjustments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
