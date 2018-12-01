<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>Welcome Home</title>
</head>
<body>
	<p>
		Say <a href="hello">Hello</a>
	</p>

	<form method="post" action="hello">
		<h2>Name:</h2>
		<input type="text" id="say-hello-text-input" name="name" /> <input
			type="submit" id="say-hello-button" value="Say Hello" />
	</form>
</body>
</html>

