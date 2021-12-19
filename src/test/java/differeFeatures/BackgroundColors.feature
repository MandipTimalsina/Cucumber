@Smoke
Feature: Techfios TODO List Page Background Color Validation 

@Scenario1
Scenario: User should be able to set Sky Blue Background 
	Given "Set SkyBlue Background" button exists 
	When I click on the "Set SkyBlue Background" button  
	Then the background color will change to sky blue 
@Scenario2
Scenario: User should be able to set Sky Blue Background 
	Given "Set White Background" button exists  
	When I click on the "Set White Background" button 
	Then the background color will change to white 