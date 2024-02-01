import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page home, click on h6 object > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/h6_object'))

'Step 4: At Page signin, click on button continue with facebook > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_continue_with_facebook'))

'Step 5: Add visual checkpoint at Page home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Facebook Login at Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
