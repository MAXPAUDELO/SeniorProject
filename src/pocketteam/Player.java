
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
    
    public double getERA(){
        return m_ERA;
    }
    
    public int getRBI(int rbi){
        return m_RBIs;
    }
    
    public int getSaves(int saves){
        return m_Saves;
    }
    
     public int getWins( int wins){
        return m_Wins;
    }
     
     public int getLosses(){
        return m_Losses;
    }
     
     public int getHits(int hits){
         return m_Hits;
     }//
    
}//end Player
