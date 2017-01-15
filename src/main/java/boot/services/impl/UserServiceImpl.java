package boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import boot.model.User;
import boot.services.UserRepo;
import boot.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepo userRepo;
	
	
	public UserServiceImpl() {
		super();
	}


	public UserRepo getUserRepo() {
		return userRepo;
	}


	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}


	public User getUser(String username) {
		return new User("bla", 1);
	}

}
