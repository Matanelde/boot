package boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import boot.model.User;
import boot.services.UserService;

@RestController(value = "/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	public UserController() {
		super();
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody()
	public User getUser(@PathVariable("name") String username){
		return userService.getUser(username);
	}

}
