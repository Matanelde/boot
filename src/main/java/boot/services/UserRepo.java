package boot.services;

import boot.model.User;

public interface UserRepo {

	public User getUser(String username);
}
