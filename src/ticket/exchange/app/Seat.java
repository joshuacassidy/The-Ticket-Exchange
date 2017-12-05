/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/*
 *  Classname: TicketExchangeGUI.java
 * 
 *  Version information: Final
 *
 *  Date: 27th October 2017
 *
 * @author: Joshua Cassidy, x15378586
 * In collaboration with: Yotaphon Sutweha, x16309311
 */

public class Seat implements Serializable {
    private String gameName;
    protected int normalSeatsAvailable,businessSeatAvailable,premiumSeatAvailable;
    protected String seatName,seatArea;
    protected double seatPrice;
    protected char gate;
    protected int maxSeatsAvailable;
 
    
    /**
    * @author Joshua Cassidy, x15378586
    * @purpose: Seat constructor sets the initial values for the variable that can be overrode. 
    */
    public Seat(String gameName, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        this.gameName = gameName;
        this.seatName = "Economy Lounge";
        this.seatArea = "Economy Class Seat";
        gate = 'C';
        this.normalSeatsAvailable = normalSeatsAvailable;
        this.businessSeatAvailable = businessSeatAvailable;
        this.premiumSeatAvailable = premiumSeatAvailable;
        this.seatPrice = 50;
        this.maxSeatsAvailable = 30000;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public int getMaxSeatsAvailable() {
        return maxSeatsAvailable;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public char getGate() {
        return gate;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public void setNormalSeatsAvailable(int normalSeatsAvailable) {
        this.normalSeatsAvailable = normalSeatsAvailable;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public void setBusinessSeatAvailable(int businessSeatAvailable) {
        this.businessSeatAvailable = businessSeatAvailable;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public void setPremiumSeatAvailable(int premiumSeatAvailable) {
        this.premiumSeatAvailable = premiumSeatAvailable;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public String getGameName() {
        return gameName;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public int getNormalSeatsAvailable() {
        return normalSeatsAvailable;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public int getBusinessSeatAvailable() {
        return businessSeatAvailable;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public int getPremiumSeatAvailable() {
        return premiumSeatAvailable;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public String getSeatName() {
        return seatName;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public double getPrice() {
        return seatPrice;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public String getSeatArea() {
        return seatArea;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public String getSeatPrice() {
        return String.format("Price of ticket is: %.2f",getPrice());    
    }
   
}
