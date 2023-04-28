<%-- 
    Document   : login
    Created on : Apr 27, 2023, 12:21:10 PM
    Author     : dondrebanksoverton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="login.css">
        <title>SafeHome Login</title>
        <style>
		form {
			display: flex;
			flex-direction: column;
			align-items: center;
			margin-top: 50px;
			padding: 20px;
			border: 1px solid #ccc;
			border-radius: 10px;
			box-shadow: 0px 0px 10px #ccc;
		}
		
		input[type="text"],
		input[type="password"] {
			padding: 10px;
			margin: 10px;
			border-radius: 5px;
			border: 1px solid #ccc;
			font-size: 16px;
		}
		
		input[type="submit"] {
			padding: 10px;
			margin: 10px;
			border-radius: 5px;
			background-color: #007bff;
			color: #fff;
			font-size: 16px;
			border: none;
			cursor: pointer;
		}
	</style>
    </head>
    <body>mm
        <h1>Welcome to SafeHome</h1>
        <form action="LoginCTL" method="POST">
		<label for="username">Username:</label>
		<input type="text" id="username" name="username" required><br><br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required><br><br>
		<input type="submit" value="Submit">
	</form>
    </body>
</html>
