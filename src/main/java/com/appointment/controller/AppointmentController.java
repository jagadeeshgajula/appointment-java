package com.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.model.AppointmentModel;
import com.appointment.service.AppointmentService;

@RestController
@CrossOrigin
public class AppointmentController {

	@Autowired 
	AppointmentService appser;
	
	@PostMapping("/saveAppointment")
	public AppointmentModel save(@RequestBody AppointmentModel app)
	{
		System.out.println(app.toString());
		return appser.save(app);
	}
	
	@PutMapping("/updateAppointment")
	public AppointmentModel update(@RequestBody AppointmentModel app)
	{
		return appser.update(app);
	}
	@GetMapping("/getAppointmentsByUId")
	public List<AppointmentModel> listAppointmentsByUserId(Integer userId)
	{
		return appser.listAppointmentsByUserId(userId);
	}
}
