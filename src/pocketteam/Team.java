package pocketteam;

import java.util.ArrayList;

/**
 *
 * @author Justin Hyland
 */
public class Team {
    
    private ArrayList<Player> roster;
    
    public Team(){
        roster = new ArrayList<>();
    }
    
    /**
     * Returns the roster of players
     * @return roster
     */
    public ArrayList<Player> getRoster(){
        return roster;
    }
    
    /**
     * Adds player to the roster
     * @param player - a player object 
     */
    public void addPlayer(Player player){
        roster.add(player);
    }
    
    /**
     * removes player from roster 
     * @param player - a player object
     */
    public void removePlayer(Player player){
        roster.remove(player);
    }
    
    
}//end Team
