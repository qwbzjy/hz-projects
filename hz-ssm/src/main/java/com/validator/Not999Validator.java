package com.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Not999Validator implements ConstraintValidator<Not999, Long> {

	public void initialize(Not999 arg0) {
		
	}

	public boolean isValid(Long vaule, ConstraintValidatorContext context) {
		if(vaule==999){
			return false;
		}else{
			return true;
		}
	}



}
