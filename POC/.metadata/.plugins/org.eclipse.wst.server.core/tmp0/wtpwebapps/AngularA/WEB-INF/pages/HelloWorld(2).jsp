<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script src="../angular.min.js"></script>
<script src="../angular-route.js"></script>
<script src="../script.js"></script>
</head>
<body>
<div ng-app="MyApp" ng-controller="homeController">
 	<h1>Hi {{person.firstName}}</h1>
 		<h1> {{person.lastName}}</h1>
 	${msg }
</div>


</body>
</html>