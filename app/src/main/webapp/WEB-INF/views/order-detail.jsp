<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Pedido</title>
</head>
<body>
    <h1>Detalhes do Pedido</h1>
    <p>ID: <c:out value="${order.orderId}" /></p>
    <p>ID do Cliente: <c:out value="${order.customerId}" /></p>
    <p>Data de Compra: <c:out value="${order.orderPurchaseTimestamp}" /></p>
    <p>Data de Aprovação: <c:out value="${order.orderApprovedAt}" /></p>
    <p>Status: <c:out value="${order.orderStatus}" /></p>
    <a href="<c:url value='/orders' />">Voltar para Lista</a>
</body>
</html>