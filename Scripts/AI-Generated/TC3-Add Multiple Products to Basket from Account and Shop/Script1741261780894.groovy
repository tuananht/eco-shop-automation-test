import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link SignIn -> Navigate to page 'signin#signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SignIn'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link SignIn - Navigate to page signinsignin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on div HomeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_HomeButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on div HomeButton.png')

"Step 5: Click on link ViewAccount -> Navigate to page 'account#account'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ViewAccount'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link ViewAccount - Navigate to page accountaccount.png')

"Step 6: Click on item WishList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/item_WishList'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on item WishList.png')

"Step 7: Click on link Shop -> Navigate to page 'shop#shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/link_Shop'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link Shop - Navigate to page shopshop.png')

"Step 8: Hover over div ShopContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_ShopContent'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over div ShopContent.png')

"Step 9: Click on button addToBasket (AddToBasket)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/button_addToBasket"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/button_addToBasket', ['button_addToBasket_divNthChild': button_addToBasket_divNthChild, 'button_addToBasket_divNthOfType': button_addToBasket_divNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button addToBasket AddToBasket.png')

"Step 10: Hover over div ShopContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_ShopContent2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Hover over div ShopContent2.png')

"Step 11: Click on button addToBasket (AddToBasket2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/button_addToBasket"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/button_addToBasket', ['button_addToBasket_divNthChild': button_addToBasket_divNthChild_1, 'button_addToBasket_divNthOfType': button_addToBasket_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button addToBasket AddToBasket2.png')

"Step 12: Click on button ShowMoreItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_ShowMoreItems'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button ShowMoreItems.png')

"Step 13: Hover over div ShopContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_ShopContent3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Hover over div ShopContent3.png')

"Step 14: Click on image ProductImage -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/image_ProductImage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on image ProductImage - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Add Multiple Products to Basket from Account and Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}