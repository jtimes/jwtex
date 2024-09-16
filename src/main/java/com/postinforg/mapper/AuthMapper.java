package com.postinforg.mapper;

import java.util.Map;

import com.postinforg.domain.UserImpl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper {
	EgovMap getAuthDetail(Map paramMap) throws Exception;

	EgovMap getAuthToken(Map paramMap) throws Exception;

	int updateToken(Map paramMap) throws Exception;

	int authTokenClear(Map paramMap) throws Exception;
	
	UserImpl getUser(Map paramMap);
	
}
