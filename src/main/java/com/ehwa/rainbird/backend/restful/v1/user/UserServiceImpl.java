package com.ehwa.rainbird.backend.restful.v1.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author C.H.Lee
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void insertUser(UserVO user) throws Exception {
		userDAO.insertUser(user);
	}

	@Override
	public List<UserVO> selectTest() throws Exception {
		return userDAO.selectTest();
	}

}