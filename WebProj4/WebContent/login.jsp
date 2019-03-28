<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>LOGIN</title>
</head>
<body>

<s:property value="LoginDTOList.get(0).username"/>さん、ようこそ！
<br>
<table>
   <tbody>
   <tr>
       <th>USERNAME</th>
       <th>PASSWORD</th>
   </tr>
   <tr>
   <s:iterator value="loginDTOList">
      <th><s:property value="username"/></th>
      <th><s:property value="password"/></th>
   </s:iterator>
   </tr>
   </tbody>
</table>

</body>
</html>