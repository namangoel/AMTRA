<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
<table  cellpadding="2" cellspacing="2" align="center">
	<tr>
		<td width="200px" height="100%" style="background-color:#62F24B;"><tiles:insertAttribute name="menu" />
		</td>
		<td>
		<table  cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td width="1200px" height="80px" style="background-color:#20A90B;"><tiles:insertAttribute name="header" />
		</tr>
		<tr>
			<td width="1200px" height="600px"><tiles:insertAttribute name="body" />
		</tr>
		<tr>
			<td width="1200px" height="50px"><tiles:insertAttribute name="footer" />
		</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>
