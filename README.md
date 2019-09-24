# Multi Language Test
* JDK 1.8
* Spring 5.1.4
* Tomcat 8.5
* Maven 3

### MessageSource
서로 다른 로케일에 대한 국제화 메시지를 제공하기 위한 전략 인터페이스

스프링은 이 인터페이스의 구현체로 아래 두 가지를 제공한다.
* ResourceBundleMessageSource: 리소스 번들이라 불리는 properties 파일로부터 메시지를 읽어온다.

* ReloadableResourceBundleMessageSource: 리소스 번들이 변경되면 애플리케이션을 재시작할 필요없이 다시 로딩할 수 있는 메시지 소스

이 프로젝트에선 ReloadableResourceBundleMessageSource를 사용하였다.