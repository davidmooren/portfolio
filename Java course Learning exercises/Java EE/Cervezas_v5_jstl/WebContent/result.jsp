<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Cervezas v5</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>JSP con recomendaciones sobre cervezas v5</h1>

		<ul>
			<c:forEach var="cerveza" items="${styles}" >
				<li>Try: ${cerveza.nombre}</li>
			</c:forEach>
		</ul>
    
</body>
</html>