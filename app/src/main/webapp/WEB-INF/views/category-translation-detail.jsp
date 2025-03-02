<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Detalhes da Tradução de Categoria</title>
</head>
<body>
    <h1>Detalhes da Tradução de Categoria</h1>
    <p>ID: <c:out value="${category.categoryId}" /></p>
    <p>Nome em Inglês: <c:out value="${category.categoryEnglishName}" /></p>
    <a href="<c:url value='/category-translations' />">Voltar para Lista</a>
</body>
</html>