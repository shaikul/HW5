package com.company;

public class Heros {
    private String name;
    private int helth;
    private int damage;
    private int superPower;

    public Heros(String name, int helth, int damage, int superPower) {
        this.name = name;
        this.helth = helth;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Heros(int helth, int damage) {
        this.helth = helth;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperPower() {
        return superPower;
    }

    public void setSuperPower(int superPower) {
        this.superPower = superPower;
    }
}
