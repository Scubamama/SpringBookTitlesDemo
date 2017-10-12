<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html lang="en">

<head>
	
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<title>Title Addition Form</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	
</head>

<body>
	<form:form action="processForm" modelAttribute="bookTitle" >

		<div class="container" style="background-color: #002147; padding:10px;">
				<div class="well well-lg" style="background-color: #EEEEEE">
	
						
			<div class="row justify-content-center ">
				<div class="center" style="padding:10px">
					Book Title:  <form:input path="title" />
				</div>
			</div>
							
			<div class="row justify-content-center ">
				<div class="center" style="padding:10px">
					Isbn:        <form:input path="isbn" />
				</div>
			</div>
			
			<div class="row justify-content-center ">
				<div class="center" style="padding:10px">
					Author:      <form:input path="author" />
				</div>
			</div>
				
			<div class="row justify-content-center ">
				<div class="center" style="padding:10px">
					Edition:     <form:input path="edition" />
				</div>
			</div>
			
			<div class="row justify-content-center ">
				<div class="center" style="padding:10px">
					<form:select path="binding">
						<form:options items="${bookTitle.bindingOptions}" />
					</form:select>					
				</div>
			</div>
						
			
			<div class="row justify-content-center">
				<div class="center" style="padding:10px">
					<input type="submit" class="btn btn-success center-block" name="addbutt" value="Add the Title"  />
				</div>
			</div>
			
			</div> <!-- end well -->
			
		</div> <!-- end container -->

	</form:form>


</body>

</html>