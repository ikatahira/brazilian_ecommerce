<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Cliente</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1>Detalhes do Cliente</h1>
    <p>ID: <c:out value="${customer.customerId}" /></p>
    <p>Nome Único: <c:out value="${customer.customerUniqueId}" /></p>
    <p>Cidade: <c:out value="${customer.customerCity}" /></p>
    <p>Estado: <c:out value="${customer.customerState}" /></p>
    <a href="<c:url value='/customers' />">Voltar para Lista</a>
</body>
</html>