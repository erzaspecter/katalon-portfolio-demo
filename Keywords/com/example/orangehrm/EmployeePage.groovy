package com.example.orangehrm

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class EmployeePage {

    static void addEmployee(String firstName, String lastName) {
        WebUI.click(findTestObject('OrangeHRM/Employee/btn_AddEmployee'))
        WebUI.setText(findTestObject('OrangeHRM/Employee/txt_FirstName'), firstName)
        WebUI.setText(findTestObject('OrangeHRM/Employee/txt_LastName'), lastName)
        WebUI.click(findTestObject('OrangeHRM/Employee/btn_Save'))
    }

    static void searchEmployee(String name) {
        WebUI.setText(findTestObject('OrangeHRM/Employee/txt_Search'), name)
        WebUI.click(findTestObject('OrangeHRM/Employee/btn_Search'))
        WebUI.verifyTextPresent(name, false)
    }
}
