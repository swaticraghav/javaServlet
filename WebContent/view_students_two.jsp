<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Student Table Demo</h2>
	<hr><br/>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="studentData" items="${student_data}">
			<tr>
				<td>${studentData.firstName}</td>
				<td>${studentData.lastName}</td>
				<td>${studentData.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>