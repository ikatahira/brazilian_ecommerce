<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Vendedores</title>
</head>
<body>
    <h1>Vendedores</h1>
    <a href="<c:url value='/sellers/create' />">Adicionar Novo Vendedor</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Prefixo do CEP</th>
            <th>Cidade</th>
            <th>Estado</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="seller" items="${sellers}">
            <tr>
                <td><c:out value="${seller.sellerId}" /></td>
                <td><c:out value="${seller.sellerZipCodePrefix}" /></td>
                <td><c:out value="${seller.sellerCity}" /></td>
                <td><c:out value="${seller.sellerState}" /></td>
                <td>
                    <a href="<c:url value='/sellers/${seller.sellerId}' />">Ver</a>
                    <a href="<c:url value='/sellers/edit/${seller.sellerId}' />">Editar</a>
                    <a href="<c:url value='/sellers/delete/${seller.sellerId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>