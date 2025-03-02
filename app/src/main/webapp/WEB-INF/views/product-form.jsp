<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário do Produto</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/styles.css' />">
</head>
<body>
    <h1><c:out value="${product.productId == null ? 'Criar Produto' : 'Editar Produto'}" /></h1>
    <form action="<c:url value='${product.productId == null ? '/products/create' : '/products/edit'}' />" method="post">
        <label for="productCategoryName">Nome da Categoria:</label>
        <input type="text" id="productCategoryName" name="productCategoryName" value="<c:out value='${product.productCategoryName}' />" required><br>

        <label for="productNameLength">Comprimento do Nome:</label>
        <input type="number" id="productNameLength" name="productNameLength" value="<c:out value='${product.productNameLength}' />" required><br>

        <label for="productDescriptionLength">Comprimento da Descrição:</label>
        <input type="number" id="productDescriptionLength" name="productDescriptionLength" value="<c:out value='${product.productDescriptionLength}' />" required><br>
        
        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/products' />">Cancelar</a>
</body>
</html>