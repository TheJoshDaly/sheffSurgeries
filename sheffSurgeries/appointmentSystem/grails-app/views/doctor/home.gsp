<!doctype html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta name="layout" content="main"/>
    <title>Sheff Surgeries</title>
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
        <g:link controller="Appointment" action="index" class="nav-link active">View Appointments</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Patient" action="index" class="nav-link active">View Patients</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Prescription" action="create" class="nav-link active">Add Prescription</g:link>
      </li>
      <li class="nav-item">
        <g:link controller="Prescription" action="index" class="nav-link active">View Prescriptions</g:link>
      </li>
<li class="nav-item">
<g:loginToggle />
</li>
</ul>
</section> 
  </div>
</nav>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>