import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectObjectAndAddToBasket
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop2 -> Navigate to page '/shop'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on link shop2 - Navigate to page shop.png')

"Step 5: Hover over div chamaedoreaElegansIndoorPlants"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_chamaedoreaElegansIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Hover over div chamaedoreaElegansIndoorPlants.png')

"Step 6: Click on header chamaedoreaElegans"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/header_chamaedoreaElegans'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on header chamaedoreaElegans.png')

"Step 7: Select an object and add to the basket"

selectObjectAndAddToBasket.execute()

"Step 8: Fill shipping and payment details to complete checkout"

fillShippingAndPaymentDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Checkout Process with Specific Plant Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
