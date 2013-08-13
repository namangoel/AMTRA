<link rel="stylesheet" href="css/amtra/amtra-css.css" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Add User</h2>

<form:form method="POST" commandName="userModel">

<form:errors path="*" cssClass="errorblock" element="div"/>

<table>
<tr>
<td>Employee Id : </td>
<td><form:input path="employeeId" disabled='${userModel.modify}'/></td>
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
<td>Password : </td>
<td><form:input path="password" /></td>
<td><form:errors path="password" cssClass="error" /></td>
</tr>
<tr>

<tr>
<td>Confirm Password : </td>
<td><form:input path="confirmPassword" /></td>
<td><form:errors path="confirmPassword" cssClass="error" /></td>
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
