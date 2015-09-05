package com.metaworks.board.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration 
/*
spring-boot 프로젝트에서는 웹어플리케이션 실행시 별도의 외장 톰캣 설치도 필요없고 web.xml 설정도 필요없는데 이는 
@EnableAutoConfiguration 어노테이션 기능으로 가능하다.
 
The @EnableAutoConfiguration annotation switches on reasonable default behaviors based on the content of your classpath. For example, because the application depends on the embeddable version of Tomcat (tomcat-embed-core.jar), a Tomcat server is set up and configured with reasonable defaults on your behalf. And because the application also depends on Spring MVC (spring-webmvc.jar), a Spring MVC DispatcherServlet is configured and registered for you — no web.xml necessary! Auto-configuration is a powerful, flexible mechanism. See the API documentation for further details.
위 영문설명을 요약 번역해보자.
@EnableAutoConfiguration는 classpath의 내용에 기반해서 영리하게 작업들을 자동화해준다. 즉 classpath에 tomcat-embed-core.jar가 존재하면 톰캣 서버가 세팅되고, spring-webmvc.jar가 존재하면 자동으로 web.xml을 생성해 DispatcherServlet을 등록해준다.
톰캣을 임베디드하고 web.xml을 자동생성해주는 기능이 실서비스에서는 오히려 커스터마이징하기 힘들게 할 수 있겠지만 프로토타입 개발또는 간단한 웹개발 시에는 요긴할 듯 하다.
 
게다가 아래와 같이 main함수로 작성하고 spring-boot maven build 플러그인의 도움을 받아 빌드하면, 웹애플리케이션을 마치 일반 java 프로그램 실행한듯(실행가능한 jar파일로 패키징) 쉽게 배포 및 실행이 가능하다는 장점이 생긴다. (mvn clean package && java -jar target/gs-rest-service-0.1.0.jar)
[출처] spring / spring boot의 @EnableAutoConfiguration|작성자 sm_woo
 */
public class TestController {
	
	@RequestMapping("/")
	public String home() {
		return "hello world!";
	}
	
	@RequestMapping("/home2")
	public String home2() {
		return "hello world2!!";
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(TestController.class, args);
//	}
}
