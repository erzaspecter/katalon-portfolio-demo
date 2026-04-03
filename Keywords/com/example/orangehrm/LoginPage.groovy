package com.example.orangehrm
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class LoginPage {
    static void login(String username, String password) {
        WebUI.setText(findTestObject('OrangeHRM/Login/txt_Username'), username)
        WebUI.setText(findTestObject('OrangeHRM/Login/txt_Password'), password)
        WebUI.click(findTestObject('OrangeHRM/Login/btn_Login'))
    }
}
