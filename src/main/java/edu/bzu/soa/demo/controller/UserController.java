package edu.bzu.soa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bzu.soa.demo.model.User;

@RestController 
@RequestMapping("/user")
public class UserController {
	 String userName ="";
	 List <User> users = new ArrayList<User>();
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
	User getUser(@PathVariable long id) {
	 
		if(id>5) {
			userName = "Elias";
		}
		else {
			userName = "Ali";
		}
		return new User(id, userName);
	}
    
    @RequestMapping(method = RequestMethod.GET)
   	List<User> getUsers() {
   	 
   		 
   		return users;
   	}
    
    @RequestMapping(method = RequestMethod.POST)
    List<User> addUser(@RequestBody User user) {
    	users.add(user);
		return users;
    }
    

}
