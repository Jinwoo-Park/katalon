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

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://10.1.112.225:8080/')
WebUI.waitForPageLoad(0)

//로그인
WebUI.setText(findTestObject('Page_login/input_loginID'), 'Administrator')
WebUI.setEncryptedText(findTestObject('Page_login/input_loginPW'), '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Page_login/input_loginAction'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

//기본 정보 - 기본 설정
WebUI.click(findTestObject('Page_info/a_info_config'))

/****************************************************************************************************************/
//기본 정보 - 기본 설정 - 로그인 연동
String loginType = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/select_loginType'), 'value')
String ldapServer = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'value')
String ldapPort = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapPort'), 'value')
String ldapId = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapId'), 'value')
String ldapPassword = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapPassword'), 'value')
String ldapUserName = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'value')
String ldapGroupName = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'value')

//기본 정보 - 기본 설정 - 로그인 연동 - DB
WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 0)
WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
//
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 0, 2)

//기본 정보 - 기본 설정 - 로그인 연동 - LDAP
WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 1)
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapServer'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPort'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapId'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPassword'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapUserName'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapGroupName'))

WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'LDAP_SERVER')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPort'), '389')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapId'), 'mappe@canon-bs.co.kr')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPassword'), '')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'OU=Members,DC=CANON-BS,DC=CO,DC=KR')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR')
WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
//
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 1, 2)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'value', 'LDAP_SERVER', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPort'), 'value', '389', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapId'), 'value', 'mappe@canon-bs.co.kr', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPassword'), 'value', '', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'value', 'OU=Members,DC=CANON-BS,DC=CO,DC=KR', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'value', 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR',0)

//기본 정보 - 기본 설정 - 로그인 연동 - DB -> LDAP
WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 2)
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapServer'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPort'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapId'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPassword'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapUserName'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapGroupName'))
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'LDAP_SERVER')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPort'), '389')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapId'), 'mappe@canon-bs.co.kr')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPassword'), '')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'OU=Members,DC=CANON-BS,DC=CO,DC=KR')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR')
WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
//
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 2, 2)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'value', 'LDAP_SERVER', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPort'), 'value', '389', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapId'), 'value', 'mappe@canon-bs.co.kr', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPassword'), 'value', '', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'value', 'OU=Members,DC=CANON-BS,DC=CO,DC=KR', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'value', 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR', 0)

//기본 정보 - 기본 설정 - 로그인 연동 - LDAP -> DB
WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 3)
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapServer'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPort'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapId'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPassword'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapUserName'))
WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapGroupName'))
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'LDAP_SERVER')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPort'), '389')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapId'), 'mappe@canon-bs.co.kr')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPassword'), '')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'OU=Members,DC=CANON-BS,DC=CO,DC=KR')
WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR')
WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
//
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 3, 2)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'value', 'LDAP_SERVER', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPort'), 'value', '389', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapId'), 'value', 'mappe@canon-bs.co.kr', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPassword'), 'value', '', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'value', 'OU=Members,DC=CANON-BS,DC=CO,DC=KR', 0)
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'value', 'OU=Groups,DC=CANON-BS,DC=CO,DC=KR', 0)

//기본 정보 - 기본 설정 - 로그인 연동 - 복원
WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), loginType)
if(loginType.equals("0")) {
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapServer'))	
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapPort'))
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapId'))
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapPassword'))
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapUserName'))
	WebUI.verifyElementNotVisible(findTestObject('Page_info/Page_info_general/input_ldapGroupName'))
	
	WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 1)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapServer'), ldapServer)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPort'), ldapPort)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapId'), ldapId)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPassword'), ldapPassword)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapUserName'), ldapUserName)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), ldapGroupName)
	WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 0)
	
} else {
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapServer'))
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPort'))
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapId'))
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapPassword'))
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapUserName'))
	WebUI.verifyElementVisible(findTestObject('Page_info/Page_info_general/input_ldapGroupName'))
	
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapServer'), ldapServer)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPort'), ldapPort)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapId'), ldapId)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapPassword'), ldapPassword)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapUserName'), ldapUserName)
	WebUI.setText(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), ldapGroupName)
}

WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
//
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), loginType, 2)

if(loginType.equals("0")) {
	WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 1)
}
WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapServer'), 'value', ldapServer, 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPort'), 'value', ldapPort, 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapId'), 'value', ldapId, 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapPassword'), 'value', ldapPassword, 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapUserName'), 'value', ldapUserName, 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_info/Page_info_general/input_ldapGroupName'), 'value', ldapGroupName, 0)

if(loginType.equals("0")) {
	WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_loginType'), 0)
}

/****************************************************************************************************************/
//기본 정보 - 기본 설정 - 비밀번호 암호화
String passwordEnc = WebUI.getAttribute(findTestObject('Page_info/Page_info_general/select_passwordEnc'), 'value')

for(int i = 0; i < 6; i++) {
	WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_passwordEnc'), i)
	WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
	WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_passwordEnc'), i, 2)
}

WebUI.selectOptionByIndex(findTestObject('Page_info/Page_info_general/select_passwordEnc'), passwordEnc)
WebUI.click(findTestObject('Page_info/Page_info_general/a_limitConfig'))
WebUI.waitForJQueryLoad(0, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_info/Page_info_general/select_passwordEnc'), passwordEnc, 2)
