package com.appointment.service;

import com.appointment.model.Registration;

public interface RegistrationService {

	public Registration save(Registration reg);
	
	public Registration update(Registration reg);
	
	public Registration findUserByUId(Integer id);
	
	public Registration findByUserNameAndPassword( String userName, String password);
}
