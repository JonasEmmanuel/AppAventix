package com.qrcodeteam.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.qrcodeteam.beans.EntrepriseEmploye;


public class EntrepriseEmployeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return EntrepriseEmploye.class.equals(clazz);
	}
	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
		
	}

}
