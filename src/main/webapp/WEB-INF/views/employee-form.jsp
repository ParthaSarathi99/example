<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee form </title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
rel="stylesheet">
<link href="<c:url value="/resources/css/style1.css" />"
rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>


</head>
<body background="<c:url value="/resources/images/re.png"/>"/>
<div class="container">
<div class="col-md-offset-2 col-md-7">
<h2 class="text-center">Royal Enfield Management</h2>
<div class="panel panel-info">
<div class="panel-heading">
<div class="panel-title">Add Employee</div>
</div>


<div class="panel-body">
<form:form action="saveEmployee" cssClass="form-horizontal"
method="post" modelAttribute="employee">



<!-- need to associate this data with customer id -->
<form:hidden path="empid" />



<div class="form-group">
<label for="empfname" class="col-md-3 control-label"><b>First
Name</b></label>
<div class="col-md-9">
<form:input path="empfname" cssClass="form-control" />
</div>
</div>


<div class="form-group">
<label for="emplname" class="col-md-3 control-label"><b>Last
Name</b></label>
<div class="col-md-9">
<form:input path="emplname" cssClass="form-control" />
</div>
</div>


<div class="form-group">
<label for="empdob" class="col-md-3 control-label"><b>Date
Of Birth</b></label>
<div class="col-md-9">
<form:input path="empdob" cssClass="form-control" />
</div>
</div>

<div class="form-group" color="red">
<label for="empaddress" class="col-md-3 control-label">
<b>Address
Of Employee </b></label>
<div class="col-md-9">
<form:input path="empaddress" cssClass="form-control" />
</div>
</div>



<div class="form-group">
<label for="password" class="col-md-3 control-label"><b>Password</b></label>
<div class="col-md-9">
<form:password path="password" cssClass="form-control" />
</div>
</div>



<div class="form-group">
<!-- Button -->
<div class="col-md-offset-3 col-md-9">
<form:button cssClass="btn btn-primary">Submit</form:button>
</div>
</div>



</form:form>
</div>
</div>
</div>
</div>




</body>
</html>