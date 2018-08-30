Feature: Validate the following functionalities on HomePage
	1.Verify Home Tab is displayed
     Background:
     Given that user should launch the browser and enter "url"
	            |http://server/bank|	

@Tab1
Scenario: This scenario is designed to validate the Tabs are Displayed on the HomePage
	       And Verify the tab order
	    
@Tab2	    
Scenario: This scenario is designed to validate the Menu strip tabs are displayed in required order
       When Click on each tab and check the links text
       