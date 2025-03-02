<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Cliente</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1><c:out value="${customer.customerId == null ? 'Criar Cliente' : 'Editar Cliente'}" /></h1>
    <form action="<c:url value='${customer.customerId == null ? '/customers/create' : '/customers/edit'}' />" method="post">
        <label for="customerUniqueId">Nome Único:</label>
        <input type="text" id="customerUniqueId" name="customerUniqueId" value="<c:out value='${customer.customerUniqueId}' />" required><br>
        
        <label for="customerZipCodePrefix">Prefixo do CEP:</label>
        <input type="number" id="customerZipCodePrefix" name="customerZipCodePrefix" value="<c:out value='${customer.customerZipCodePrefix}' />" required><br>
        
        <label for="customerCity">Cidade:</label>
        <input type="text" id="customerCity" name="customerCity" value="<c:out value='${customer.customerCity}' />" required><br>
        
        <label for="customerState">Estado:</label>
        <input type="text" id="customerState" name="customerState" value="<c:out value='${customer.customerState}' />" required><br>
        
        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/customers' />">Cancelar</a>
</body>
</html>