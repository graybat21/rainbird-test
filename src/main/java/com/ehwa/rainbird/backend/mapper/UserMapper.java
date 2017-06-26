package com.ehwa.rainbird.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ehwa.rainbird.backend.restful.v1.vo.UserVO;

@Mapper
public interface UserMapper {

	@Select("select * from tb_users")
	List<UserVO> test1();
}
