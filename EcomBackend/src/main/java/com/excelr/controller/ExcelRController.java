package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Headphones;
import com.excelr.model.Laptops;
import com.excelr.model.Login;
import com.excelr.model.Mobiles;
import com.excelr.service.ExcelRService;

@RestController
@CrossOrigin("*")
public class ExcelRController {
	@Autowired
	private ExcelRService excelRservice;
	
	@GetMapping("/laptops")
	public List<Laptops> getLaptops() {
		return excelRservice.getAllLaptops();
	}
	
	@GetMapping("/mobiles")
	public List<Mobiles> getMobiles() {
		return excelRservice.getAllMobiles();
	}
	
	@GetMapping("/headphones")
	public List<Headphones> getHeadphones() {
		return excelRservice.getAllHeadphones();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		Login loginResponse =  excelRservice.performLogin(login.getUsername());
		if(loginResponse.getPassword().equals(login.getPassword())) {
			return "Login Success";
		} else {
			return "Login Fail";
		}
	}
}
