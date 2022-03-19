package com.sip.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.springboot.service.UserService;
import com.sip.springboot.web.dto.UserRegistrtionDto;

@Controller
@RequestMapping("/registration")
public class UserControlerReg {
private UserService userservice;

public UserControlerReg(UserService userservice) {
	super();
	this.userservice = userservice;
}
@ModelAttribute("user")
public UserRegistrtionDto userRegistrationDto() {
    return new UserRegistrtionDto();
}
@GetMapping
public String showRegistrationForm() {
	return "registration";
}

@PostMapping
public String registerUserAccount (@ModelAttribute("user") UserRegistrtionDto registrationDto )
{userservice.save(registrationDto);
return "redirect:/registration?success";
	
}


}
