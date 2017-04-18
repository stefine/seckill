/**
 * Created by 533 on 2017/4/15.
 */
var app = angular.module("seckillApp",["ngRoute", "ngResource"]);

app.config(function($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "/public/views/list.html",
            controller: "listControl"
        })
        .when("/excuter/:skillId", {
            templateUrl: "/public/views/excute.html",
            controller: "excuteController"
        });
});
