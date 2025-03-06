import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectSizeAndColorAddToBasket
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to shop"

TrueTestScripts.navigate("shop")

"Step 2: Hover over div ShopContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_ShopContent4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Hover over div ShopContent4.png')

"Step 3: Click on image ProductImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/image_ProductImage2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on image ProductImage2.png')

"Step 4: Select size and color then add item to basket"

selectSizeAndColorAddToBasket.execute()

"Step 5: Hover over div ShopContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_ShopContent5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Hover over div ShopContent5.png')

"Step 6: Click on image ProductImage3 -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/image_ProductImage3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on image ProductImage3 - Navigate to page productproduct.png')

"Step 7: Click on div SelectSize"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SelectSize'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on div SelectSize.png')

"Step 8: Click on div SizeOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SizeOption2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on div SizeOption2.png')

"Step 9: Click on div ChooseColor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ChooseColor'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on div ChooseColor.png')

"Step 10: Click on button AddToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on button AddToBasket.png')

"Step 11: Click on button Shopping2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Shopping2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button Shopping2.png')

"Step 12: Click on button CheckOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_CheckOut'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button CheckOut.png')

"Step 13: Click on button ContinueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_ContinueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on button ContinueShopping.png')

"Step 14: Click on button Shopping2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Shopping2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on button Shopping2.png')

"Step 15: Click on button CheckOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_CheckOut'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on button CheckOut.png')

"Step 16: Click on button SignInToCheckout -> Navigate to page 'signin#signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_SignInToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button SignInToCheckout - Navigate to page signinsignin.png')

"Step 17: Login into Application"

TrueTestScripts.login()

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add Products to Basket and Checkout After Signing In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}