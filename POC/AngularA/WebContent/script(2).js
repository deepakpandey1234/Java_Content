var module=angular.module("MyApp",['ngRoute','ui.bootstrap']);

module.config(['$routeProvider',
               function($routeProvider) {
                 $routeProvider.
                 when('/test', {
                   templateUrl: 'test.html',
                   controller: 'testController'
           	   })
           	.when('/contact', {
                templateUrl: 'contact.html'                
            });
}
]);




module.controller("homeController",  function($scope,$http) {
	var response = $http.get("http://localhost:8080/AngularA/pages/welcome");
	response.success(function(data) {
			$scope.person=data;
			alert($scope.person.number);
			//alert($scope.person.empName);
		//alert($scope.person.firstName);
	});
	response.error(function(data, status, headers, config) {
		
	});	
});

module.service("Firstservice",function(){
	this.store=function(){
		var data={
			firstname:'',
			lastname:'',
			email:'',
			telephone:''	
		};	
	return store;
	};

});
module.controller("testController",  function($scope,Firstservice,$location) {
	debugger;
	$scope.msg='DeepakYOYO';
	$scope.submit=function(){
		var formdata={
				firstname:$scope.firstname,
				lastname:$scope.lastname,
				email:$scope.email,
				telephone:$scope.telephone				
		};	
		Firstservice.store.data=formdata;
		$location.path("/contact");
		debugger;
	};
});


/*module.controller('contactController',  function($http,$scope,Firstservice) {
	$scope.firstname=Firstservice.store.data.firstname;
	$scope.lastname=Firstservice.store.data.lastname;	
});*/
module.directive('contactdirective',  function() {
	return{
		restrict:"A",
		templateUrl:"contactcomponent.html",
		controller:function($scope,Firstservice){
			$scope.firstname=Firstservice.store.data.firstname;
			$scope.lastname=Firstservice.store.data.lastname;	
		}
	};
});



