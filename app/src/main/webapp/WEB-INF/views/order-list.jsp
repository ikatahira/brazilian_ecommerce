<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Pedidos</title>
</head>
<body>
    <h1>Pedidos</h1>
    <a href="<c:url value='/orders/create' />">Adicionar Novo Pedido</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>ID do Cliente</th>
            <th>Data de Compra</th>
            <th>Data de Aprovação</th>
            <th>Status</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td><c:out value="${order.orderId}" /></td>
                <td><c:out value="${order.customerId}" /></td>
                <td><c:out value="${order.orderPurchaseTimestamp}" /></td>
                <td><c:out value="${order.orderApprovedAt}" /></td>
                <td><c:out value="${order.orderStatus}" /></td>
                <td>
                    <a href="<c:url value='/orders/${order.orderId}' />">Ver</a>
                    <a href="<c:url value='/orders/edit/${order.orderId}' />">Editar</a>
                    <a href="<c:url value='/orders/delete/${order.orderId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>