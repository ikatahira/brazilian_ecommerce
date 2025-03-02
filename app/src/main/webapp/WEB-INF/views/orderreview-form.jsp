<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário da Avaliação do Pedido</title>
</head>
<body>
    <h1><c:out value="${orderReview.reviewId == null ? 'Criar Avaliação' : 'Editar Avaliação'}" /></h1>
    <form action="<c:url value='${orderReview.reviewId == null ? '/order-reviews/create' : '/order-reviews/edit'}' />" method="post">
        <label for="orderId">ID do Pedido:</label>
        <input type="text" id="orderId" name="orderId" value="<c:out value='${orderReview.orderId}' />" required><br>

        <label for="reviewScore">Nota:</label>
        <input type="number" min="1" max="5" id="reviewScore" name="reviewScore" value="<c:out value='${orderReview.reviewScore}' />" required><br>

        <label for="reviewCreationDate">Data de Criação:</label>
        <input type="date" id="reviewCreationDate" name="reviewCreationDate" value="<c:out value='${orderReview.reviewCreationDate}' />" required><br>

        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/order-reviews' />">Cancelar</a>
</body>
</html>