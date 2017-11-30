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
public class PremiumSeat extends Seat {

    private String seatArea, seatName;
    private double seatPrice;
    private int ticketId, premiumSeatAvailable;
    private String[] meal;
    private boolean fastTrack;
    private char gate;
    private String[] parking;

    public PremiumSeat(String gameName, double gamePrice, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, gamePrice, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Premium Area";
        this.seatName = "Premium Class Seat";
        this.seatPrice = 60;
        gate = 'A';
        fastTrack = true;
        meal = new String[] {"Wine meal","Champange meal","Buffet"};
        parking = new String[] {"Car park A","Car park B"};
        this.premiumSeatAvailable = premiumSeatAvailable;
    }

    public String[] getParking() {
        return parking;
    }

    public char getGate() {
        return gate;
    }

    public boolean getFastTrack() {
        return fastTrack;
    }

    public String[] getMeal() {
        return meal;
    }

    public void setPremiumSeatAvailable(int premiumSeatAvailable) {
        this.premiumSeatAvailable = premiumSeatAvailable;
    }

    public void seatPurchased() {
        super.normalSeatsAvailable--;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getIdArea() {
        return ticketId;
    }


    public String getTicketId() {
        return seatName+premiumSeatAvailable;
    }

    @Override
    public String getSeatArea() {
        return String.format("The %s %s with %d seats available",seatName,seatArea,premiumSeatAvailable); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        return (super.getPrice()+seatPrice);
    }


    @Override
    public String getSeatPrice() {
        return String.format("Price of ticket is: %s",getPrice()); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String getSeatName() {
        return String.format("%s",seatName); //To change body of generated methods, choose Tools | Templates.
    }



}
