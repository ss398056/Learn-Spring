<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Complex Form</title>
</head>
<body>
	<h1>Complex Form Handling</h1>
	<hr>
	
	<div class="container mt-4 card">
		<div class="alert alert-danger" role="alert">
  			<form:errors path="student.*" />
  			
		</div>
		<form action="handlecomplexform" method="post">
		  <div class="form-group mt-2">
		    <label for="exampleFormControlInput1">Full Name</label>
		    <input type="text" class="form-control"  placeholder="" name="name">
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlInput1">Your Id</label>
		    <input type="text" class="form-control"  placeholder="" name="id">
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlInput1">Date Of Birth</label>
		    <input type="date" class="form-control" name="dob">
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlInput1">Address</label>
		    <div class="card">
		    	<label for="exampleFormControlInput1">Street</label>
		    	<input type="text" class="form-control"  placeholder="" name="address.street">
		    </div>
		    <div class="card">
		    	<label for="exampleFormControlInput1">City</label>
		    	<input type="text" class="form-control"  placeholder="" name="address.city">
		    </div>
		    <div class="card">
		    	<label for="exampleFormControlInput1">State</label>
		    	<input type="text" class="form-control"  placeholder="" name="address.state">
		    </div>
		    <div class="card">
		    	<label for="exampleFormControlInput1">Pincode</label>
		    	<input type="text" class="form-control"  placeholder="" name="address.pincode">
		    </div>
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlInput1">Select Gender</label>
		    <br>
		    <input type="radio" class="form-check-input"  name="gender" value="male">
		    <label for="exampleFormControlInput1">Male</label>
		    <input type="radio" class="form-check-input"  name="gender" value="female">
		    <label for="exampleFormControlInput1">Female</label>
		  </div>
		  
		  <div class="form-group mt-2">
		    <label for="exampleFormControlSelect1">Select Semester</label>
		    <select class="form-control"  name="sem">
		      <option>Select</option>
		      <option>1</option>
		      <option>2</option>
		      <option>3</option>
		      <option>4</option>
		      <option>5</option>
		      <option>6</option>
		    </select>
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlSelect2">Select Courses</label>
		    <select multiple class="form-control" name="course">
		      <option>Java</option>
		      <option>Python</option>
		      <option>Ruby</option>
		      <option>C</option>
		      <option>C++</option>
		      <option>.Net</option>
		    </select>
		  </div>
		  <div class="form-group mt-2">
		    <label for="exampleFormControlTextarea1">About Me</label>
		    <textarea class="form-control" rows="3" name="about"></textarea>
		  </div>
		  
		  <button class="btn btn-primary mt-2" name="submit">Submit</button>
		</form>
	</div>
	
</body>
</html>