package com.example.cura

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class AppointmentConfirmationPage {
    static void verifyConfirmation(String facility, String readmission, String program, String visitDate, String comment) {
        WebUI.verifyTextPresent('Appointment Confirmation', false)
        WebUI.verifyMatch(facility, WebUI.getText(findTestObject('CURA/AppointmentConfirmation/lbl_Facility')), false)
        WebUI.verifyMatch(readmission, WebUI.getText(findTestObject('CURA/AppointmentConfirmation/lbl_HospitalReadmission')), false)
        WebUI.verifyMatch(program, WebUI.getText(findTestObject('CURA/AppointmentConfirmation/lbl_Program')), false)
        WebUI.verifyMatch(visitDate, WebUI.getText(findTestObject('CURA/AppointmentConfirmation/lbl_VisitDate')), false)
        WebUI.verifyMatch(comment, WebUI.getText(findTestObject('CURA/AppointmentConfirmation/lbl_Comment')), false)
    }
}
