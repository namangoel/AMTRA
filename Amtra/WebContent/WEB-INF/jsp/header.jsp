<link rel="stylesheet" href="css/amtra/amtra-css.css" />
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
<div class="header">
<table style="height: 100%;width: 100%;">
<tr>
	<td align="left"><security:authorize ifAnyGranted="ROLE_MODERATOR,ROLE_ADMIN">User : <security:authentication property="principal.username"/></security:authorize></td>
	<td></td>
	<td align="right"><security:authorize ifAnyGranted="ROLE_MODERATOR,ROLE_ADMIN"><a href="<c:url value='/j_spring_security_logout' />" >Logout</a></security:authorize></td>
</tr>
<tr>
	<td></td>
	<td class="header">amtra</td>
	<td></td>
</tr>
<tr>
	<td></td>
	<td></td>
	<td align="right">Date</td>
</tr>
</table>
</div>
</body>