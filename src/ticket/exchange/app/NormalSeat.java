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
public class NormalSeat extends SeatType {
    
    private String seatArea, seatName;
    private double seatPrice;

    public NormalSeat() {
        this.seatArea = "Normal Area";
        this.seatName = "Normal Class Seat";
        this.seatPrice = 0;
    }
    
    

    @Override
    public String getSeatArea() {
        return String.format("The %s %s %s",seatName,super.getSeatArea(),seatArea); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getPrice() {
        return (super.getPrice()+seatPrice);
    }
    

    @Override
    public String getSeatPrice() {
        return String.format("%s%s",super.getSeatPrice(),getPrice()); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String getSeatName() {
        return String.format("%s %s",super.getSeatName(),seatName); //To change body of generated methods, choose Tools | Templates.
    }
    
}
