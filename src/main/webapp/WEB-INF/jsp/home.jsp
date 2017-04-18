<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SecKill</title>

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-route.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-resource.min.js"></script>
    <script type="text/javascript" src="/public/js/app.js"></script>
    <script type="text/javascript" src="/public/js/controllers/excuteController.js"></script>
    <script type="text/javascript" src="/public/js/controllers/listControl.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body ng-app="seckillApp">
<header>
    <div class="container">
        <nav class="navbar navbar-default">
            <div class="navbar-header">
                <a class="navbar-brand" href="#/">SecKill</a>
            </div>
        </nav>
    </div>
</header>

<div class="container">
    <div ng-view></div>
</div>
</body>
</html>
