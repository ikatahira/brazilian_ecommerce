<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Vendedor</title>
</head>
<body>
    <h1><c:out value="${seller.sellerId == null ? 'Criar Vendedor' : 'Editar Vendedor'}" /></h1>
    <form action="<c:url value='${seller.sellerId == null ? '/sellers/create' : '/sellers/edit'}' />" method="post">
        <label for="sellerZipCodePrefix">Prefixo do CEP:</label>
        <input type="text" id="sellerZipCodePrefix" name="sellerZipCodePrefix" value="<c:out value='${seller.sellerZipCodePrefix}' />" required><br>

        <label for="sellerCity">Cidade:</label>
        <input type="text" id="sellerCity" name="sellerCity" value="<c:out value='${seller.sellerCity}' />" required><br>

        <label for="sellerState">Estado:</label>
        <input type="text" id="sellerState" name="sellerState" value="<c:out value='${seller.sellerState}' />" required><br>

        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/sellers' />">Cancelar</a>
</body>
</html>