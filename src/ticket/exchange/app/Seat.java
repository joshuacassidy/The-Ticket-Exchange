/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/**
 *
 * @author Josh
 */
public class Seat implements Serializable {
    private String gameName;
    protected int normalSeatsAvailable,businessSeatAvailable,premiumSeatAvailable;
    public String seatName,seatArea;
    protected double seatPrice;
    protected char gate;
    protected int maxSeatsAvailable;
    
    
    int ticketId;
    
    public Seat(String gameName, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        this.gameName = gameName;
        this.seatName = "Economy Lounge";
        this.seatArea = "Economy Class Seat";
        gate = 'C';
        this.normalSeatsAvailable = normalSeatsAvailable;
        this.businessSeatAvailable = businessSeatAvailable;
        this.premiumSeatAvailable = premiumSeatAvailable;
        this.seatPrice = 50;
        this.maxSeatsAvailable = 100;
    }
    public int getMaxSeatsAvailable() {
        return maxSeatsAvailable;
    }
    
    public char getGate() {
        return gate;
    }

    public void setNormalSeatsAvailable(int normalSeatsAvailable) {
        this.normalSeatsAvailable = normalSeatsAvailable;
    }

    public void setBusinessSeatAvailable(int businessSeatAvailable) {
        this.businessSeatAvailable = businessSeatAvailable;
    }

    public void setPremiumSeatAvailable(int premiumSeatAvailable) {
        this.premiumSeatAvailable = premiumSeatAvailable;
    }

    public String getGameName() {
        return gameName;
    }

    public int getNormalSeatsAvailable() {
        return normalSeatsAvailable;
    }

    public int getBusinessSeatAvailable() {
        return businessSeatAvailable;
    }

    public int getPremiumSeatAvailable() {
        return premiumSeatAvailable;
    }

    public String getSeatName() {
        return seatName;
    }

    public double getPrice() {
        return seatPrice;
    }

    public String getSeatArea() {
        return seatArea;
    }
    
    public String getSeatPrice() {
        return String.format("Price of ticket is: %s",getPrice()); //To change body of generated methods, choose Tools | Templates.
    }
   
}
