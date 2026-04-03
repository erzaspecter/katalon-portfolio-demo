package com.example.cura

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys


class AppointmentPage {
    static void fillAppointmentForm(String facility, String visitDate, String comment) {
        WebUI.selectOptionByLabel(findTestObject('CURA/Appointment/lst_Facility'), facility, false)
        WebUI.check(findTestObject('CURA/Appointment/chk_Medicaid'))
        WebUI.check(findTestObject('CURA/Appointment/chk_Readmission'))
        WebUI.setText(findTestObject('CURA/Appointment/txt_VisitDate'), visitDate)
		WebUI.sendKeys(findTestObject('CURA/Appointment/txt_VisitDate'), Keys.chord(Keys.ESCAPE))
        WebUI.setText(findTestObject('CURA/Appointment/txt_Comment'), comment)
    }

    static void submitAppointment() {
        WebUI.click(findTestObject('CURA/Appointment/btn_BookAppointment'))
    }
}
