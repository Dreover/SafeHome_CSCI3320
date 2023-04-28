<%-- 
    Document   : Dashboard
    Created on : Apr 27, 2023, 6:08:42 PM
    Author     : dondrebanksoverton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SafeHome Dashboard</title>
        <style>
		.container {
			display: flex;
			flex-wrap: wrap;
			justify-content: space-around;
			align-items: center;
			padding: 20px;
			background-color: #f1f1f1;
		}

		.card {
			width: 200px;
			height: 200px;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			border-radius: 10px;
			box-shadow: 2px 2px 5px #888888;
			margin: 10px;
		}

		.card:hover {
			transform: scale(1.05);
			transition: transform 0.2s ease-in-out;
		}

		h1 {
			margin: 0;
			font-size: 24px;
			font-weight: bold;
			text-align: center;
			color: #333;
		}

		button {
			background-color: #4CAF50;
			color: white;
			padding: 10px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			margin-top: 10px;
			font-size: 16px;
			width: 80%;
			transition: background-color 0.3s ease-in-out;
		}

		button:hover {
			background-color: #3e8e41;
		}
	</style>

    </head>
    <body>
        <div class="container">
		<div class="card">
			<h1>Climate</h1>
			<button>Adjust</button>
		</div>
		<div class="card">
			<h1>Security</h1>
			<button>Arm/Disarm</button>
		</div>
		<div class="card">
			<h1>Garage</h1>
			<button>Open/Close</button>
		</div>
		<div class="card">
			<h1>Lighting</h1>
			<button>On/Off</button>
		</div>
	</div>
    </body>
</html>
