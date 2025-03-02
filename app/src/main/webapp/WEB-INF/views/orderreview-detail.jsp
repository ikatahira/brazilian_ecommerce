<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes da Avaliação do Pedido</title>
</head>
<body>
    <h1>Detalhes da Avaliação do Pedido</h1>
    <p>ID: <c:out value="${orderReview.reviewId}" /></p>
    <p>ID do Pedido: <c:out value="${orderReview.orderId}" /></p>
    <p>Nota: <c:out value="${orderReview.reviewScore}" /></p>
    <p>Data de Criação: <c:out value="${orderReview.reviewCreationDate}" /></p>
    <a href="<c:url value='/order-reviews' />">Voltar para Lista</a>
</body>
</html>