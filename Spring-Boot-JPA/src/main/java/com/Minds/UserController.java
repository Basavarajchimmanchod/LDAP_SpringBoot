package com.Minds;
import com.Minds.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService ;
	
	
	@RequestMapping("/")
	public List<UserRecord> getAllUser(){
		
		return userService.getAllUsers();
		
	}

}
