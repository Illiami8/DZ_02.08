<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html lang="ru">
<head>
<title>users</title>
</head>
<body>
<h2>Спиcок Пользователей</h2>
<table>
<tr>
<th>ФИО</th><th>Возраст</th><th>Статус</th>
</tr>

<c:forEach items="${requestScope.users}" var="users" >
<tr>
<td>${users.FIO}</td><td>${users.age}</td><td>${users.position}</td>
</tr>
</c:forEach>

</table>
</body>
</html>