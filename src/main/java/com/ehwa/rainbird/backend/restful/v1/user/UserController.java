package com.ehwa.rainbird.backend.restful.v1.user;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author C.H.Lee
 */
@RestController
@RequestMapping("/v1/users")
@Slf4j
@EnableTransactionManagement
public class UserController {
	@Autowired
	private UserService userService;
	// @Autowired
	// private JwtTokenUtil jwtTokenUtil;
	// @Value("${jwt.header}")
	// private String tokenHeader;

	/**
	 * @throws Exception
	 * @throws ParameterException
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 * 
	 */
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ApiOperation(value = "회원 가입")
	@Transactional
	public void createUser(HttpServletResponse response, @RequestBody UserVO userVO) throws Exception
	// throws ParameterException, UnsupportedEncodingException,
	// MessagingException {
	{
		log.info(userVO.toString());
		// ResponseBuilder builder = new ResponseBuilder(response);
		userService.insertUser(userVO);
	}

}