<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<form method="GET" action="MasukanDataKaryawan">

		ID Karyawan	: <br>
			<input type="number" name="idKaryawan"><br><br>
		
		Nama Karyawan : <br>
			<input type="text" name="nama" ><br><br>
		
		Tanggal Masuk : <br>
			<input type="date" name="tanggal" ><br><br>
		
		ID Golongan :  <br>
			<select name="idGolongan">
		    	<c:forEach items="${requestScope.empList}" var="emp">
					<option value="${emp.idGolongan}">${emp.idGolongan} - ${emp.namaGolongan}</option>
				</c:forEach>
		  	</select>

<input type="submit" value="Submit">
</form>
</body>
</html>