/*
 * Copyright (c) Kratagya Chandra.
 */

app.controller('employeeController', function($scope, $http) {
	$http.get('/api/v1/employee').then(function (response) {
		$scope.empData = response.data
	}, function error(response) {
		$scope.errorMsg = "Unable to fetch data. Please try after sometime. (Error: " +  response.statusText + ")";
		console.error($scope.errorMsg);
	});

	$scope.toggleAccordion = function(event){
		console.log(angular.element(event.currentTarget));
		angular.element(event.currentTarget.getElementsByClassName('ep-accordion right')).toggleClass('closed');
		var accContent = angular.element(event.currentTarget.nextElementSibling);
		if(accContent.css("display") === "none"){
			accContent.css("display", "flex");
		} else {
			accContent.css("display", "none");
		}
	};
	//default sorting
	$scope.reverse = false;
	$scope.sortColName = 'firstName';
	$scope.sortColumn = function (col) {
		if ($scope.sortColName === col) {
			$scope.reverse = !$scope.reverse;
		} else {
			$scope.reverse = false;
		}
		$scope.sortColName = col;
	};

});