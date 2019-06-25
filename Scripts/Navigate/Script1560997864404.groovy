import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

boolean viewProject = false

boolean viewPrint = true

boolean viewScan = false

boolean viewFax = false

boolean viewElog = true

boolean viewEDevice = true

boolean viewSlog = false

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.1.112.225:8080/')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_login/input_loginID'), 'Administrator')

WebUI.setEncryptedText(findTestObject('Page_login/input_loginPW'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_login/input_loginAction'))

WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_common/h2_heading'), 0)

WebUI.click(findTestObject('Page_info/a_info_service'))

WebUI.waitForElementPresent(findTestObject('Page_common/h2_heading'), 0)

WebUI.click(findTestObject('Page_info/a_info_config'))

WebUI.waitForElementPresent(findTestObject('Page_common/h2_heading'), 0)

WebUI.click(findTestObject('Page_info/a_info_device'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_wm'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_policy'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_group'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_user'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_board'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

WebUI.click(findTestObject('Page_info/a_info_oper'))

WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

if(viewQr) {
	
	WebUI.click(findTestObject('Page_info/a_info_qr'))
	
	WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
}

if (viewProject) {
    
    WebUI.click(findTestObject('Page_project/a_project'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_project/a_project_info'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
}

if (viewPrint) {
    WebUI.click(findTestObject('Page_print/a_print'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_print/a_print_aprint'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_print/a_print_aprintbak'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
}

if (viewElog) {
    WebUI.click(findTestObject('Page_elog/a_elog'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_elog/a_elog_statistic'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_elog/a_elog_ausage'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_elog/a_elog_adetail'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    if (viewProject) {
        WebUI.click(findTestObject('Page_elog/a_elog_aproject'))

        WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
    }
    
    WebUI.click(findTestObject('Page_elog/a_elog_tree'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_elog/a_elog_history'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_elog/a_elog_report'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
}

if (viewEDevice) {
    WebUI.click(findTestObject('Page_edevice/a_edevice'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_edevice/a_edevice_recent'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_edevice/a_edevice_history'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_edevice/a_edevice_counter'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)

    WebUI.click(findTestObject('Page_edevice/a_edevice_report'))

    WebUI.waitForElementPresent(findTestObject('Page_common/a_primary'), 0)
}

WebUI.click(findTestObject('Page_common/a_logout'))

WebUI.delay(1)

WebUI.closeBrowser()

