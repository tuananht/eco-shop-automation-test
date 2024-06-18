import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.selectAndAddItemsToBasket
import katalon.common.completeCheckoutWithVisaCard
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

"Step 2: Click on link signIn -> Navigate to page 'signin'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2: Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Hover over div productDetails"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_search/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Hover over div productDetails.png')

"Step 5: Enter input value in input searchProduct"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_search/input_searchProduct'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Enter input value in input searchProduct.png')

"Step 6: Click on header productName"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/header_productName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on header productName.png')

"Step 7: Select and add items to the basket"

selectAndAddItemsToBasket.execute()

"Step 8: Complete checkout process with Visa card payment"

completeCheckoutWithVisaCard.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Search and Add Products to Basket_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
