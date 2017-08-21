
# 프로젝트
## 네이버 예약 시스템 개발(진행 중)
### 주제
 - Connect 재단에서 주관하는 Boostcamp Web Course의 주제로 네이버 예약 시스템 개발을 단계별로 경험해 보며 실무에 필요한 기술들을 원리부터 이해해 나가며 적용
### 개요
 - Web 서버에 대한 이해를 위해 Java sokect통신을 이용한 servlet서버 개발 부터 시작하여 Spring Framework적용 및 REST API 설계와 개발, Spring Security 학습 및 적용 등으로 백엔드 개발에 필요한 기초를 닦음
 - html dom에 대한 이해를 바탕으로 Javascript와 Jquery를 활용하여 기능을 구현해 나갔으며 지속적인 학습과 멘토링을 통한 리팩토링을 통해 재사용성이 높은 구조를 설계하는 법과 오픈소스(egjs, Handlebars, 등)를 적용해 보며 실무감을 키웠으며, 배포와 품질관리를 위해 다양한 도구들(webpack:모듈화, gulp:빌드관리, requirjs:모듈화)을 활용하는 경험을 함
 - 실제 서버에 프로젝트를 배포해보며 다양한 도구들(Jenkins, npm, maven)을 활용해 봤으며, 3인 1프로젝트로 짝프로그래밍을 경험하며 커뮤니케이션 능력을 향상시킬 수 있었음
### 사용 기술
 - Framework - Spring, Servlet
 - Language - Java, Javascript
 - Opensourse & ETC - Jquery, egjs(Componnent), Handlebars, webpack
### 참고
### [GitHub - Reservation System (gavas)](https://github.com/boostcamp2-gavas/reservation-system/tree/B_gavas)

## Jade with Cardboard
### 주제
 - JADE(Java Agent DEvelopment Framework)와 Google Cardboard(VR)를 활용한 산분 진화 시뮬레이션
### 개요
 - Agent(시뮬레이션에서 사람이나 특정한 개체를 가르키는 객체)가 Cardboard에서 실시간으로 시뮬레이션에 참여하여 유의미한 데이터를 도출해내기 위한 도구(타 시뮬레이션에 적용 가능한 API화) 개발
 - 시뮬레이션 실험값을 스프레드시트 파일로 기록하도록 Apache POI를 도입
 - JADE를 분석하여 Agent를 커스터마이징(확장)하여 활용
### 사용 기술
 - Framework - JADE, Android, Cardboard SDK (Opengl ES2), Swing
 - Language - Java
### 참고
![jade](https://github.com/seokho/portfolio/blob/master/img/jade.jpg)


## 로그기반 악성행위 탐지 시스템
### 주제
 - 스마트폰(안드로이드)의 로그시스템을 활용하여 백그라운드에서 일어나는 악성행위를 실시간으로 탐지하기 위한 시스템 개발
### 개요
 - 백그라운드(Service를 상속한)에서 사용자의 개입이 없는 SMS, 웹서버로의 정보 탈취를 목적으로 하는 비인가 전송 등의 악성행위를 탐지하기 위한 시스템을 제안하고 프로토타입을 구현
 - 안드로이드 로그캣을 모니터링하여 악성행위가 탐지되면 해당 로그를 발생시킨 프로세스를 찾아 강제 종료 후 프로세스의 패키지를 추적 후 사용자에게 삭제 권고 하고, 서버로 보고하는 서비스를 통해 해당 패키지를 분석할 수 있도록 설계
### 사용 기술
 - Framework - Android, GCM
 - Language - Java(Socket Server), Linux shell script
### 참고
![log1](https://github.com/seokho/portfolio/blob/master/img/log1.jpg)
![log2](https://github.com/seokho/portfolio/blob/master/img/log2.jpg)


## MDM
### 주제
 - 기업에서 활용되는 MDM(Mobile Device Management)을 일반 모바일 이용자들에게 원격과 디바이스에서 스스로 관리 할 수 있도록 제공하기 위한 시스템을 개발
### 개요
 - 분실 및 악성앱으로부터 안드로이드 기기를 보호하기 위해 프로세스, 서비스, 캐시, 네트워크 관리 등의 기능을 제공하고 서버에서 해당 기능을 활용하여 디바이스를 원격에서도 보호할 수 있도록 하는 프로젝트
### 사용 기술
 - Framework - Android, GCM, Swing, Servlet
 - Language - Java, JSP
### 참고
![mdm1](https://github.com/seokho/portfolio/blob/master/img/mdm1.jpg)
![mdm2](https://github.com/seokho/portfolio/blob/master/img/mdm2.jpg)



# 학술활동
## 해외
### Advanced Science Letters(ASL), Volume21, Number3
 - 2015.05
 "Detection of Malware for android Smartphones"
### Ubiquitous Computing Application and Wireless Sensor, Volume331, Lecture Notes in Electrical Engineering
 - 2015.05
 "Multi-core Scheduling Scheme for Wireless Sensor Nodes with NVRAM-Based Hybrid Memory"
## 국내 
### 한국인터넷정보학회 2014년 춘계 학술 발표 대회
 - 2014.05
 "안드로이드 기반 MDM(Mobile Device Management) 시스템의 구현"
 "모바일 디바이스를 위한 CC 기반 보호 프로파일 분석"
### 제41회 한국정보과학회 정기총회 및 동계 학술 발표회
 - 2014.12
 "안드로이드 로그 시스템을 이용한 악성행위 탐지 기법에 대한 연구"
