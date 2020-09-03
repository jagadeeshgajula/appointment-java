package com.appointment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.model.AppointmentModel;
import com.appointment.repository.AppointmentRepo;
import com.appointment.service.AppointmentService;


@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepo repo;
	
	@Override
	public AppointmentModel save(AppointmentModel app) {
		// TODO Auto-generated method stub
		return repo.save(app);
	}

	@Override
	public AppointmentModel update(AppointmentModel app) {
		// TODO Auto-generated method stub
		return repo.save(app);
	}

	@Override
	public List<AppointmentModel> listAppointmentsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return repo.listAppointmentsByUserId(userId);
	}

}
