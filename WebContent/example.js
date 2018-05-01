var app = angular.module('app', []);

app.controller("controller", function($scope, $http) {
    $scope.first;
    $scope.second;
    
    $scope.updateValue = function() {
//        $scope.result = "Your summoner name has been found in the database.";
        console.log("SENDING");
        $http({
            method: 'POST',
            url: 'checkSummoner.php',
            params: {
                name: $scope.first
            },
            headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
        }).then(function(response) {
            $scope.data = response.data;
            if(response.data == " , ") {
                $scope.error = "Summoner was not found"
            }else {
                $scope.error = "None";
            }
            console.log("The response: " + $scope.data);
        });
        
        
    }
    
    $scope.onChange = function() {

    }
    
    
});