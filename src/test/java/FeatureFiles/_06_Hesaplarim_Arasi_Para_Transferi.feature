Feature: Transferring funds between my accounts

Scenario: Login with valid username and password
Given Navigate To ParaBank
When Enter username and password and click login button
Then User should log-in successfully


Scenario: Transferring funds between my accounts
And Accessing the page for money transfers
When Money Transfer Process and Sending Funds
Then Transfer Verification and Control
