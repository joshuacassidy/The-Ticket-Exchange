/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/**
 *
 * @author Yo/Josh
 */
public class Seat implements Serializable {
    private String gameName;
    private double gamePrice;
    public int normalSeatsAvailable,businessSeatAvailable,premiumSeatAvailable;
    public String seatName,seatArea;
    public double basePrice;
    int ticketId;
    
    public Seat(String gameName, double gamePrice, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        this.gamePrice = gamePrice;
        this.gameName = gameName;
        
        this.seatName = "Normal Area";
        this.seatArea = "Normal Class Seat";
        
        this.normalSeatsAvailable = normalSeatsAvailable;
        this.businessSeatAvailable = businessSeatAvailable;
        this.premiumSeatAvailable = premiumSeatAvailable;
        this.basePrice = 50;
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

    public double getGamePrice() {
        return gamePrice;
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
        return basePrice;
    }

    public String getSeatArea() {
        return seatArea;
    }
    
    public void seatPurchased() {
        normalSeatsAvailable--;
    }
    
    public String getTicketId() {
        return seatName+normalSeatsAvailable;
    }
    
    public String getSeatPrice() {
        return String.format("Price of ticket is: %s",getPrice()); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
   
}
