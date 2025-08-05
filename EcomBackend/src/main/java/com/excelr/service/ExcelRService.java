package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Headphones;
import com.excelr.model.Laptops;
import com.excelr.model.Login;
import com.excelr.model.Mobiles;
import com.excelr.repo.HeadphonesRepo;
import com.excelr.repo.LaptopsRepo;
import com.excelr.repo.LoginRepo;
import com.excelr.repo.MobilesRepo;

@Service
public class ExcelRService {
	@Autowired
	private LaptopsRepo laptopsrepo;
	
	@Autowired
	private MobilesRepo mobilesrepo;
	
	@Autowired
	private HeadphonesRepo headphonesrepo;
	
	@Autowired
	private LoginRepo loginrepo;
	
	public java.util.List<Laptops> getAllLaptops() {
		return laptopsrepo.findAll();
	}
	
	public java.util.List<Mobiles> getAllMobiles() {
		return mobilesrepo.findAll();
	}
	
	public java.util.List<Headphones> getAllHeadphones() {
		return headphonesrepo.findAll();
	}
	
	public Login performLogin(String username) {
		return loginrepo.findByUsername(username);
	}
}
