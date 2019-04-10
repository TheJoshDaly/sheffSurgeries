<!doctype html>
<html>
<head>
<meta name="layout" content="main"/>
<title>Login as a Doctor</title>
</head>

<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
<body>

<g:if test="${flash.message}">

<div class="message">${flash.message}></div>

</g:if>

<g:form action="validate">

<table>
<tr class="prop">
<td class="name">
<label for="doctorEmail">Enter your Email: </label>
</td>
<td class="value">
<input type="text" id="doctorEmail" name="doctorEmail" value="">
</td></tr>
<tr class="prop">
<td class="password">
<label for="password">Enter your password: </label>
</td>
<td class="value">
<input type="password" id="password" name="password" value="">
</td></tr>
<tr><td></td>
<td>
<input type="submit" value="login"/>
</td></tr>
</table>

</g:form>

</body>
</html>
