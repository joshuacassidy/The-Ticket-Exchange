/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.exchange.app;

import java.io.Serializable;

/**
 *
 * @author Yo/Josh
 */
public class Records implements Serializable {
    private String fName;
    private String lName;
    private String uniqueID;
    private String age;
    private String gender;
    private String qty;
    private String email;
    private String phoneNo;
    private boolean meal;
    private boolean phoneOffer;
    private boolean emailOffer;
    private int recordId;
    private String cardNumber;
    private String month;
    private String year;
    private String ccv;
    
    public Records(String fName,String lName,String uniqueID, String age,String gender,String qty,String email,String phoneNo,boolean meal,boolean phoneOffer,boolean emailOffer, String cardNumber, String month, String year, String ccv) {
        this.fName = fName;
        this.lName = lName;
        this.uniqueID = uniqueID;
        this.age = age;
        this.gender = gender;
        this.qty = qty;
        this.email = email;
        this.phoneNo = phoneNo;
        this.meal = meal;
        this.phoneOffer = phoneOffer;
        this.emailOffer = emailOffer;
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.ccv = ccv;
    
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getQty() {
        return qty;
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

    public boolean isMeal() {
        return meal;
    }

    public boolean isPhoneOffer() {
        return phoneOffer;
    }

    public boolean isEmailOffer() {
        return emailOffer;
    }

    public int getRecordId() {
        return recordId;
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
    
    
    

    
    
    public void showDetails(){
//        System.out.println(fName);
//        System.out.println(lName);
//        System.out.println(uniqueID);
//        System.out.println(age);
//        System.out.println(gender);
//        System.out.println(qty);
//        System.out.println(email);
//        System.out.println(phoneNo);
//        System.out.println(meal);
//        System.out.println(phoneOffer);
//        System.out.println(emailOffer);
    }
}
