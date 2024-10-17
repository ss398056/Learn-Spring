<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Contact</title>
  </head>
  <body>
   <div class="container">
    <h1>${Heading }</h1>
    <h1>${success }</h1>
    <hr>
    <form action="processform" method="post">
      <div class="form-group">
	    <label for="exampleFormControlInput1">Full Name</label>
	    <input type="text" class="form-control" id="exampleFormControlInput1" name="name">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Mobile No</label>
	    <input type="text" class="form-control" id="exampleFormControlInput1" name="mobile">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Email address</label>
	    <input type="email" class="form-control" id="exampleFormControlInput1" name="email">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlTextarea1">Message</label>
	    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="message"></textarea>
	  </div>
	  	 <button type="submit" class="btn btn-primary mt-2">Submit</button>
	</form>
	
  </div>



    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>