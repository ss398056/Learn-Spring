<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>File Uploading</title>
  </head>
  <body>
    
    <div class="container">
    	<h1>File Uploading</h1>
    	<form action="fileupload" method="post" enctype="multipart/form-data">
   			<div class="mb-3 mt-5 col-5 ">
			  <input class="form-control" type="file" id="formFileMultiple"  name="image">
			</div>
			
			<div class="col-auto">
	    		<button type="submit" class="btn btn-primary mb-3" name="submit">Upload</button>
	  		</div>
    	</form>
    	
  
    </div>

    
  </body>
</html>