'use strict';

/* App Module */

var childApp = angular.module('childApp', [
  'ngRoute',
  'childControllers'
]);

childApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/child', {
        templateUrl: 'partials/child-list.html',
        controller: 'ChildListCtrl'
      }).
      when('/childdetail/:childId', {
        templateUrl: 'partials/child-detail.html',
        controller: 'ChildDetailCtrl'
      }).
      otherwise({
        redirectTo: 'child'
      });
  }]);
