package com.ehwa.rainbird.backend.restful.v1.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

@Repository
public interface UserDAO {

	public void insertUser(UserVO user) throws Exception;

	public List<UserVO> selectTest() throws Exception;
}
