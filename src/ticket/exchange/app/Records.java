/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/**
 *
 * @author Yo
 */
public class Records implements Serializable {
    private String fName,lName,ppsn,gender,age,email,phoneNo,meal,cardNumber,month,year,ccv, gameName, seatType;
    private boolean phoneOffer;
    private boolean emailOffer;
    private int quantity;
    
    // Constructor for Premium
    public Records(String fName,String lName, String ppsn, String age,String gender, int quantity, String meal, String carPark, String email, String phoneNo, boolean phoneOffer, boolean emailOffer, String cardNumber, String month, String year, 
            String ccv, String gameName, String seatType
    ) {
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
    
    // Constructor for Premium
    public Records(
            String fName,String lName,
            String ppsn, String age,String gender,
            int quantity, String email, String phoneNo,
            boolean phoneOffer, boolean emailOffer, 
            String cardNumber, String month, String year, 
            String ccv, String gameName, String seatType
    ) {
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
    
    // Constructor for Premium
    public Records(
            String fName,String lName,
            String ppsn, String age,String gender,
            int quantity, String meal, String email, String phoneNo,
            boolean phoneOffer, boolean emailOffer, 
            String cardNumber, String month, String year, 
            String ccv, String gameName, String seatType
    ) {
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
    
    public String getPpsn() {
        return ppsn;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getQuanity() {
        return quantity;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getMeal() {
        return meal;
    }

    public boolean isPhoneOffer() {
        return phoneOffer;
    }

    public boolean isEmailOffer() {
        return emailOffer;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getCcv() {
        return ccv;
    }

    public String getGameName() {
        return gameName;
    }

    public String getSeatType() {
        return seatType;
    }
    
}
