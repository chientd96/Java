<%--
  Created by IntelliJ IDEA.
  User: ChienTD2
  Date: 09/09/2019
  Time: 5:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Adddd112312312</title>
</head>
<body>
<h1>Add screen</h1>

<form:form method="POST" action="add" modelAttribute="employee">
    Id: <form:input path="id" />
    <br/>
    Name: <form:input path="name" />
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
