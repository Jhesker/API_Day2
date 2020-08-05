# Testing Code for your api to test day 2 validation
## Testing `PUT` method 
	-test for empty. Simple send an empty test
```sql
 {
  }
```
	-test for a first name > 20 characters
```sql
 {
        "firstName": "abcdefghijklmnopqrstuvwxyuz",
        "lastName": "Smith",
        "state": "New York"
  }
```
	-test for a state with less than 4 characters
```sql
 {
        "firstName": "John",
        "lastName": "Doe",
        "state": "TX"
  }
```
## Testing `POST` method
	- test a last name less than 2 characters
```sql
 {
        "firstName": "Bill",
        "lastName": "Ni",
        "state": "Illinois"
  }
```
	-test a state with a name longer than 20 characters
```sql
 {
        "firstName": "Bill",
        "lastName": "Nye",
        "state": "ThatOneScienceGuyWhoEveryoneLovedGrowingUp"
  }
```
## Control Test For all 
```sql
 {
        "firstName": "Jane",
        "lastName": "Doe",
        "state": "Missouri"
  }
```

## Testing `GET` 
	-input URL and Select the `GET` method and send.

## Notes	 
	- Be sure to create some more tests on your own.
	- Testing is a large part of becoming a programmer!!!

## Trouble shooting. 
 	- Make sure you are calling the right method and Url in the bar at the top of Postman
 	- Make sure you are in the body section with `Raw` option selected. 
 	- Also make sure that you are making the call in `JSON` format

## [Guide For beginners](https://www.srijan.net/blog/manual-api-testing-using-postman) 
## [Download Postman](https://www.postman.com/)