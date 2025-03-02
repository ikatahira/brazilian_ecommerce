<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1>Clientes</h1>
    <a href="<c:url value='/customers/create' />">Adicionar Novo Cliente</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome Único</th>
            <th>Cidade</th>
            <th>Estado</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td><c:out value="${customer.customerId}" /></td>
                <td><c:out value="${customer.customerUniqueId}" /></td>
                <td><c:out value="${customer.customerCity}" /></td>
                <td><c:out value="${customer.customerState}" /></td>
                <td>
                    <a href="<c:url value='/customers/${customer.customerId}' />">Ver</a>
                    <a href="<c:url value='/customers/edit/${customer.customerId}' />">Editar</a>
                    <a href="<c:url value='/customers/delete/${customer.customerId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>