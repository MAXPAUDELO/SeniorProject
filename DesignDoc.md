# SeniorProject
The Android Application developed for Senior Project


Pocket Team
Design Specifications

	Justin Hyland and Max Audelo



The Pocket Team Android application’s functionality will be designed using these core classes:


Player Class - This class will hold a player's information such as name, contact information,and player's statistics. This class will have the following fields and methods. Each class field will begin with “m_” then field name :

    String m_FirstName; 
    String m_LastName;
    String m_Position;
    String m_PhoneNumber;
    String m_PlayerNumber;
    String m_TeamName;
    double m_BatAverage;
    double m_SluggingPercentage;
    double m_ERA;
    int m_RBIs;
    int m_Saves;
    int m_Wins;
    int m_Losses;
    int m_Hits;
    Stat m_Calc;


	 	 	
Stat Class - This class will provide all of the functions to calculate all the baseball statistics including batting average, ERA, and Slugging Percentage.


Team Class – will an ArrayList of Player objects. It will contain a team name, add/remove functions for players on a team.

ArrayList<Player> roster;
String m_TeamName;

Sorting_Interface – The concrete implementation will use a bubble sort to sort between different baseball statistics.

sortBattingAvg()
sortSluggingPercentage()
sortOnBasePercentage()
sortERA()
sortHomeruns()
sortRBIs()
sortWins()
sortLosses()
sortsSaves()
sortHits()


Statistics Featured:

Batting Avg
Slugging Percentage
ERA
On Base Percentage
Home Runs
RBIs
Saves
Wins(Pitching)
Losses(Pitching)

More statistics may be added.


Players' photos will be kept in a folder and referenced from a player object. There will be a photo for each player
in the roster. 


The Spray Chart Feature will have this image as a base to use as a player's template:
When a user touches the screen a spot on the image will be marked and saved for each player.



Activity layouts will be added to the design when implemented.

