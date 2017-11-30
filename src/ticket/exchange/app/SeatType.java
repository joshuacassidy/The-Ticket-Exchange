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
public class SeatType {
    public String seatName,seatArea,seatPrice;
    public double basePrice;
    
    public SeatType() {
        this.seatName = "Seat Name: ";
        this.seatPrice = "Seat Price: ";
        this.basePrice = 50;
        this.seatArea = "is located in the";
    }

    public String getSeatPrice() {
        return seatPrice;
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
    
    
    
    
}
