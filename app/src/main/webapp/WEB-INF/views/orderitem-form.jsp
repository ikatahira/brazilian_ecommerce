<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Item do Pedido</title>
</head>
<body>
    <h1><c:out value="${orderItem.orderItemId == null ? 'Criar Item do Pedido' : 'Editar Item do Pedido'}" /></h1>
    <form action="<c:url value='${orderItem.orderItemId == null ? '/order-items/create' : '/order-items/edit'}' />" method="post">
        <label for="orderId">ID do Pedido:</label>
        <input type="text" id="orderId" name="orderId" value="<c:out value='${orderItem.orderId}' />" required><br>

        <label for="productId">ID do Produto:</label>
        <input type="text" id="productId" name="productId" value="<c:out value='${orderItem.productId}' />" required><br>

        <label for="orderItemCount">Quantidade:</label>
        <input type="number" id="orderItemCount" name="orderItemCount" value="<c:out value='${orderItem.orderItemCount}' />" required><br>

        <label for="orderItemPrice">Preço:</label>
        <input type="number" step="0.01" id="orderItemPrice" name="orderItemPrice" value="<c:out value='${orderItem.orderItemPrice}' />" required><br>

        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/order-items' />">Cancelar</a>
</body>
</html>