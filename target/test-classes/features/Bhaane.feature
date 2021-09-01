Feature: Test for Bhaane.com Website Funtionality
@Sign_up
Scenario: Verify that website URL should be accessible
Given User is at Home page
Then Home page is successfully open

Scenario: PopUp response
Given User is at Home page
When User enter Name
And User Enter Email
And User click on SignUp button
Then Show Thank you for Subscribing

Scenario: Close PopUp
Given User is at Home page
When User click on Close Symbol


@Sign_up 
Scenario: Click an Account button
Given User is at Home page
When User click on Close Symbol
And User click on Account Text
Then Account TextLink open successfully

@Sign_up
Scenario: SignUp with valid Details
Given User is at Home page
When User click on Close Symbol
And User click on Account Text
And user click on SignUp LinkText
And user enters valid FirstName
And user enters valid LastName
And user enters valid EmailId
And user enters valid Mobile Number
And user enters valid Password
And user click on submit button
Then SignUp should be successfully

@login_page
Scenario: Login with valid Details
Given User is at Home page
When User click on Close Symbol
And User click on Account Text
And user enters valid EmailId
And user enters valid Password
And user click on Login button
Then Login should be successfully
 
 @Dresses_Functionality
Scenario: Click on Dresses
Given User is at Home page
When User click on Close Symbol
And User click on Dresses
Then Click on dreeses should be successfully

@Dresses_Functionality
Scenario: Click on Jumpsuits
Given User is at Home page
When User click on Close Symbol
And User click on Dresses
And User click on Jumpsuits
Then Click on Jumpsuits should be successfully

@Dresses_Functionality
Scenario: Click on Jumpsuits Price
Given User is at Home page
When User click on Close Symbol
And User click on Dresses
And User click on Jumpsuits
And User click on Price
Then Click on Price should be successfully

@Dresses_Functionality
Scenario: Click on Jumpsuits Price Low-High
Given User is at Home page
When User click on Close Symbol
When User click on Dresses
And User click on Jumpsuits
And User click on Price
And User Click on Low-High
Then Click on Low-High should be successfully

@Dresses_Functionality
Scenario: Click on Selected dress picture
Given User is at Home page
When User click on Close Symbol
When User click on Dresses
And User click on Jumpsuits
And User click on Price
And User Click on Low-High
And User click on Selected dress Picture
Then Picture should be successfully Selected

@Dresses_Functionality
Scenario: Click on Addtobag
Given User is at Home page
When User click on Close Symbol
When User click on Dresses
And User click on Jumpsuits
And User click on Price
And User Click on Low-High
And User click on Selected dress Picture
And User Click on AddToBag button
Then Dress AddtoBag should be sucessfully

@Dresses_Functionality
Scenario: Click on Gotocart
Given User is at Home page
When User click on Close Symbol
When User click on Dresses
And User click on Jumpsuits
And User click on Price
And User Click on Low-High
And User click on Selected dress Picture
And User Click on AddToBag button
And User click on Gotocart button
Then Dress Gotocart should be sucessfully

@Tops_Functionality
Scenario: Click on tops
Given User is at Home page
When User click on Close Symbol
When User click on tops
Then Click on tops should be successfully

@Tops_Functionality
Scenario: Click on Shirts in tops Option
Given User is at Home page
When User click on Close Symbol
When User click on tops
And User click on Shirts
Then Click on Shirts should be successfully

@Tops_Functionality
Scenario: Click on Gender
Given User is at Home page
When User click on Close Symbol
When User click on tops
And User click on Shirts
And User click on Gender
Then Click on Gender should be successfully



@Tops_Functionality
Scenario: Click on female in gender option
Given User is at Home page
When User click on Close Symbol
When User click on tops
And User click on Shirts
And User click on Gender
And user click on Female



@Tops_Functionality
Scenario: select shirt  picture and size
Given User is at Home page
When User click on Close Symbol
When User click on tops
And User click on Shirts
And User click on Gender
And user click on Female
And User click on Selecte Shirt Picture
And User Select a Size

@Tops_Functionality
Scenario: Click on Addtobag
Given User is at Home page
When User click on Close Symbol
When User click on tops
And User click on Shirts
And User click on Gender
And user click on Female
And User click on Selecte Shirt Picture
And User click on Add to bag button
Then Alert message show This Product Out of Stock


Scenario: Click on Stores Option
Given User is at Home page
When User click on Close Symbol
When User click on stores option

Scenario: Click on Mumbai Option in stores
Given User is at Home page
When User click on stores option
And  user Click on Mumbai option in stores

Scenario: Click on Contact Option
Given User is at Home page
When User click on Close Symbol
When User click on contact option
Then click on contact  should be successfully

Scenario: Click on terms Option
Given User is at Home page
When User click on Close Symbol
When User click on terms option
Then click on terms should be successfully

Scenario: Click on an Other Option
Given User is at Home page
When User click on Close Symbol
When User click on other option
Then click on other should be successfully

Scenario: Click book in others Option
Given User is at Home page
When User click on Close Symbol
When User click on other option
And User click on book option
Then click on book option should be successfully


Scenario: Select Book in book option
Given User is at Home page
When User click on Close Symbol
When User click on other option
And User click on book option
And user select one book and click on the book 
Then click on book should be successfully

Scenario: click on facebook
Given User is at Home page
When User click on Close Symbol
When User click on facebook symbole
Then click on facebook should be successfully

























