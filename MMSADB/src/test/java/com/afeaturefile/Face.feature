Feature: To Test The Facebook Application
@smoketest1
Scenario: Checks The Login Functionality
Given user Launch Url Of The Facebook Application
When user Enter The Username In The Respective Field
And user Enter The Password In The Respective Field
Then user Clicks The Loginbutton and Its Navigates To The Homepage
@smoketest2
Scenario: Checks The Post Creation Functionality
When user Click The Post button