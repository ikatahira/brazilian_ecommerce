<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Traduções de Categoria</title>
</head>
<body>
    <h1>Traduções de Categoria</h1>
    <a href="<c:url value='/category-translations/create' />">Adicionar Nova Tradução</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome em Inglês</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="category" items="${categories}">
            <tr>
                <td><c:out value="${category.categoryId}" /></td>
                <td><c:out value="${category.categoryEnglishName}" /></td>
                <td>
                    <a href="<c:url value='/category-translations/${category.categoryId}' />">Ver</a>
                    <a href="<c:url value='/category-translations/edit/${category.categoryId}' />">Editar</a>
                    <a href="<c:url value='/category-translations/delete/${category.categoryId}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>