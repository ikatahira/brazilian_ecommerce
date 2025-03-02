<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Item do Pedido</title>
</head>
<body>
    <h1>Detalhes do Item do Pedido</h1>
    <p>ID: <c:out value="${orderItem.orderItemId}" /></p>
    <p>ID do Pedido: <c:out value="${orderItem.orderId}" /></p>
    <p>ID do Produto: <c:out value="${orderItem.productId}" /></p>
    <p>Quantidade: <c:out value="${orderItem.orderItemCount}" /></p>
    <p>Preço: <c:out value="${orderItem.orderItemPrice}" /></p>
    <a href="<c:url value='/order-items' />">Voltar para Lista</a>
</body>
</html>