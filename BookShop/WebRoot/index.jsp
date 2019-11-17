<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
   <s:form action= "publishment/publishment_addPublishment" method="post">
   <s:textfield name="publishment.book_id" label="书号"></s:textfield>
   <s:textfield name="publishment.book_name" label="书名"></s:textfield>
   <s:textfield name="publishment.userrs_id" label="卖家号"></s:textfield>
   <s:textfield name="publishment.edit_writer" label="作者"></s:textfield>
   <s:textfield name="publishment.edit_place" label="出版社"></s:textfield>
   <s:textfield name="publishment.degree" label="新旧程度"></s:textfield>
   <s:textfield name="publishment.old_price" label="原价"></s:textfield>
   <s:textfield name="publishment.new_price" label="二手价"></s:textfield>
   <s:textfield name="publishment.publish_time" label="发布时间"></s:textfield>
   <s:submit value="提交"></s:submit>
   </s:form>
  </body>
</html>
