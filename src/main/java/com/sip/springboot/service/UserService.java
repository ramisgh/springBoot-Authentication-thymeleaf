package com.sip.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sip.springboot.model.User;
import com.sip.springboot.web.dto.UserRegistrtionDto;

public interface UserService extends UserDetailsService{
 User save(UserRegistrtionDto registrationDto);
}
