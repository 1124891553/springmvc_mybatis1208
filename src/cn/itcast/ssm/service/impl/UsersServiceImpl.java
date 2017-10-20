package cn.itcast.ssm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.UserMapperCustom;
import cn.itcast.ssm.po.UserCustom;
import cn.itcast.ssm.po.UserQuery;
import cn.itcast.ssm.service.UsersService;

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Override
	public UserCustom findUserBylogin(UserQuery userQuery)throws Exception{
		// TODO Auto-generated method stub
		UserCustom userCustom = userMapperCustom.findUserBylogin(userQuery);
		
		return userCustom;
	}
	

}
