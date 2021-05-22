package com.ncu.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix= {"CSE","SOM","ECE","EEE"};
	
	@Override
	public void initialize(CourseCode CourseCode) {
		// TODO Auto-generated method stub
		CourseCode.message();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=false;
		
		if(value!=null)
		{
			for(String tempPrefix:coursePrefix)
			{
				if(value.equals(tempPrefix))
				{
					result=true;
					break;
				}
			}
			}
		
		return result;
	}

}
