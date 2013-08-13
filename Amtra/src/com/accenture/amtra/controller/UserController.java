package com.accenture.amtra.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.amtra.model.UserModel;
import com.accenture.amtra.service.UserService;
import com.accenture.amtra.validator.UserValidator;

@Controller
public class UserController {
	
	UserValidator userValidator;
	
	@Autowired
	UserService userService;
	
	@Autowired
	public UserController(UserValidator userValidator) {
		this.userValidator = userValidator;
	}
	
	/*@ModelAttribute("userModel")
	 public UserModel getGreetingObject() {
	  return new UserModel();
	 }*/

	
	@RequestMapping(value = "/userForm",method = RequestMethod.POST)
	public String processSubmit(
			@ModelAttribute("userModel") UserModel userModel,
			BindingResult result, SessionStatus status) {
		
		userValidator.validate(userModel, result);
		
		if (result.hasErrors()) {
			//if validator failed
			return "userForm";
		} else {
			status.setComplete();
			//form success
			userService.save(userModel);
			return "welcome";
		}
	}
	
	@RequestMapping(value = "/userForm",method = RequestMethod.GET)
	public ModelAndView initForm(ModelMap model){
		
		UserModel userModel = new UserModel();
		//Make "BA06" as default checked value
		userModel.setBlock(new String []{"BA06"});
		
		//command object
		model.addAttribute("userModel", userModel);
		
		//return form view
		return new ModelAndView("userForm","command",userModel);
	}
	
	@RequestMapping(value = "/searchUser",method = RequestMethod.GET)
	public ModelAndView searchUser(ModelMap model){
		
		UserModel userModel = new UserModel();
		//Make "BA06" as default checked value
		userModel.setBlock(new String []{"BA06"});
		
		//command object
		model.addAttribute("userModel", userModel);
		
		//return form view
		return new ModelAndView("searchUser","command",userModel);
	}
	
	@ModelAttribute("blockMap")
	public  Map<String,String> populateBlockList() {
		
		//Data referencing for block checkboxes
		 Map<String,String> blockMap = new LinkedHashMap<String,String>();
		 blockMap.put("1","BA06");
		 blockMap.put("2","BA08");
		 blockMap.put("3","BA09");
		
		return blockMap;
	}
	
	@ModelAttribute("roleMap")
	public Map<String,String> populateRoleList() {
		
		//Data referencing for role list box
		Map<String,String> roleMap = new LinkedHashMap<String,String>();
		roleMap.put("1", "Admin");
		roleMap.put("2", "Mod");
		
		return roleMap;
	}
}
