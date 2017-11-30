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
    private int capacity;
    private String[] meal;
    private char gate;

    public BusinessSeat(String gameName, double gamePrice, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, gamePrice, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Business Area";
        this.seatName = "Business Class Seat";
        this.seatPrice = 30;
        capacity = 15;
        gate = 'B';
        meal = new String[] {"Wine meal","Champange meal","Buffet"};
        this.businessSeatAvailable = businessSeatAvailable;
    }

    public char getGate() {
        return gate;
    }

    public int getCapacity() {
        return capacity;
    }

    public String[] getMeal() {
        return meal;
    }

    @Override
    public void seatPurchased() {
        super.businessSeatAvailable--;
    }

    @Override
    public String getSeatArea() {
        return String.format("The %s %s with %d seats available",seatName,seatArea,businessSeatAvailable); //To change body of generated methods, choose Tools | Templates.
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
        return String.format("%s" ,seatName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

}