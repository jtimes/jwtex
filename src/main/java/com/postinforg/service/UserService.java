package com.postinforg.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.postinforg.domain.UserImpl;
import com.postinforg.mapper.AuthMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

	final AuthMapper authMapper;
	
	public UserImpl getUserById(String id) {
		Map paramMap = new HashMap();
		paramMap.put("id", id);
		return authMapper.getUser(paramMap);
	}
	
}
