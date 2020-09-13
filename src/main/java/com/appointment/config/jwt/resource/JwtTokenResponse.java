package com.appointment.config.jwt.resource;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtTokenResponse implements Serializable {

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;

	private  Integer id;
	
	private String userName;
	
	public String getToken() {
		return this.token;
	}

	
	public JwtTokenResponse(String token) {
		this.token = token;
	}

	public JwtTokenResponse(String token, Integer id,String userName) {
		super();
		this.token = token;
		this.id = id;
		this.userName = userName;
	}
	
}