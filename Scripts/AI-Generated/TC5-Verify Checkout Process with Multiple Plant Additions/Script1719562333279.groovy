import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addStoneLotusToBasket
import katalon.common.fillShippingAndPaymentDetails
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.addIndoorPlantsAndCloseProcess
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2: Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Add indoor plants to the basket and close the process"

addIndoorPlantsAndCloseProcess.execute()

"Step 5: Add a stone lotus to the basket"

addStoneLotusToBasket.execute()

"Step 6: Fill shipping and payment details to complete checkout"

fillShippingAndPaymentDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Checkout Process with Multiple Plant Additions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
