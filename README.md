# katalon

### 개요 : Katalon Studio에서 Web 자동 테스트 프로젝트 개발 스터디

### 참고자료
	Best Automation Testing Tool for 2019(https://medium.com/@briananderson2209/best-automation-testing-tools-for-2018-top-10-reviews-8a4a19f664d2)
	1. Selenium : Web UI / 무료 / Java, C#, Python, Javascript -> 가장 기본적인 툴이지만 개발하는 데 공수가 커서 탈락
	2. Katalon Studio : Web UI & API / 무료 / Java, Groovy -> Selenuim Web Driver 기반이며 초급도 쉽게 개발 가능
	3. Unified Funtional Testing : Web UI & API / 유료 / VBScript -> 유료이며 VBScript라서 탈락
	4. TestComplete : Web UI & API / 유료 / C#, Python, Javascript -> 유료여서 탈락
	5. SoapUI : Web API / 유료 / Groovy -> 유료이며, Web UI 테스트 불가로 탈락
	x. Cypress : Web UI / 부분 유료 / Javascript -> 개발 IDE가 존재하지 않으며, 무료버전의 한계가 있어서 탈락
	x. Guitar : 확인중 -> 네이버에서 만들어서 사용하기 편할 줄 알았는데 생각보다 어려운 것 같음, 개발자에게 오히려 익숙치 않은 느낌

### 설치방법
	Katalon Studio 다운로드
	URL : https://www.katalon.com/download/
  	압축해제 및 katalon.exe 실행


### Object 등록
	Object : 자동으로 제어할 아이템으로 class/id로 구분 가능
	Object Spy : 웹페이지에 접속하여 원하는 Object를 Capture 후 Save
	Capture된 Object는 Object Repository에 등록됨
	이 Object의 Properties를 테스트케이스에 맞게 설정


### Test Cases 작성
	Test Cases : 테스트용 스크립트
	기본적으로 UI에서 설정 가능, grooby스크립트로 개발 가능


### Test Suites 작성
	Test Suites : 작성된 Test Cases를 테스트
	결과를 리포팅 가능, 동영상도 생성(성공/실패)
  



