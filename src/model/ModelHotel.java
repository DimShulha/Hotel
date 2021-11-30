package model;

import base.CountHotel;

public class ModelHotel implements CountHotel {

    private String name;
    private double nights;
    private double stars;
    private int member;
    private final static double payForAdult = 30;
    private double adult;
    private double children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNights() {
        return (int) nights;
    }

    public void setNights(double nights) {
        this.nights  = nights;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    /*public double getMember() {
        return member;
    }

    public void setMember(double member) {
        this.member = member;
    }*/

    public double getAdult() {return adult;}

    public void setAdult(double adult) { this.adult = adult; }

    public double getChildren() { return children; }

    public void setChildren(double children){ this.children = children; }



    @Override
    public double countHotel(double adult, double children) {
        return (adult * payForAdult) + (children * payForAdult * 0.5 );
    }

    @Override
    public double countSumm(double countHotel, double star, double night) {
        return countHotel * star * night;
    }
}
