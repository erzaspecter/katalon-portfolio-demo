package com.example.orangehrm

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class LeavePage {

    static void applyLeave(String leaveType, String fromDate, String toDate) {
        WebUI.click(findTestObject('OrangeHRM/Leave/btn_ApplyLeave'))
        WebUI.selectOptionByLabel(findTestObject('OrangeHRM/Leave/ddl_LeaveType'), leaveType, false)
        WebUI.setText(findTestObject('OrangeHRM/Leave/txt_FromDate'), fromDate)
        WebUI.setText(findTestObject('OrangeHRM/Leave/txt_ToDate'), toDate)
        WebUI.click(findTestObject('OrangeHRM/Leave/btn_Submit'))
    }

    static void verifyLeaveStatus(String expectedStatus) {
        WebUI.verifyTextPresent(expectedStatus, false)
    }
}
