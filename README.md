# Patriots 2017 Season Outlook

## Description

This is my final project for CSCI E-56, a New England Patriots 2017 season outlook. The aim of this endeavor is to present a breadth of information and statistics pertaining to the forthcoming season of the defending super bowl-champion New England Patriots. The primary landing page is a calendar outlining the 2017 Patriots regular season schedule. Each game has data points such as date, time, opponent, and location. The application provides calculations from historical data that illustrate past performance versus the current opponent. I find football stadiums interesting and include unique data points for each venue like capacity, year built, architect, and an interesting fact or two. Another component of the application is a current active roster. The roster links to player profiles featuring data points like: name, university attended, position, number, age, contract status, and salary. I also include compelling data calculations like probability of being injured, and average games missed per season due to injury/suspension. The content is laid out in a logical way that appeals to my user and will scale to accommodate devices of different size.

## Outline

### Domain Classes:

**1. Season**
- Name
- Start date/End date
- Has many games

**2. Game**
- Date
- Stadium 
- Home team
- Away team
- Home team win record
- Away team win record
- A calculation predicting the winner of the game

**3. Player**
- First name
- Last name
- Position
- University
- Age
- Jersey number
- Contract status
- Contract value
- Contract end date
- Total games played
- Total games missed
- A calculation predicting how many games will miss this season

**4. Stadium**
- Name
- Location
- Architect
- Playing Surface
- Year opened
- Seating capacity
- Interesting Fact
- Home team

**5. Team**
- Name
- City

**6. User**
- Default properties

**7. Role**
- Default properties

**8. UserRole**
- Default properties



>Will probably update the user permissions so that an authenticated user can update/edit the data to modify the outcomes of the probability calculations

### Libraries  
- jQuery
- bootStrap
- Grails
- Spring Security Plugin
- <a href="https://www.w3schools.com/howto/howto_js_sort_table.asp" target="_blank">Javascript Table Sorting</a>

### Externally Sourced Images and Direct Quotes
 - The 2017 season header image is property of patriots.com
 - Many of the interesting facts associated with NFL stadiums are from Wikipedia
