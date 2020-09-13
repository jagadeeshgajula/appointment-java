package com.appointment.config.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.appointment.model.Registration;
import com.appointment.service.RegistrationService;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	@Autowired
	RegistrationService registrationService;
	
	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Registration user = registrationService.findByUserName(username);
		List<JwtUserDetails> inMemoryUserList = new ArrayList<>();
		
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		inMemoryUserList.add(
				new JwtUserDetails(
						user.getUserId(),
						user.getUserName(),
						encoder.encode(user.getPassword()),
						"user"));
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream().filter(users -> users.getUsername().equals(username)).findFirst();
		
		
		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return findFirst.get();
	}

}
