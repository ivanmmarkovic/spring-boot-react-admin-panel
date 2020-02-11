package com.example.adminpanel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.adminpanel.domain.Role;
import com.example.adminpanel.domain.User;
import com.example.adminpanel.repository.RoleRepository;
import com.example.adminpanel.repository.UserRepository;

@Service
public class DbInit implements CommandLineRunner{

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Role role = new Role("ADMIN");
		User user = new User("admin", passwordEncoder.encode("admin"));
		userRepository.save(user);
		role.setUser(user);
		roleRepository.save(role);
		*/
	}

}
