'use strict';

/* Services */

childServices.factory('Child', ['$resource',
                                function($resource){
                                  return $resource('http://localhost:8080/child/', {}, {
                                    query: {method:'GET', params:{}, isArray:true}
                                  });
                                }]);

statusServices.factory('Status', ['$resource',
                                function($resource){
                                  return $resource('http://localhost:8080/Status/', {}, {
                                    query: {method:'GET', params:{}, isArray:true}
                                  });
                                }]);
