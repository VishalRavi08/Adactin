Feature: Adactin Hotel Application

@smoketest
Scenario: Login Functionality
Given user Launchs The Adactin Application
When user Enters The Username In The InputBox 
#When user Enters The "ThorRang" In The InputBox
And user Enters The Password In The InputBox
Then user Clicks The LoginButton And It Navigates To the SearchHotelPage 

Scenario: SearchHotel Functionality
When user Selects The Location From The Dropdown
And user Selects The Hotels From The Dropdown
And user Selects The RoomType From The Dropdown
And user Selects The NumberOfRooms From The Dropdown
And user Enters The CheckInDate In The InputBox
And user Enters The CheckOutDate In The InputBox
And user Selects The AdultsPerRoom From The Dropdown
And user Selects The ChildrenPerRoom From The Dropdown
Then user Clicks The SearchButton And It Navigates To The SelectHotelPage

Scenario: SelectHotel Functionality
When user Selects The RadioButton
Then user Clicks The ContinueButton And It Navigates To The BookAHotelPage

Scenario: BookAHotel Functionality
When user Enters The Firstname In The InputBox
And user Enters The Lastname In The InputBox
And user Enters The BillingAddress In The InputBox
And user Enters The CreditCardNo In The InputBox
And user Selects The CreditCardType From The Dropdown
And user Selects The ExpiryMonth From The Dropdown
And user Selects The ExpiryYear From The Dropdown 
And user Enters The CVVNumber In The InputBox
Then user Clicks The BookNowButton And It Navigates To The BookingConfirmationPage

Scenario: BookingConfirmation Functionality
Then user Clicks The MyItineraryButton And It Navigates To The BookedItineraryPage

Scenario: BookedItinerary Functionality
When user Clicks The LogoutButton And Nagivates To The LoginAgainPage

