package com.company;

public class Main {
    /*
    The method is just defined in interface and they will not be elobrated in them itself
    method m1 and m2
    using implement keyword
    Abstract of the method

     */

    public static void main(String[] args) {
	// write your code here

//        DeskPhone my_phone=new DeskPhone("987654321");
//        my_phone.powerOn();
//        my_phone.callPhone("987654321");
//        my_phone.answer();
       MobilePhone my_phone=new MobilePhone("987654321");
      // my_phone.powerOn();
       my_phone.callPhone("987654321");
        my_phone.answer();


    }
}
