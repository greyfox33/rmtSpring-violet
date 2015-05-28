function ChildrenDetail($scope, $http, $id) {
	alert('id is' + $id);
    $http.get('http://localhost:8080/child/$id').
        success(function(data) {
            $scope.children = data;
        })
};