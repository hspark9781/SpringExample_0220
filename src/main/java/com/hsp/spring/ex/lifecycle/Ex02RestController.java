package com.hsp.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsp.spring.ex.lifecycle.model.Person;

@RestController // => @Controller + @ResponseBody
@RequestMapping("/lifecycle/ex01") // 공통적으로 들어가는 url 
public class Ex02RestController {
	
	@RequestMapping("/3")
	public String stringResponse() {
		return "안녕하세요 <br> <b>RestController</b> 입니다.";
	}
	
	// 직접 만든 클래스 => 객체 형태는 json을 통해 문자열로 나타낸다.
	@RequestMapping("/4")
	public Person objectResponse() {
		Person person = new Person();
		person.setName("박현석");
		person.setAge(27);
		
		return person;
	}
	
	// status 코드를 포함한 response
	@RequestMapping("/5")
	public ResponseEntity<Person> entityResponse() {
		Person person = new Person();
		person.setName("박현석");
		person.setAge(27);
		
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
	
	
	
	
}
