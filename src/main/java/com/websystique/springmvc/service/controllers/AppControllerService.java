/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.service.controllers;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;

/**
 *
 * @author George.Pasparakis
 */
public class AppControllerService {
    
    @Autowired
    UserService userService;
    
        public void listUsersWrapper(ModelMap model) {
            String user = "user";
            String loggedUser = "loggedinuser";
            this.findAllUsers();
            this.modelAddAttribute(model, user, this.findAllUsers());
            this.modelAddAttribute(model, loggedUser, this.getPrincipal());
        }

        List<User> findAllUsers() {
            return userService.findAllUsers();
        }
        
        ModelMap modelAddAttribute(ModelMap model, String name, Object o) {
            model.addAttribute(name, o);
            return model;
        }
        
        String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
}
