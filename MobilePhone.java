package com.company;

public class MobilePhone implements Telephone{
    private String phoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dailingNumber(String Phone_number) {
        System.out.println("Now ringing number "+Phone_number+" on deskPhone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn)
        {
            System.out.println("Phone is ringing & waiting for answer");
            isRinging=false;
        }
        else
        {
            System.out.println("Phone is not ringing");
        }

    }

    @Override
    public boolean callPhone(String Phone_number) {
        if(Phone_number.equals(phoneNumber) && isPowerOn)
        {
            isRinging=true;
            System.out.println("Phone ringing "+Phone_number);
        }
        else
        {
            System.out.println("Neither wrong number or switch off");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
