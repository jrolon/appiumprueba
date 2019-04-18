#Author: your.email@your.domain.com

Feature: Eribank sign in
  I want to join Eribank

  @tag1
  Scenario Outline: Successful case of correct key entry
    Given I want to write a step with <user>
    When I check for the <password> in step
    Then I verify the <status> in step

    Examples: 
      | user  | password | status  |
      | name1 |     5    | success |
     
			
    
    
    
    
    
    
    
    
    


