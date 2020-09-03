package com.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appointment.model.AppointmentModel;


//Uses Appointment model and Primarykey Datatype will pass as arguments

public interface AppointmentRepo extends JpaRepository<AppointmentModel, Integer>{

	@Query("select r from bookedappointments r where r.userId=:userId")
	List<AppointmentModel> listAppointmentsByUserId(@Param("userId")Integer userId);

}
