<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Departments</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
    <h1>Departments</h1>
    <table>
        <c:forEach items="${departments}" var="dept">
            <tr>
                <td>${dept.name}</td>
                <td><a href="/departments/edit/${dept.id}">Edit</a></td> 
            </tr>
        </c:forEach>
    </table>
    <a href="/departments/new">Add Department</a>
</body>
</html>