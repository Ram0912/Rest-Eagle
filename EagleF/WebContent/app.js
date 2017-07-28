/**
 * 
 */

var app = angular.module('myApp', [ 'ngRoute', 'ngCookies' ]);

console.log('----Starting app.js')
app.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'e_pages/home.html',
	}).when('/listofStudentpd', {
		templateUrl : 'e_personal/listofStudentpd.html',
		controller : 'studentpdController'
	}).when('/addNew', {
		templateUrl : 'e_personal/addNew.html',
		controller : 'studentpdController'
	}).when('/editStudentpd', {
		templateUrl : 'e_personal/editStudentpd.html',
		controller : 'editController'
		})

	.otherwise({
		redirectTo : '/'
	})
});