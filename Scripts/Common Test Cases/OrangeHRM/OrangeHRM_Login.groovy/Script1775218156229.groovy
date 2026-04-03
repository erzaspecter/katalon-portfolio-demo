import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('OrangeHRM/Login/txt_Username'), Username)
WebUI.setText(findTestObject('OrangeHRM/Login/txt_Password'), Password)
WebUI.click(findTestObject('OrangeHRM/Login/btn_Login'))
