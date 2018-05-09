package com.company;

public class DeskPhone implements Telephone {

    private String myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button ");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone.");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public DeskPhone(String myNumber) {/**/
        this.myNumber = myNumber;
    }

}
