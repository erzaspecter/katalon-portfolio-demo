package com.example.orangehrm
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class DashboardPage {
    static void verifyDashboard() {
        WebUI.verifyElementPresent(findTestObject('OrangeHRM/Dashboard/lbl_Dashboard'), 10)
    }
}
