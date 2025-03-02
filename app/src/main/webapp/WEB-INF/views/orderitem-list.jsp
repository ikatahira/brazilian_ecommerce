<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Itens do Pedido</title>
</head>
<body>
    <h1>Itens do Pedido</h1>
    <a href="<c:url value='/order-items/create' />">Adicionar Novo Item</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>ID do Pedido</th>
            <th>ID do Produto</th>
            <th>Quantidade</th>
            <th>Preço</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="orderItem" items="${orderItems}">
            <tr>
                <td><c:out value="${orderItem.orderItemId}" /></td>
                <td><c:out value="${orderItem.orderId}" /></td>
                <td><c:out value="${orderItem.productId}" /></td>
                <td><c:out value="${orderItem.orderItemCount}" /></td>
                <td><c:out value="${orderItem.orderItemPrice}" /></td>
                <td>
                    <a href="<c:url value='/order-items/${orderItem.orderItemId}' />">Ver</a>
                    <a href="<c:url value='/order-items/edit/${orderItem.orderItemId}' />">Editar</a>
                    <a href="<c:url value='/order-items/delete/${orderItem.orderItemId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>