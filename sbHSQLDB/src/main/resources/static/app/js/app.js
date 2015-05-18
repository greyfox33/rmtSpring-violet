'use strict';

/* App Module */

var cwsApp = angular.module('cwsApp', [
  'ngRoute',
  'caseControllers'
]);

phonecatApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/child', {
        templateUrl: 'partials/child-list.html',
        controller: 'ChildListCtrl'
      }).
      /*
      when('/phones/:phoneId', {
        templateUrl: 'partials/child-detail.html',
        controller: 'PhoneDetailCtrl'
      }).
      */
      otherwise({
        redirectTo: '/app'
      });
  }]);
