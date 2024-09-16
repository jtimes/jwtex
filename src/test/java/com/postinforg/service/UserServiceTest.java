package com.postinforg.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
	
	@Autowired UserService userService;

	@Test
	void test() {
//		Assertions.assertEquals(true, true);
		System.out.println(">>> test");
		
		userService.getUserById("amsoft");
	}

}
