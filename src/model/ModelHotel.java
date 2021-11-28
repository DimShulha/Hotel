package model;

import base.CountHotel;

public class ModelHotel implements CountHotel {

    private String name;
    private double nights;
    private double stars;
    private int member;
    private final static double oneNight = 30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNights() {
        return nights;
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

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }


    @Override
    public double countHotel(double star, double member, double night) {

        return oneNight * star * member * night ;
    }
}
