<!doctype html>
<html>
<head>
<meta name="layout" content="main"/>
<title>Login as a Doctor</title>

<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
<body>

<g:if test="${flash.message}">

<div class="message">${flash.message}></div>

</g:if>

<g:form action="validate">

<input type="hidden" name="cName" value="${cName}">

<input type="hidden" name="aName" value="${aName}">

</body>
</html>
