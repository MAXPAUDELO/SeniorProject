
package pocketteam;

/**
 *
 * @author Justin Hyland
 */
public class Player {
    
    private String m_FirstName; 
    private String m_LastName;
    private String m_Position;
    private String m_PhoneNumber;
    private String m_PlayerNumber;
    private double m_BatAverage;
    private double m_SluggingPercentage;
    private double m_ERA;
    private int m_RBIs;
    private int m_Saves;
    private int m_Wins;
    private int m_Losses;
    private int m_Hits;
    private Stat calc;
    
    
    
    public Player(String first, String lastName, String position, String number){
        
        m_ERA = 0;
        m_RBIs = 0;
        m_Saves = 0;
        m_Wins = 0;
        m_Losses = 0;
    }
    
    
    public void setFirstName(String firstname){
        m_FirstName = firstname;
    }
    
    public String getFirstName(){
        return m_FirstName;
    }
    
    
    public void setLastName(String lastname){
        m_LastName = lastname;
    }
    
    public String getLastName(){
        
        return m_LastName;
    }
   
    public void setPosition(String position){
        
        m_Position = position;
    }
    
    public String getPosition(){
        
        return m_Position;
    }
    
    public void setPhoneNumber(String number){
        m_PhoneNumber = number;
    }
    
    public String getPhoneNumber(){
        
        return m_PhoneNumber;
    }
    
    public void setPlayerNumber(String number){
        m_PlayerNumber = number;
    }
    
    public String getPlayerNumber(){
        return m_PlayerNumber;
    }
    
    public double getBatAvg(int hits, int atBats){
      m_BatAverage = calc.battingAverage(hits, atBats);
      return m_BatAverage;
    }
    
    public double getSlugg(){
        return m_SluggingPercentage;
    }
    
    public double getERA(int runs, double innings){
        return m_ERA = calc.getERA(runs, innings);
    }
    
    
    
    public int getRBI(int rbi){
        return m_RBIs;
    }
    
    public int getSaves(int saves){
        return m_Saves;
    }
    
    /**
     * Sets number of wins the player has
     * @param number 
     */
    public void setWins(int number){
        m_Wins = number;
    }
    
    /**
     * Increments the players win by + 1
     */
    public void incrementWins(){
        m_Wins++;
    }
    
    /**
     * Decrements the players wins by - 1
     */
    public void decrementWins(){
        m_Wins--;
    }
    
    /**
     * Returns the number of wins the player has
     * @param wins
     * @return int
     */
     public int getWins( int wins){
        return m_Wins;
    }
     
     
     /**
     * Sets number of losses the player has
     * @param number 
     */
    public void setLosses(int number){
        m_Losses = number;
    }
    
    /**
     * Increments the players losses by + 1
     */
    public void incrementLosses(){
        m_Losses++;
    }
    
    /**
     * Decrements the players losses by - 1
     */
    public void decrementLosses(){
        m_Losses--;
    }
     
    /**
     * Returns the number of losses a player has
     * @return 
     */
     public int getLosses(){
        return m_Losses;
    }
     
     /**
      * Sets a players hits
      * @param hits - number hits for a player
      */
     public void setHits(int hits){
         m_Hits = hits;
     }
     
     /**
      * Increments the current amount of hits by + 1
      */
     public void incrementHits(){
         m_Hits++;
     }
     
     /**
      * Decrements the current amount of hits by - 1
      */
     public void decrimentHits(){
         m_Hits--;
     }
    
     /**
      * Returns the current hits of the player
      * @return 
      */
     public int getHits(){
         return m_Hits;
     }//
    
}//end Player
