<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login.action" method="post">
 <table width="50%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
      <caption>
      <span class="style1">      登 录      </span><br>
      </caption>
      <tr align="left">
        <th width="40%" height="35" align="center" scope="row">用户名:</th>
        <td width="60%"><input name="userCustom.username" type="text" maxlength="20"></td>
      </tr>
      <tr align="left">
        <th height="35" align="center" scope="row">密&nbsp;&nbsp;码:</th>
        <td><input name="userCustom.password" type="password"  maxlength="30"></td>
      </tr>
      <tr align="center">
        <th height="35" colspan="2" scope="row"><input type="submit" name="Submit" value="登录">
      <!--   <input type="button" name="Submit2" value="注册" onclick="javascript:window.location='userRegister.jsp'"> --> 
      </th>
      </tr>
    </table>
</form>
</body>
</html>