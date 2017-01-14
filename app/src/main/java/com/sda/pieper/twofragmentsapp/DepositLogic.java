package com.sda.pieper.twofragmentsapp;



public class DepositLogic {

    public int calc(int amount, int percent, int years) {

        return (int) (amount*Math.pow(1+percent/100.0,years));
    }
}
