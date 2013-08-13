<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
.error {
	color: #ff0000;
}
.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}

</style>
</head>
<body>
<h2>Find User</h2>

<form:form method="POST" commandName="userModel">

<form:errors path="*" cssClass="errorblock" element="div"/>

<table>
<tr>
<td>Employee Id : </td>
<td><form:input path="employeeId" /></td>
<td><form:errors path="employeeId" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>First Name : </td>
<td><form:input path="employeeFirstName" /></td>
<td><form:errors path="employeeFirstName" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>Last Name : </td>
<td><form:input path="employeeLastName" /></td>
<td><form:errors path="employeeLastName" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>Enterprise Id : </td>
<td><form:input path="enterpriseId" /></td>
<td><form:errors path="enterpriseId" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>Email Id : </td>
<td><form:input path="emailId" /></td>
<td><form:errors path="emailId" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>Block List : </td>
<td>
	<form:checkboxes items="${blockMap}" path="block" /> 
</td>
<td><form:errors path="block" cssClass="error" /></td>
</tr>

<security:authorize ifAnyGranted="ROLE_ADMIN">
<tr>
<td>Role : </td>
<td>
<form:select path="role">
	<form:option value="NONE" label="--- Select ---"/>
	<form:options items="${roleMap}" />
</form:select>
</td>
</tr>
</security:authorize>

<tr>
<td colspan="3"><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>