Feature: Validate the following functionalities ont he login module
	1.As an admin user application should accept only admin credentials
    2.If there is a invalid username and password user must validate the error message.
    3.If the user forgot username and password should be able to reset.


@smoketest
Scenario: This scenario is designed to validate the valid credentials of admin user
	    Given that user should launch the "ff" and enter "url"
	    |http://server/bank|	    
	    Then click on element to enter "data"
	   |sudha|
	    When click on "linktext" to navigate to nextpage
	    