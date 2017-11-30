/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

/**
 *
 * @author Josh
 */
public class PremiumSeat extends Seat {
    private String[] meal;
    private boolean fastTrack;
    private String[] parking;
    
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
    
    public String[] getParking() {
        return parking;
    }
    
    public boolean getFastTrack() {
        return fastTrack;
    }

    public String[] getMeal() {
        return meal;
    }


//    @Override
//    public String getTicketId() {
//        return seatName+premiumSeatAvailable;
//    }

    @Override
    public double getPrice() {
        return (seatPrice+60);
    }
    

//    @Override
//    public String getSeatPrice() {
//        return String.format("Price of ticket is: %s",getPrice()); //To change body of generated methods, choose Tools | Templates.
//    }

    
    
    
}
