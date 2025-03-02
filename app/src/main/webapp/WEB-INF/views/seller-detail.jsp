<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Vendedor</title>
</head>
<body>
    <h1>Detalhes do Vendedor</h1>
    <p>ID: <c:out value="${seller.sellerId}" /></p>
    <p>Prefixo do CEP: <c:out value="${seller.sellerZipCodePrefix}" /></p>
    <p>Cidade: <c:out value="${seller.sellerCity}" /></p>
    <p>Estado: <c:out value="${seller.sellerState}" /></p>
    <a href="<c:url value='/sellers' />">Voltar para Lista</a>
</body>
</html>