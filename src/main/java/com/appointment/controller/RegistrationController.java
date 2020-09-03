package com.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.model.Registration;
import com.appointment.service.RegistrationService;

@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	RegistrationService regser;
	@PostMapping("/saveUser")
	public Registration saveuserdetails(@RequestBody Registration reg)
	{
		System.out.println(reg.toString());
		return regser.save(reg);
	}
	
	@PutMapping("/updateUser")
	public Registration update(@RequestBody Registration reg)
	{
		return regser.update(reg);
	}
	
	@GetMapping("/findUser")
	public Registration findByUserNameAndPassword(@RequestParam String userName, @RequestParam String password)
	{
		return regser.findByUserNameAndPassword(userName,password);
	}
	
	@GetMapping("/getUserByUId")
	public Registration findByUserId(@RequestParam Integer userId)
	{
		return regser.findUserByUId(userId);
	}
}
