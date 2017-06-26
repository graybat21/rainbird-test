package com.ehwa.rainbird.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ehwa.rainbird.backend.mapper.UserMapper;
import com.ehwa.rainbird.backend.restful.v1.user.UserService;
import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//@RestController
//public class TestController {
//
//	@ApiOperation(value = "헬로우 테스트", httpMethod = "GET", notes = "헬로우 테스트입니다")
//	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid input:"),
//			@ApiResponse(code = 200, message = "Ok") })
//	@RequestMapping(value = "/hello", method = RequestMethod.POST)
//	public String hello(@ApiParam(value = "키값", required = true, defaultValue = "기본값") String value) {
//		return "Blind Interview Server Running\n";
//	}
//}

@Api(value = "TestController")
@RestController
public class TestController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserMapper userMapper;
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success load data") })
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ResponseEntity<List<UserVO>> helloGet() throws Exception {

		// Map<String, String> datas = new HashMap<>();
		// datas.put("data", "name : " + name + ", password" + password);

		List<UserVO> list = userService.selectTest();
		return ResponseEntity.ok(list);
	}
	
	// 간단한 쿼리문 이용시 사용하는 방법
//	@ApiResponse(code=200, message="success load data by mapper")
//	@RequestMapping(value = "/mybatisTest", method = RequestMethod.POST)
//	@ResponseBody
//	public List<UserVO> mybatismappingtest(){
//		return userMapper.test1();
//	}
	
	
}