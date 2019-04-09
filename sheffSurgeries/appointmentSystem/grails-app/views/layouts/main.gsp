<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<a class="home navbar-brand" href="${createLink(uri: '/')}">Sheff Surgeries</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
    <section class="row colset-2-its">
            <ul class="navbar-nav mr auto">
      <li class="nav-item">
        <g:link controller="Appointment" action="create" class="nav-link active">Set an Appointment</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Doctor" action="create" class="nav-link active">Add Doctor</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Nurse" action="create" class="nav-link active">Add Nurse</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Patient" action="create" class="nav-link active">Add Patient</g:link>
      </li>
      <li class="nav-item">
   <g:link controller="Surgery" action="create" class="nav-link active">Add Surgery</g:link>
      </li>
      <li class="nav-item">
<g:link controller="Receptionist" action="create" class="nav-link active">Add Receptionist</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Prescription" action="create" class="nav-link active">Add Prescription</g:link>
      </li>
</ul>
</section> 
  </div>
</nav>


<g:layoutBody/>


</body>
</html>
