/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

/*
 *  Classname: TicketExchangeGUI.java
 * 
 *  Version information: Final
 *
 *  Date: 27th October 2017

 * @author Joshua Cassidy x15378586
 * In collaboration with: Yotaphon Sutweha, x16309311

 */

public class PremiumSeat extends Seat {
    private String[] meal;
    private boolean fastTrack;
    private String[] parking;
    
    /**
    * @author Joshua Cassidy, x15378586
    * @purpose: PremiumSeat constructor overriding the default values declared in the seat class. 
    */
    public PremiumSeat(String gameName, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Executive Lounge";
        this.seatName = "Premium Class Seat";
        gate = 'A';
        fastTrack = true;
        meal = new String[] {"Wine meal","Champange meal","Buffet"};
        parking = new String[] {"Car park A","Car park B"};
        this.premiumSeatAvailable = premiumSeatAvailable;
        this.maxSeatsAvailable = 3;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public String[] getParking() {
        return parking;
    }
    
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public boolean getFastTrack() {
        return fastTrack;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    */
    public String[] getMeal() {
        return meal;
    }
    
    /**
    * @author Joshua Cassidy, x15378586
    * @purpose: Updating the price of the seat using the super classes seatPrice.
    */    
    @Override
    public double getPrice() {
        return (seatPrice+60);
    }
    
}
