package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.UserCustom;
import cn.itcast.ssm.po.UserQuery;

public interface UserMapperCustom {

	public UserCustom findUserBylogin(UserQuery userQuery)throws Exception;
}
