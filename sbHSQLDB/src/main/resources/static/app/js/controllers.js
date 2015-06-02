'use strict';

/* Controllers */

var childControllers = angular.module('childControllers', []);

childControllers.controller('ChildListCtrl', ['$scope', '$http',
  function($scope, $http) {
    $http.get('../child/').success(function(data) {
      $scope.children = data;
    });
  }]);

childControllers.controller('ChildDetailCtrl', ['$scope', '$routeParams', '$http',
  function($scope, $routeParams, $http) {
    $http.get('../child/' + $routeParams.childId ).success(function(data) {
      $scope.childDetail = data;
    });
  }]);

childControllers.controller('ChildDetailStatusCtrl', ['$scope', '$routeParams', '$http',
  function($scope, $routeParams, $http) {
    $http.get('../status/' + $routeParams.childId ).success(function(data) {
      $scope.childStatus = data;
    });
  }]);