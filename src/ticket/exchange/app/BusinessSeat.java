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
public class BusinessSeat extends Seat {
    
    private int capacity;
    private String[] meal;
    
    /**
    * @author Joshua Cassidy, x15378586
    * @author Yotaphon Sutweha, x16309311
    * @purpose: BusinessSeat constructor overriding the default values declared in the seat class. 
    */
    public BusinessSeat(String gameName, int normalSeatsAvailable, int businessSeatAvailable, int premiumSeatAvailable) {
        super(gameName, normalSeatsAvailable, businessSeatAvailable, premiumSeatAvailable);
        this.seatArea = "Corporate Box";
        this.seatName = "Business Class Seat";
        this.capacity = 15;
        this.gate = 'B';
        this.meal = new String[] {"Wine meal","Champange meal","Buffet"};
        this.businessSeatAvailable = businessSeatAvailable;
        this.maxSeatsAvailable = 20;
    }

    /**
    * @author Joshua Cassidy, x15378586
    */
    public int getCapacity() {
        return capacity;
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
        return ((seatPrice+30)*capacity);
    }
    
}