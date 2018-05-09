package com.company;

public class MobilePhone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up ");
    }

    @Override
    public void dial(String phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public MobilePhone(String myNumber) {/**/
        this.myNumber = myNumber;
    }

}
