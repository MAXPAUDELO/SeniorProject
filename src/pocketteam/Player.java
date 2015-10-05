/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketteam;

/**
 *
 * @author Justin Hyland
 */
public class Player {
    
    private String firstName; 
    private String lastName;
    private String position;
    private String phoneNumber;
    private String playerNumber;
    private double batAverage;
    private double sluggingPercentage;
    private double ERA;
    private int RBIs;
    private int Saves;
    private int Wins;
    private int Losses;
    
    
    
    public Player(String first, String lastName, String position, String number){
        
        ERA = 0;
        RBIs = 0;
        Saves = 0;
        Wins = 0;
        Losses = 0;
    }
    
    
    public String getFirstName(){
        
        return firstName;
    }
    
    
    public String getLastName(){
        
        return lastName;
    }
   
    public String getPosition(){
        
        return lastName;
    }
    
    public String getPhoneNumber(){
        
        return lastName;
    }
    
    public String getPlayerNumber(){
        return playerNumber;
    }
    
    public double getBatAvg(){
        return batAverage;
    }
    
    public double getSlugg(){
        return sluggingPercentage;
    }
    
    public double getERA(){
        return ERA;
    }
    
    public int getRBI(){
        return RBIs;
    }
    
    public int getSaves(){
        return Saves;
    }
    
     public int getWins(){
        return Saves;
    }
     
     public int getLosses(){
        return Losses;
    }
    
}//end Player
