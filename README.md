# Patriots 2017 Season Outlook
[Product demo](https://www.youtube.com/watch?v=tK9ajvjMDIU&t=30s)

## Description

This is my final project for CSCI E-56, a New England Patriots 2017 season outlook. The aim of this endeavor is to present a breadth of information and statistics pertaining to the forthcoming season of the defending super bowl-champion New England Patriots. The primary landing page is a calendar outlining the 2017 Patriots regular season schedule. Each game has data points such as date, time, opponent, and location. These data points are sortable by clicking on the table header row. The application provides calculations from historical data that illustrate past performance versus the current opponent. I find football stadiums interesting and include unique data points for each venue like capacity, year built, architect, and an interesting fact or two. Another component of the application is a current active roster. The roster contains player data points like: name, university attended, position, number, age, contract status, and salary. Authenticates users have permission to perform CRUD operations on the roster class. I also include compelling data calculations like average games missed per season due to injury or suspension. The content is laid out in a logical way that appeals to my user and scales to accommodate devices of different size.

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
- Default properties from Spring Security

**7. Role**
- Default properties from Spring Security

**8. UserRole**
- Admin
- User



>Will probably update the user permissions so that an authenticated user can update/edit player data. All data is fictional unless otherwise noted.

### Libraries  
- jQuery
- bootStrap
- Grails
- Spring Security Plugin
- <a href="https://www.w3schools.com/howto/howto_js_sort_table.asp" target="_blank">Javascript Table Sorting</a>

### Externally Sourced Images and Direct Quotes
 - The 2017 season header image is property of patriots.com
 - Many of the interesting facts associated with NFL stadiums are from Wikipedia
