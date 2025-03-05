<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Menu Principal - Olist E-commerce</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h1>Menu Principal - Olist E-commerce</h1>
        <p>Selecione uma opção para explorar os dados do e-commerce brasileiro:</p>

        <div class="row">
            <div class="col-md-4">
                <a href="listar_clientes.jsp" class="btn btn-primary btn-block">Listar Clientes</a>
            </div>
            <div class="col-md-4">
                <a href="listar_pedidos.jsp" class="btn btn-secondary btn-block">Listar Pedidos</a>
            </div>
            <div class="col-md-4">
                <a href="products" class="btn btn-success btn-block">Listar Produtos</a>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col-md-4">
                <a href="listar_vendedores.jsp" class="btn btn-info btn-block">Listar Vendedores</a>
            </div>
            <div class="col-md-4">
                <a href="listar_pagamentos.jsp" class="btn btn-warning btn-block">Listar Pagamentos</a>
            </div>
            <div class="col-md-4">
                <a href="listar_avaliacoes.jsp" class="btn btn-dark btn-block">Listar Avaliações</a>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col-md-4">
                <a href="inserir_cliente.jsp" class="btn btn-primary btn-block">Inserir Cliente</a>
            </div>
            <div class="col-md-4">
                <a href="estatisticas.jsp" class="btn btn-secondary btn-block">Estatísticas Gerais</a>
            </div>
            <div class="col-md-4">
                <a href="relatorios.jsp" class="btn btn-success btn-block">Relatórios Personalizados</a>
            </div>
        </div>
    </div>
</body>
</html>