import katalon.truetest.TrueTestScripts
import katalon.common.completeShippingAndPaymentInformation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.common.addIndoorPlantToBasketAndCheckout
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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Add indoor plant to basket and checkout"

addIndoorPlantToBasketAndCheckout.execute()

"Step 5: Complete shipping and payment information for order"

completeShippingAndPaymentInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Checkout Process for Indoor Plant Purchase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}