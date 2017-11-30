/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

/**
 *
 * @author Yo/Josh
 */
public class BusinessSeat extends Seat {
    
    private String seatArea, seatName;
    private double seatPrice;
    private int businessSeatAvailable;
    
    public BusinessSeat(String gameName, double gamePrice, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, gamePrice, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Business Area";
        this.seatName = "Business Class Seat";
        this.seatPrice = 30;
        this.businessSeatAvailable = businessSeatAvailable;
    }

    @Override
    public void seatPurchased() {
        super.businessSeatAvailable--;
    }
    
    @Override
    public String getSeatArea() {
        return String.format("The %s %s %s with %d seats available",seatName,super.getSeatArea(),seatArea,businessSeatAvailable); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getPrice() {
        return (super.getPrice()+seatPrice);
    }
    
    @Override
    public String getTicketId() {
        return seatName+businessSeatAvailable;
    }

    @Override
    public String getSeatPrice() {
        return String.format("Price of ticket is: %s",getPrice());
    }

    
    @Override
    public String getSeatName() {
        return String.format("%s %s",super.getSeatName(),seatName); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    
}