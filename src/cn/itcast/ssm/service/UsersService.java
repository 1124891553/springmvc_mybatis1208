package cn.itcast.ssm.service;


import cn.itcast.ssm.po.UserCustom;
import cn.itcast.ssm.po.UserQuery;

public interface UsersService {
	
	public UserCustom findUserBylogin(UserQuery userQuery)throws Exception;
	
	
}
