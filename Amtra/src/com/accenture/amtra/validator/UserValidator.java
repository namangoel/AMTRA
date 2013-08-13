package com.accenture.amtra.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.accenture.amtra.model.UserModel;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeId",
				"required.employeeId", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeFirstName",
				"required.employeeFirstName", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeLastName",
				"required.employeeLastName", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
				"required.confirmPassword", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "enterpriseId",
				"required.enterpriseId", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId",
				"required.emailId", "Field name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "block",
				"required.block", "Field name is required.");
		
		/**
		 * Role should not be mandatory as it is going to be assigned by the admin.
		 */
		/*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role",
				"required.role", "Field name is required.");*/
		
		UserModel user = (UserModel)target;
		
		if(!(user.getPassword().equals(user.getConfirmPassword()))){
			errors.rejectValue("password", "notmatch.password");
		}
		
		if(user.getBlock().length==0){
			errors.rejectValue("block", "required.block");
		}
	}

}
