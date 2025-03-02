<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulário da Tradução de Categoria</title>
</head>
<body>
    <h1><c:out value="${category.categoryId == null ? 'Criar Tradução de Categoria' : 'Editar Tradução de Categoria'}" /></h1>
    <form action="<c:url value='${category.categoryId == null ? '/category-translations/create' : '/category-translations/edit'}' />" method="post">
        <label for="categoryEnglishName">Nome em Inglês:</label>
        <input type="text" id="categoryEnglishName" name="categoryEnglishName" value="<c:out value='${category.categoryEnglishName}' />" required><br>

        <input type="submit" value="Salvar">
    </form>
    <a href="<c:url value='/category-translations' />">Cancelar</a>
</body>
</html>