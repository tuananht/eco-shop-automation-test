import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.completeCheckoutWithCreditCard
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addIndoorPlantsToBasketAndCheckout
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Add indoor plants to basket and proceed to checkout"

addIndoorPlantsToBasketAndCheckout.execute()

"Step 5: Complete checkout process with credit card payment"

completeCheckoutWithCreditCard.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Checkout Process for Adding Plants to Basket_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
