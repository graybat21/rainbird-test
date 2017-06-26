package com.ehwa.rainbird.backend.restful.v1.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class UserVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String uuid;
	@Getter
	@Setter
	private int gender;
	@Getter
	@Setter
	private int birthyear;
	@Getter
	@Setter
	private String language;
	@Getter
	@Setter
	private int alarm_distance;
	@Getter
	@Setter
	private int alarm_type;

}
