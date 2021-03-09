package com.company;

public class Main {

    public static void main(String[] args) {
        Boss big = new Boss();
        big.setDamageBoss(50);
        big.setHelthBoss(800);
        big.setProtectionBoss(30);
        System.out.println(big.getHelthBoss()+ "  "+ big.getDamageBoss()+"  "+ big.getProtectionBoss() );

    }
}
