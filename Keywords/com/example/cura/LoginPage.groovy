package com.example.cura

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class LoginPage {

    // buka halaman login
    static void openLoginPage() {
        WebUI.openBrowser('')
        WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
        WebUI.click(findTestObject('CURA/Homepage/btn_MakeAppointment'))
    }

    // isi username & password lalu klik login
    static void login(String username, String password) {
        WebUI.setText(findTestObject('CURA/Login/txt_UserName'), username)
        WebUI.setText(findTestObject('CURA/Login/txt_Password'), password)
        WebUI.click(findTestObject('CURA/Login/btn_Login'))
    }

    // verifikasi login berhasil
    static void verifyLoginSuccess() {
        WebUI.verifyElementPresent(findTestObject('CURA/Appointment/div_Appointment'), 10)
    }

    // tutup browser
    static void closeBrowser() {
        WebUI.closeBrowser()
    }
}
