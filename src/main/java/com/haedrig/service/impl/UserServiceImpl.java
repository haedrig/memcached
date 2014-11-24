package com.haedrig.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haedrig.dao.IUserDao;
import com.haedrig.entity.User;
import com.haedrig.service.IUserService;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

	@Autowired
	protected IUserDao iUserDao;
	
	public List<User> findUsers() {
		return iUserDao.findUsers();
	}

}
