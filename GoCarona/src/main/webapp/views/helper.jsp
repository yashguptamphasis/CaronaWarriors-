<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Helper Page</h1>

<h1>What do you want to help with  </h1>

	<form  action="save">
		<br>		Your Name : <input type="text" name="name">
		<br>		Email id : <input type="text" name="email">
		<br>		Phone Number : <input type="text" name="phone">
		<br>		City : <input type="text" name="city">
		<br>		What can you help with : <select id="help">
  							<option value="food">food</option>
  							<option value="medical">medical</option>
  							<option value="grocery">grocery</option>
  							<option value="mental">mental</option>
					</select>
		<br>			
		Details : <textarea rows="4" cols="50" name="description" >
Tell in short...</textarea>
		<br>
	<input type="submit">
	</form>

</body>
</html>