package com.editberg.service;

import com.editberg.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}
