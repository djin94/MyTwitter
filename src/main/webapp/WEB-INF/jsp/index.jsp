<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Twitter</title>
    <spring:url value="/resources/css/bootstrap.min.css"
                var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <spring:url value="/resources/js/jquery-1.12.4.min.js"
                var="jqueryJs" />
    <script src="${jqueryJs}"></script>
</head>
<body>
<header>
    <form id="">
        <div class="form-group">
            <input type="text" name="login" class="form-control"/>
            <input type="password" name="password" class="password-field"/>
            <input type="text" class="search">
        </div>
    </form>

</header>
<div class="center">
        <form id="lenta" method="get">

        </form>
</div>
</body>
</html>
