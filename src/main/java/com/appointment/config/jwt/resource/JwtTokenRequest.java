package com.appointment.config.jwt.resource;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String userName;
	private String password;

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}

	
	
}
