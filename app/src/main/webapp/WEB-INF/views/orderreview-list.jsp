<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Avaliações do Pedido</title>
</head>
<body>
    <h1>Avaliações do Pedido</h1>
    <a href="<c:url value='/order-reviews/create' />">Adicionar Nova Avaliação</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>ID do Pedido</th>
            <th>Nota</th>
            <th>Data de Criação</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="orderReview" items="${orderReviews}">
            <tr>
                <td><c:out value="${orderReview.reviewId}" /></td>
                <td><c:out value="${orderReview.orderId}" /></td>
                <td><c:out value="${orderReview.reviewScore}" /></td>
                <td><c:out value="${orderReview.reviewCreationDate}" /></td>
                <td>
                    <a href="<c:url value='/order-reviews/${orderReview.reviewId}' />">Ver</a>
                    <a href="<c:url value='/order-reviews/edit/${orderReview.reviewId}' />">Editar</a>
                    <a href="<c:url value='/order-reviews/delete/${orderReview.reviewId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>