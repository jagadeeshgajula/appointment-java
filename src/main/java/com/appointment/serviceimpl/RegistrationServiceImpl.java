package com.appointment.serviceimpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.model.Registration;
import com.appointment.repository.RegistrationRepo;
import com.appointment.service.RegistrationService;



@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
RegistrationRepo repo;

@Override
public Registration save(Registration reg) {
	// TODO Auto-generated method stub
	 Random rand = new Random();

     long x = (long)(rand.nextDouble()*100000000000000L);

     String s = String.valueOf(52) + String.format("%016d", x);
      
      reg.setMemberId(s);
	return repo.save(reg);
}

@Override
public Registration update(Registration reg) {
	// TODO Auto-generated method stub
	return repo.save(reg);
}

@Override
public Registration findByUserNameAndPassword(String userName, String password) {
	// TODO Auto-generated method stub
	return repo.findByUserNameAndPassword(userName,password );
}

@Override
public Registration findUserByUId(Integer id) {
	// TODO Auto-generated method stub
	return repo.findById(id).get();
}

}
