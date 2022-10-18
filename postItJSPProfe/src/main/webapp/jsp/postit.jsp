<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
<c:set var="context" value="${pageContext.request.contextPath}" />
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${context}/css/estilo.css"/>
<title>Postit</title>
</head>
<body>
	<table id="telement">
		<tbody>
		    <tr>
				<th>ID</th>
				<td>${element.id}</td>
			</tr>
			<tr>
				<th>Color</th>
				<td >${element.color}</td>
			</tr>
			<tr>
				<th>Tamaño</th>
				<td >${element.tamanio}</td>
			</tr>
		</tbody>
	</table>
	
<form id="fUpElement" method="post" action="${context}/postit/update" >
	<input type="hidden" id="id" name="id" value="${element.id}"/>
	 Color:<input type="text" id="color" name="color" value="${element.color}" required/><br/>	
	 Tamaño:<input type="text" id="tamanio" name="tamanio" value="${element.tamanio}"required/><br/>	
	 
	 
	 <button type="submit">Enviar</button>  
	</form>	

</body>
</html>