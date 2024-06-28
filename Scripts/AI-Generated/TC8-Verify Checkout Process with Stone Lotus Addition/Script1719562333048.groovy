import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import katalon.common.addStoneLotusToBasket
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

"Step 2: Click on link signUp -> Navigate to page '/signup'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2: Click on link signUp - Navigate to page signup.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop2 -> Navigate to page '/shop'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Click on link shop2 - Navigate to page shop.png')

"Step 5: Hover over div herringbonePineTreeIndoorPlants"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5: Hover over div herringbonePineTreeIndoorPlants.png')

"Step 6: Click on span navigationButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on span navigationButton.png')

"Step 7: Click on span closeButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on span closeButton.png')

"Step 8: Add a stone lotus to the basket"

addStoneLotusToBasket.execute()

"Step 9: Fill shipping and payment details to complete checkout"

fillShippingAndPaymentDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Checkout Process with Stone Lotus Addition_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
