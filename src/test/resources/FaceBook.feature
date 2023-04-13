Feature: Facebook
 
Background: 
 Given launch the url page
 
@sanity
Scenario: LogIn
 Given user sends email and pass
 And  user get all text 
 When user click log in
 
@sanity
Scenario Outline: Create a new account
 Given user click the new acc
 And user clicks firstname "<fname>"
 When user clicks lastname "<lname>"
 Then user clicks email "<email>"
 When user clicks password "<pass>"
 Then user clicks DOB "<date>" "<month>" "<year>"
 When user clicks gender
 
  Examples:
 |fname|lname|email|pass|date|month|year|
 |giridharan|m|giridharan@gmail.com|djfdj@56|31|July|1997|
 |arumugam|m|arumugam@gmail.com|asdg@56|13|may|1998|