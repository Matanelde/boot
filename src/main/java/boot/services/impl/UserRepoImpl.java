package boot.services.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import boot.model.User;
import boot.services.UserRepo;


@Repository
public class UserRepoImpl implements UserRepo {

	
	@Autowired
	private SessionFactory sessionFactory;
	public UserRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
