
package pocketteam;

/**
 *
 * @author Justin Hyland
 */
public class Stat {
    
    
    
    public Stat(){
        
    }
    
    /**
     * Returns the batting average of a player based on hits and atBats
     * @param hits - number of hits
     * @param atBats - number of atBats
     * @return 
     */
    public double battingAverage(int hits, int atBats) {

        return hits / atBats;
    }//end battingAverage
    
    
    /**
     * Returns the ERA of a player based on earned runs and innings pitched
     * @param earnedRuns - player's earned runs
     * @param innings - innings pitched by player
     * @return 
     */
    public double getERA(int earnedRuns, double innings){
        return (earnedRuns * 9) / innings;
    }
    
    /**
     * Returns the slugging percentage of the player based on singles, doubles, triples, homeruns
     * @param singles
     * @param doubles
     * @param triples
     * @param homeruns
     * @param atBats
     * @return 
     */
    public double sluggingPercentage(int singles, int doubles, int triples, int homeruns, int atBats){
       double slugging = 0;
       int totalBases = 0;
       
        totalBases = singles + (doubles * 2) + (triples * 3) + (homeruns * 4);
        
        return slugging = totalBases / atBats; 
    }
    
    
    
    
    
    
}//end Stat
