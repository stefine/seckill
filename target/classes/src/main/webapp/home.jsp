<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SecKill</title>

    <%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-route.min.js"></script>--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-resource.min.js"></script>--%>
    <script src="<c:url value= '/public/js/angular.min.js' />"></script>
    <script src="<c:url value= '/public/js/angular-route.min.js' />"></script>
    <script src="<c:url value= '/public/js/angular-resource.min.js' />"></script>
    <script src="<c:url value= '/public/js/app.js' />"></script>
    <script src="<c:url value= '/public/js/controllers/excuteController.js' />"></script>
    <script src="<c:url value= '/public/js/controllers/listControl.js' />"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body ng-app="seckillApp">
<header>
    <div class="container">
        <nav class="navbar navbar-default">
            <div class="navbar-header">
                <a class="navbar-brand" href="#/">SecondKill</a>
            </div>
        </nav>
    </div>
</header>

<div class="container">
    <div ng-view></div>
</div>
</body>
</html>
