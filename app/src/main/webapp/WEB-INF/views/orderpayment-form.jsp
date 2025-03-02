<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Pagamento do Pedido</title>
</head>
<body>
    <h1><c:out value="${orderPayment.paymentId == null ? 'Criar Pagamento' : 'Editar Pagamento'}" /></h1>
    <form action="<c:url value='${orderPayment.paymentId == null ? '/order-payments/create' : '/order-payments/edit'}' />" method="post">
        <label for="orderId">ID do Pedido:</label>
        <input type="text" id="orderId" name="orderId" value="<c:out value='${orderPayment.orderId}' />" required><br>

        <label for="paymentType">Tipo:</label>
        <input type="text" id="paymentType" name="paymentType" value="<c:out value='${orderPayment.paymentType}' />" required><br>

        <label for="paymentValue">Valor:</label>
        <input type="number" step="0.01" id="paymentValue" name="paymentValue" value="<c:out value='${orderPayment.paymentValue}' />" required><br>

        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/order-payments' />">Cancelar</a>
</body>
</html>