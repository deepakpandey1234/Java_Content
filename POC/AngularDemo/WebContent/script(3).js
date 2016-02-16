var module=angular.module("MyApp",['ngRoute','LocalStorageModule']);

module.config(['$routeProvider',
               function($routeProvider) {
                 $routeProvider.
                 when('/default', {
                   templateUrl: 'DefaultContent.html',
                   controller: 'defaultController'
                 }).
                 when('/login', {
                     templateUrl: 'Login.html',
                     controller: 'loginController'
                   }).
                   when('/logout', {
                       templateUrl: 'DefaultContent.html',
                       controller: 'logoutController'
                     }).
                   when('/prodDetails', {
                       templateUrl: 'prodDetails.html',
                       controller: 'prodDetailsController'
                     }).
                   when('/register', {
                       templateUrl: 'Register.html',
                       controller: 'registerController'
                     }).
                       when('/contact', {
                           templateUrl: 'Contact.html',
                           controller: 'contactController'
                         }).
                         when('/newad', {
                             templateUrl: 'PostAnAd.html',
                             controller: 'postAnAdController'
                           }).when('/searchResults', {
                               templateUrl: 'ProdByCategory.html',
                               controller: 'searchResultController'
                             }).when('/recentads', {
                                 templateUrl: 'RecentAdds.html',
                                 controller: 'recentController'
                               }).
                           when('/prodByCategory/:param', {
                               templateUrl: 'ProdByCategory.html',
                               controller: 'prodByCateController'
                             }).
                 otherwise({
                   redirectTo: '/default'
                 });
               }
             ]); 



module.controller("defaultController",  function($scope,$http,$rootScope) {
	$rootScope.authenticate=$rootScope.authenticate|false;
	var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/RecentAdds");
	response.success(function(reg) {
		$scope.prods=reg;
	});
	response.error(function(reg, status, headers, config) {
		
	});
	
});


module.controller("prodByCateController",  function($scope,$http,$rootScope,$routeParams,ParameterService) {
	$scope.parameters={"category":$routeParams.param};
	var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/ProdByCategory",$scope.parameters);
	response.success(function(reg) {
		$scope.prods=reg;
	});
	response.error(function(reg, status, headers, config) {
	});
	
	$scope.setParams= function (parameter){
		ParameterService.setParameters(parameter);
	}
	
	
	
});

  module.controller("registerController", function($scope,$http,$rootScope) {
	  $rootScope.showCarousel=false;
	  $scope.register={"regUname":"","regPword":"","regCPword":"","regMail":"","regPhone":""};
	  $scope.onRegister = function (reg){
		  
		  if(reg.regPword != reg.regCPword){
			  alert('no match');
			  return;
		   }
		  else{
			  var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/Register",reg);
				response.success(function(reg) {
					
					
				});
				response.error(function(reg, status, headers, config) {
					
				}); 
		  }
		  
	  }
  });
module.controller("favoritesController", function($scope,$rootScope) {
	$rootScope.showCarousel=false;
  });
module.controller("contactController", function($scope,$rootScope) {
	$rootScope.showCarousel=false;
	
  });
module.controller("postAnAdController", function($scope,$http,$rootScope,$location) {
	$rootScope.showCarousel=false;
	if($rootScope.authenticate==false)
	{
		alert('Please Login to Post and Ad');
		$location.path('/login');
		$scope.$apply();
		
	}
	$scope.option=function(){
		var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/Options");
		response.success(function(reg) {
			$scope.options=reg;
			return reg;
		});	
		response.error(function(reg, status, headers, config) {
			
		});
	}
	$scope.option();
	var fd = new FormData();
	$scope.uploadFile = function(files) {
	    fd.append("file", files[0]);
	   
	}
	
	$scope.onPostAnAd = function (PostAnAd){
		fd.append("prodname", $scope.postanad.name);
		    fd.append("category", $scope.postanad.category.cateValue);
		    fd.append("brandname", $scope.postanad.brandname);
		    fd.append("price", $scope.postanad.price);
		    fd.append("description", $scope.postanad.description);
		    fd.append("featured", $scope.postanad.featured);
		    fd.append("highlight", $scope.postanad.highlight);
		  var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/PostAnAd",fd, {
		        withCredentials: true,
		        headers: {'Content-Type': undefined },
		        transformRequest: angular.identity
		    });
		  fd = new FormData();
		  alert('Posted Successfully');
			$location.path('/recentads');
			$scope.$apply();
			
	}
  });
module.controller("recentController", function($scope,$rootScope,$http,$location,ParameterService) {
	$rootScope.showCarousel=false;

	$scope.search={"searchtext":"","minprice":"","maxprice":"","category":""};
	
		var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/ProdBySearch",$scope.search);
		response.success(function(reg) {
			$scope.prods=reg;
			ParameterService.setParameters(reg);
			$location.path('/');
			$scope.$apply();
			$location.path('/searchResults');
			$scope.$apply();
			
		});
		response.error(function(reg, status, headers, config) {
			
		});

  });
module.controller("searchResultController", function($scope,$rootScope,ParameterService) {
	$scope.prods=ParameterService.getParameters();
	$rootScope.showCarousel=false;
	$scope.setParams= function (parameter){
		ParameterService.setParameters(parameter);
	}
	
  });

module.controller("prodDetailsController", function($scope,$rootScope,ParameterService) {
	
	$scope.values=ParameterService.getParameters();
	$rootScope.showCarousel=false;
  });

module.controller("loginController", function($scope, $http,$rootScope,$location,localStorageService) {
	$rootScope.showCarousel=false;
		$scope.signin = function (sign){
			var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/signin",sign).success(function(data){
				$scope.sighindata = data;
				if($scope.sighindata.result == "success"){					
					$rootScope.$broadcast('username',sign.uname);
					 localStorageService.set('unamestore', sign.uname);
					$location.path("/default");
					//$scope.apply();
				} else{
					$location.path("/login");
					//$scope.apply();
					$scope.errormessage = $scope.sighindata.message;
					alert('Invalid Login: Pleae Enter correct Details');
				}
			});
		}
	  
  });

module.controller("logoutController", function($scope, $http,$rootScope,$location,localStorageService) {
	$rootScope.showCarousel=true;
			var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/signout").success(function(data){
				localStorageService.set('unamestore',null);
				$scope.uname='';
				$scope.authenticate=false;
				$rootScope.authenticate=false;
				$rootScope.$broadcast('username','');
                alert('Logged Out Successfully');				
		});
	  
  });

module.controller("mainController",  function($scope,$http,$rootScope,localStorageService) {
	
	$scope.uname="";
	if(localStorageService.get('unamestore')!=null){
		$scope.uname=localStorageService.get('unamestore');
		$scope.authenticate=true;
		$rootScope.authenticate=true;
	}
	$rootScope.$on('username',function(event,data){
		if(!data==''){
		$scope.uname=data;$scope.authenticate=true;$rootScope.authenticate=true;
		}else{
			$scope.uname='';$scope.authenticate=false;$rootScope.authenticate=false;
		}
				
	});
	$rootScope.showCarousel=true;
	$( '#deskmenu' ).css( 'display', 'none');
	var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/RecentAdds");
	response.success(function(reg) {
		$scope.prods=reg;
		
	});
	response.error(function(reg, status, headers, config) {
		
	});
	
	$scope.tags={};
	$scope.tag=function(){
		response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/Options");
		response.success(function(reg) {
			$scope.tags=reg;
			return reg;
		});	
		response.error(function(reg, status, headers, config) {
			
		});
	}
	$scope.tag();
	
  });
   

module.controller("searchController",  function($scope,$http,$rootScope,$location,ParameterService) {
	var response;
	$scope.options={};
	$scope.search={};
	$scope.option=function(){
		response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/Options");
		response.success(function(reg) {
			$scope.options=reg;
			return reg;
		});	
		response.error(function(reg, status, headers, config) {
			
		});
	}
	$scope.option();
	$scope.search={"searchtext":"","minprice":"","maxprice":"","category":""};
    
	$scope.change = function (){
		$scope.search.category=$scope.category.cateValue;
	}
	
	$scope.onSearch=function (search){
		//$scope.parameters={"category":$routeParams.param};
		var response = $http.post("http://localhost:8080/ShoppingPortal/restful/service/ProdBySearch",search);
		response.success(function(reg) {

			$scope.prods=reg;
			ParameterService.setParameters(reg);
			$location.path('/');
			$scope.$apply();
			$location.path('/searchResults');
			$scope.$apply();
			
		});
		response.error(function(reg, status, headers, config) {
			
		});
		
	}
  });


module.directive('resize', function ($window) {
    return function (scope, element) {
        var w =$window;
        scope.getWindowDimensions = function () {
            return {
                'h': w.innerHeight,
                'w': w.innerWidth
            };
        };
        scope.$watch(scope.getWindowDimensions, function (newValue, oldValue) {
 /*           scope.windowHeight = newValue.h;
            scope.windowWidth = newValue.w;
            
 */         
    /*    	if(newValue.w<650){
        		$( '#deskmenu' ).css( 'display', 'none');
        		$( '#mobilemenu' ).css( 'display', 'block');
        	} else {
        		$( '#deskmenu' ).css( 'display', 'block');
        		$( '#mobilemenu' ).css( 'display', 'none');
        		}
    */    	if(newValue.w<415)
        	{
	 AdjustRecentAdds();
	 AdjustRecentAdds(); 
        	}
 else
	 RevertRecentAdds(); 
        }, true);

        angular.element($window).bind('resize', function () {
            scope.$apply();
        });
    }
})


function getDocHeights() {

    return document.getElementById("all").scrollHeight;
}

		function AdjustRecentAdds(){     
	        
		$( '#ads' ).css( 'top', getDocHeights()-(getDocHeight()/2.3)  );
	        $( '#ads' ).css( 'float', 'left');
		}

	function RevertRecentAdds(){     
	        $( '#ads' ).css( 'top','auto');
	        $( '#ads' ).css( 'float', 'right');
		}
	

	
	
	module.service('ParameterService', function() {
	    var param={};
		this.setParameters = function(params) {
			param=params;
	        }
		this.getParameters = function() {
			return param;
	        }
	});