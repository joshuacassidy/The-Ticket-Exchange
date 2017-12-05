/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/*
 *  Classname: TicketExchangeGUI.java
 * 
 *  Version information: Final
 *
 *  Date: 20th October 2017

 * @author: Yotaphon Sutweha, x16309311
 * In collaboration with: Joshua Cassidy, x15378586
 *
 */
public class Records implements Serializable {
    private String fName,lName,ppsn,gender,age,email,phoneNo,meal,cardNumber,month,year,ccv, gameName, seatType;
    private boolean phoneOffer;
    private boolean emailOffer;
    private int quantity;
    
    /**
    * @author Yotaphon Sutweha, x16309311
    * @modifiedBy: Joshua Cassidy, x15378586
    * @purpose: Constructor for storing information about Premium Seat Instances.
    */
    public Records(String fName,String lName, String ppsn, String age,String gender, int quantity, String meal, String carPark, String email, String phoneNo, boolean phoneOffer, boolean emailOffer, String cardNumber, String month, String year, String ccv, String gameName, String seatType) {
        this.fName = fName;
        this.lName = lName;
        this.ppsn = ppsn;
        this.age = age;
        this.gender = gender;
        this.quantity = quantity;
        this.email = email;
        this.phoneNo = phoneNo;
        this.meal = meal;
        this.phoneOffer = phoneOffer;
        this.emailOffer = emailOffer;
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.ccv = ccv;
        this.gameName = gameName;
        this.seatType = seatType;
        
    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    * @modifiedBy: Joshua Cassidy, x15378586
    * @purpose: Constructor for storing information about Normal Seat Instances.
    */
    public Records(String fName,String lName, String ppsn, String age,String gender, int quantity, String email, String phoneNo, boolean phoneOffer, boolean emailOffer, String cardNumber, String month, String year, String ccv, String gameName, String seatType) {
        this.fName = fName;
        this.lName = lName;
        this.ppsn = ppsn;
        this.age = age;
        this.gender = gender;
        this.quantity = quantity;
        this.email = email;
        this.phoneNo = phoneNo;
        this.phoneOffer = phoneOffer;
        this.emailOffer = emailOffer;
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.ccv = ccv;
        this.gameName = gameName;
        this.seatType = seatType;

    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    * @modifiedBy: Joshua Cassidy, x15378586
    * @purpose: Constructor for storing information about Business Seat Instances.
    */
    public Records(String fName,String lName, String ppsn, String age,String gender, int quantity, String meal, String email, String phoneNo, boolean phoneOffer, boolean emailOffer, String cardNumber, String month, String year,  String ccv, String gameName, String seatType) {
        this.fName = fName;
        this.lName = lName;
        this.ppsn = ppsn;
        this.age = age;
        this.gender = gender;
        this.quantity = quantity;
        this.email = email;
        this.phoneNo = phoneNo;
        this.phoneOffer = phoneOffer;
        this.emailOffer = emailOffer;
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.ccv = ccv;
        this.gameName = gameName;
        this.seatType = seatType;

    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getPpsn() {
        return ppsn;
    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getfName() {
        return fName;
    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getlName() {
        return lName;
    }
    
    
    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public int getQuanity() {
        return quantity;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getEmail() {
        return email;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getAge() {
        return age;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getGender() {
        return gender;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getMeal() {
        return meal;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public boolean isPhoneOffer() {
        return phoneOffer;
    }
    
    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public boolean isEmailOffer() {
        return emailOffer;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getMonth() {
        return month;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getYear() {
        return year;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getCcv() {
        return ccv;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getGameName() {
        return gameName;
    }

    /**
    * @author Yotaphon Sutweha, x16309311
    */
    public String getSeatType() {
        return seatType;
    }
    
}
