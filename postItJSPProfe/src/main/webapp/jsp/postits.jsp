<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<c:set var="context" value="${pageContext.request.contextPath}" />
<fmt:setBundle basename="label"/>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${context}/css/estilo.css"/>
<title>Post-Its</title>
</head>
<body>
  
	<table id="tlist">
		<thead>
			<tr>
			<th><fmt:message key="titulo.id"/></th>
				<th><fmt:message key="titulo.color"/></th>
				<th><fmt:message key="titulo.tamanio"/></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${elements}" var="element">
		  <tr>
		    <td>${element.id}</td>
		    <td>${element.color}</td>
		    <td>${element.tamanio}</td>	
		    <td>
		      <a href="${context}/postit/${element.id}">Ver</a>
		      <a href="${context}/postit/d/${element.id}">Eliminar</a>
		    </td>	    
		  </tr>
		 </c:forEach>	
		</tbody>
	</table>
	
	<form id="fNewElement" method="post" action="${context}/postit/new">
	 Color:<input type="text" name="color" required/><br/>	
	 Tamaño:<input type="text" name="tamanio" required/><br/>	
	 
	 <button type="submit">Enviar</button>  
	</form>

</body>
</html>