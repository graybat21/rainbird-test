package com.ehwa.rainbird.backend;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ehwa.rainbird.backend.restful.v1.user.UserDAO;
import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RainbirdBackendApplicationTests {

//	@Autowired
//	private DataSource ds;
//	@Autowired
//	private SqlSessionFactory sqlSession;
	@Autowired
	private UserDAO dao;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void testConnection() throws Exception {
//		System.out.println("ds : " + ds);
//		Connection con = ds.getConnection();
//		System.out.println("con : " + con);
//		con.close();
//	}
//
//	@Test
//	public void testSqlSession() throws Exception {
//		System.out.println("sqlSession : " + sqlSession);
//	}
	
	@Test
	public void testMapper() throws Exception{
		UserVO user = new UserVO();
		user.setUuid("1");
		user.setGender(1);
		user.setBirthyear(1986);
		user.setLanguage("kr");
		user.setAlarm_distance(200);
		user.setAlarm_type(1);
		
		dao.insertUser(user);
	}

}
