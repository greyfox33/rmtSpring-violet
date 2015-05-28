'use strict';

/* App Module */

var phonecatApp = angular.module('phonecatApp', [
  'ngRoute',
  'phonecatControllers'
]);

phonecatApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/child', {
        templateUrl: 'partials/child-list.html',
        controller: 'ChildListCtrl'
      }).
      when('/child/:phoneId', {
        templateUrl: 'partials/child-detail.html',
        controller: 'ChildDetailCtrl'
      }).
      otherwise({
        redirectTo: '/child'
      });
  }]);
