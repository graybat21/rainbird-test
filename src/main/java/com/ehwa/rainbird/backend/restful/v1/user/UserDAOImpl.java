package com.ehwa.rainbird.backend.restful.v1.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	private static String namespace = "com.ehwa.mybatis.mysql.UserMapper";
	@Autowired
	private SqlSession session;

	@Override
	public void insertUser(UserVO user) throws Exception {
		session.insert(namespace + ".insertUser",user);
	}

	@Override
	public List<UserVO> selectTest() throws Exception {
		return session.selectList(namespace + ".selectTest");
	}
	
	

}
