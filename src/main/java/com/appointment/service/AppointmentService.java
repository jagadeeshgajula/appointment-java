package com.appointment.service;

import java.util.List;

import com.appointment.model.AppointmentModel;

public interface AppointmentService {

public AppointmentModel save(AppointmentModel app);
	
public AppointmentModel update(AppointmentModel reg);

public List<AppointmentModel> listAppointmentsByUserId(Integer userId);
}
