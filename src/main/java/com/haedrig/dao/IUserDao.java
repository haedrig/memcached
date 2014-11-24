package com.haedrig.dao;

import java.util.List;

import com.haedrig.entity.User;

public interface IUserDao {

	List<User> findUsers();
}
