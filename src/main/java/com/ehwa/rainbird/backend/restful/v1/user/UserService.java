package com.ehwa.rainbird.backend.restful.v1.user;

import java.util.List;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

public interface UserService {
	public void insertUser(UserVO user) throws Exception;

	public List<UserVO> selectTest() throws Exception;
}
