<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<style>
table,th,td
{
border:1px solid black;
}
</style>
<body>
	<table>
		<tbody>
		<tr><th>ID</th><th>Nama</th><th>Tanggal masuk</th><th>ID Golongan</th><th>Golongan</th><th>Nama Golongan</th><th>Gaji Golongan</th></tr>
			<c:forEach items="${requestScope.empList}" var="emp">
				<tr><td><c:out value="${emp.idKaryawan}"></c:out></td>
				<td><c:out value="${emp.nama}"></c:out></td>
				<td><c:out value="${emp.tanggal}"></c:out></td>
				<td><c:out value="${emp.idGolongan}"></c:out></td>
				<td><c:out value="${emp.golongan}"></c:out></td>
				<td><c:out value="${emp.namaGolongan}"></c:out></td>
				<td><c:out value="${emp.gajiGolongan}"></c:out></td></tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>