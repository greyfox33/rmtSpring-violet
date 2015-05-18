//angular.module('childList')
//    .factory('childList', ['$http', function($http) {
//
//    var urlBase = '/child';
//    var dataFactory = {};
//
//    dataFactory.getChildren = function () {
//        return $http.get(urlBase);
//    };
//    
//    function Hello($scope, $http) {
//        $http.get('http://rest-service.guides.spring.io/greeting').
//            success(function(data) {
//                $scope.greeting = data;
//            });
//    }
/*
    dataFactory.getChild = function (id) {
        return $http.get(urlBase + '/' + id);
    };
    */

    /*
    dataFactory.insertCustomer = function (cust) {
        return $http.post(urlBase, cust);
    };

    dataFactory.updateCustomer = function (cust) {
        return $http.put(urlBase + '/' + cust.ID, cust)
    };

    dataFactory.deleteCustomer = function (id) {
        return $http.delete(urlBase + '/' + id);
    };

    dataFactory.getOrders = function (id) {
        return $http.get(urlBase + '/' + id + '/orders');
    };
*/
//    return dataFactory;
//}]);