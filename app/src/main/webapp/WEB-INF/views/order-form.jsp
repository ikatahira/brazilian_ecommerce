<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Pedido</title>
</head>
<body>
    <h1><c:out value="${order.orderId == null ? 'Criar Pedido' : 'Editar Pedido'}" /></h1>
    <form action="<c:url value='${order.orderId == null ? '/orders/create' : '/orders/edit'}' />" method="post">
        <label for="customerId">ID do Cliente:</label>
        <input type="text" id="customerId" name="customerId" value="<c:out value='${order.customerId}' />" required><br>
        
        <label for="orderPurchaseTimestamp">Data de Compra:</label>
        <input type="datetime-local" id="orderPurchaseTimestamp" name="orderPurchaseTimestamp" value="<c:out value='${order.orderPurchaseTimestamp}' />" required><br>
        
        <label for="orderApprovedAt">Data de Aprovação:</label>
        <input type="datetime-local" id="orderApprovedAt" name="orderApprovedAt" value="<c:out value='${order.orderApprovedAt}' />"><br>
        
        <label for="orderStatus">Status:</label>
        <input type="text" id="orderStatus" name="orderStatus" value="<c:out value='${order.orderStatus}' />" required><br>
        
        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/orders' />">Cancelar</a>
</body>
</html>