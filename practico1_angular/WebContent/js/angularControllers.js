var app = angular.module("UserApp", []);

app.controller("UserController", function($scope, $http) {
	$http.post('http://rest-service.guides.spring.io/greeting').
    	success(function(data) {
    		$scope.greeting = data;
    });
});

