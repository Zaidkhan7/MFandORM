package com.ncu.validation;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordValidator implements ConstraintValidator<IsValidPass,String>{

	private static final String  Password_Pattern="^(?=.*[A-Z])(?=.*[@#$%-+/*]).{8,30}";
	private Pattern p;
	private Matcher m;
	
	public PasswordValidator()
	{
		p = Pattern.compile(Password_Pattern);
	}
	public void initialize(IsValidPass IsValidPass)
	{
		IsValidPass.message();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value==null)
		{
			return false;
		}
		m = p.matcher(value);
		
		return m.matches();
	}

}
