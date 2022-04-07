package com.company;

public interface Telephone {
    //power on
    // dailing number
    // answer phone call
    //call to other phone
    // is ringing or not

    void powerOn();
    void dailingNumber(String Phone_number);
    void answer();
    boolean callPhone(String Phone_number);
    boolean isRinging();


}
