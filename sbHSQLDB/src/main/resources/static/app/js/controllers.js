  function hello($scope, $http) {
	  $http.get('http://localhost:8080/child').
	  success(function(data) {
	      $scope.children = data;
	  })
  }
  