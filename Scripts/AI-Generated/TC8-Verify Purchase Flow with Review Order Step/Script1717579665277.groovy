import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.selectItemsReviewOrderProceedToCheckout
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.browseShopAddToBasketProceedToCheckout
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2: Click on link Sign In - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Browse shop, add item to basket, and proceed to checkout"

browseShopAddToBasketProceedToCheckout.execute()

"Step 5: Select items, review order, and proceed to checkout"

selectItemsReviewOrderProceedToCheckout.execute()

"Step 6: Fill checkout details, confirm order, and complete purchase"

fillCheckoutDetailsConfirmOrderCompletePurchase.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Purchase Flow with Review Order Step_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
