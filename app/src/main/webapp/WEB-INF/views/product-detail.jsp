<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Produto</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1>Detalhes do Produto</h1>
    <p>ID: <c:out value="${product.productId}" /></p>
    <p>Categoria: <c:out value="${product.productCategoryName}" /></p>
    <a href="<c:url value='/products' />">Voltar para Lista</a>
</body>
</html>