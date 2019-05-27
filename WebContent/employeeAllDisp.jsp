
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bean"
	class="jp.co.central_soft.co.jp.train2019.bean.EmployeeListAllDispBean"
	scope="request" />
<%@ page
	import="jp.co.central_soft.co.jp.train2019.bean.EmployeeAllDispBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BeanStartWebApp</title>
</head>
<body>
	従業員情報
	<br>
	<table>
		<%
			for (EmployeeAllDispBean emp : bean.getEmpList()) {
		%>
		<tr>
			<td>EmployeeID:</td>
			<td><%=emp.getEmployeeID()%></td>
		</tr>
		<tr>
			<td>EmployeeName:</td>
			<td><%=emp.getEmployeeName()%></td>
		</tr>
		<tr>
			<td>BloodType:</td>
			<td><%=emp.getBloodType()%></td>
		</tr>
		<tr>
			<td>eMail:</td>
			<td><%=emp.geteMail()%></td>
		</tr>
		<tr>
			<td>HireFiscalYear:</td>
			<td><%=emp.getHireFiscalYear()%></td>
		</tr>
		<tr>
			<td>Birtdday:</td>
			<td><%=emp.getBirthday()%></td>
		</tr>
		<tr>
			<td>Height:</td>
			<td><%=emp.getHeight()%></td>
		</tr>
		<tr>
			<td>Weight:</td>
			<td><%=emp.getWeight()%></td>
		</tr>
		<%
			}
		%>
	</table>


</body>
</html>