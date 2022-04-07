package com.company;

public class DeskPhone implements Telephone {
    private String my_number;
    private boolean isRinging;

    public DeskPhone(String my_number) {
        this.my_number = my_number;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk Phone is always powered");
    }

    @Override
    public void dailingNumber(String Phone_number) {
        System.out.println("Now ringing number "+Phone_number+" on deskPhone");
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Waiting for Answer");
            isRinging=false;
        }
        else
        {
            System.out.println("Phone is not ringing");
        }

    }

    @Override
    public boolean callPhone(String Phone_number) {
        if(Phone_number.equals(my_number))
        {
            isRinging=true;
            System.out.println("Phone ringing "+Phone_number);
        }
        else
        {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
