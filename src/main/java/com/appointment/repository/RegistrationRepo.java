package com.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appointment.model.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer>{
@Query("select r from userdetails r where r.userName=:userName AND r.password=:password")
	Registration findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

Registration findByUserName(String userName);
	
	

}
