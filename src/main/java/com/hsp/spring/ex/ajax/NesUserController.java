package com.hsp.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsp.spring.ex.jsp.bo.UserBO;
import com.hsp.spring.ex.jsp.model.User;

@Controller
@RequestMapping("/ajax/user")
public class NesUserController {

	@Autowired
	private UserBO userBO;
	
	@GetMapping("/list")
	public String userList(Model model) {
		List<User> userList = userBO.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "ajax/user/list";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> addUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce) {
		
		int count = userBO.addUser(name, birthday, email, introduce);
		
		// 성공여부 json
		// 성공 : {"result":"success" }
		// 실패 : {"result":"fail"}
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
		
		
 	}
	
	@GetMapping("/input")
	public String inputUser() {
		return "ajax/user/input";
	}
	
	
	// 이메일 주소를 전달 받고, 중복 여부를 확인한다.
	// 중복 여부 결과를 response로 전달한다.
	@GetMapping("/is_duplicate")
	@ResponseBody
	public Map<String, Boolean> isDuplicateEmail(@RequestParam("email") String email) {
		
		// 중복된 경우
		// 중복되지 않은 경우
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(userBO.isDuplicateEmail(email)) {
			// 중복된 경우
			resultMap.put("is_duplicate", true);
		} else {
			resultMap.put("is_duplicate", false);
		}
		
		return resultMap;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
