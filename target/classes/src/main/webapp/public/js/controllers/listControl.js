/**
 * Created by 533 on 2017/4/15.
 */
angular.module("seckillApp")
    .controller("listControl", ["$scope", "$http", "$location", function($scope, $http, $location){
        // 绑定 json 数组
        $http.get('/seckill/list').success(function (data) {
            // console.log(data);
            $scope.list = data;
        });
        $scope.showId = function(skillId) {
            // console.log("skillId is: " + skillId);
            $http.get("/seckill/expose/" + skillId).success(function(data) {
                // console.log("exposeResult flag is: " + $scope.exposeResult.flag);
                // console.log("data flag: " + data["flag"]);
                // if(true){
                //     $location.path("/excuter/" + skillId);
                // }
                if(data.flag){
                    $location.path("/excuter/" + skillId);
                }
            });
        }
    }]);
