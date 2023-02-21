package com.hsp.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤 클래스 만들면 꼭 Controller annotation 만들어주기
public class Ex01Controller {

		@RequestMapping("/lifecycle/ex01/1")
		@ResponseBody
		public String stringResponse() {
			return "예제 1번 문자열을 담은 Response";
		}
		
		
		// 맵을 리턴하는 메소드
		@RequestMapping("/lifecycle/ex01/2")
		@ResponseBody
		public Map<String, Integer> mapResponse() {
			// "apple" : 1500
			Map<String, Integer> fruitMap = new HashMap<>();
			fruitMap.put("apple", 1500);
			fruitMap.put("banana", 3000);
			fruitMap.put("orange", 1000);
			
			return fruitMap;
			// 맵 데이터 자체를 전달하는게 것이 아닌 자료구조 같은 데이터 형태는 json을 통해 '**문자열**'로 전달한다.
		}
		
		
		
		
		
}
