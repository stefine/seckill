/**
 * Created by 533 on 2017/4/15.
 */
angular.module("seckillApp")
    .controller("excuteController", ["$scope", "$http", "$routeParams", function($scope, $http, $routeParams){
        $http.get('/seckill/excute/'+ $routeParams.skillId).success(function (data) {
            // var data = eval(data);
            $scope.resultName = data.successkilled.seckillItem.name;
            $scope.resultStartTime = data.successkilled.seckillItem.startTime;
            $scope.resultEndTime = data.successkilled.seckillItem.endTime;
            if(data.flag){
                console.log("秒杀成功！");
            }else{
                console.log("您的秒杀失败！");
            }
        });
    }]);
