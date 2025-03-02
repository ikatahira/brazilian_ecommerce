<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Produtos</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1>Produtos</h1>
    <a href="<c:url value='/products/create' />">Adicionar Novo Produto</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Categoria</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td><c:out value="${product.productId}" /></td>
                <td><c:out value="${product.productCategoryName}" /></td>
                <td>
                    <a href="<c:url value='/products/${product.productId}' />">Ver</a>
                    <a href="<c:url value='/products/edit/${product.productId}' />">Editar</a>
                    <a href="<c:url value='/products/delete/${product.productId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>