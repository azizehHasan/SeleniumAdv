Feature: login to gameprint website
	In order to login 
	As a user
	I should have the username and password 
	
	
	Scenario: Validating login
	Given user on gameprint website 
	When user click on login button
	And fill the "username" and "password"
	Then the user should be able to see user menu
	And the user should be able to see Homepage title 
	
	
	
	