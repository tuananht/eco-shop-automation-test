import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.browseAndAddIndoorPlants
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

"Step 2: Click on link shop2 -> Navigate to page '/shop'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2: Click on link shop2 - Navigate to page shop.png')

"Step 3: Hover over div herringbonePineTreeIndoorPlants"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Hover over div herringbonePineTreeIndoorPlants.png')

"Step 4: Click on button addToBasket"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on button addToBasket.png')

"Step 5: Click on span navigationButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on span navigationButton.png')

"Step 6: Click on input fullName"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on input fullName.png')

"Step 7: Click on button signInToCheckout -> Navigate to page '/signin'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_signInToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on button signInToCheckout - Navigate to page signin.png')

"Step 8: Login into Application"

TrueTestScripts.login()

"Step 9: Browse and add indoor plants to the basket"

browseAndAddIndoorPlants.execute()

"Step 10: Fill shipping and payment details to complete checkout"

fillShippingAndPaymentDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Checkout Process with Indoor Plants Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
