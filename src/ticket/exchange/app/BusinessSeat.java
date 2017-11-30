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
public class BusinessSeat extends Seat {
    
//    private String seatArea, seatName;
//    private double seatPrice;
//    private int businessSeatAvailable;
    private int capacity;
    private String[] meal;
    
    public BusinessSeat(String gameName, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Corporate Box";
        this.seatName = "Business Class Seat";
//        this.seatPrice = 30;
        capacity = 15;
        gate = 'B';
        meal = new String[] {"Wine meal","Champange meal","Buffet"};
        this.businessSeatAvailable = businessSeatAvailable;
        this.maxSeatsAvailable = 20;
    }
//    @Override
//    public int getMaxSeatsAvailable() {
//        return maxSeatsAvailable;
//    }
//    @Override
//    public char getGate() {
//        return gate;
//    }
//
    public int getCapacity() {
        return capacity;
    }

    public String[] getMeal() {
        return meal;
    }
    
//    @Override
//    public String getSeatArea() {
//        return seatArea; //To change body of generated methods, choose Tools | Templates.
//    }
    
    @Override
    public double getPrice() {
        System.out.println(seatPrice+30);
        return ((seatPrice+30)*capacity);
    }
    
//    @Override
//    public String getTicketId() {
//        return seatName+businessSeatAvailable;
//    }

    @Override
    public String getSeatPrice() {
        return String.format("Price of ticket is: %.2f",getPrice());
    }

    
//    @Override
//    public String getSeatName() {
//        return String.format("%s" ,seatName); //To change body of generated methods, choose Tools | Templates.
//    }
    
//    @Override
//    public void setTicketId(int ticketId) {
//        this.ticketId = ticketId;
//    }
    
}