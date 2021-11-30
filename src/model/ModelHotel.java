package model;

import base.CountHotel;

public class ModelHotel implements CountHotel {

    private String name;
    private double nights;
    private double stars;
    private int member;
    private final static double oneNight = 30;
    private final static int adult = 15;
    private int children;

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

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getAdult() {return adult;}

    public int getChildren() { return children; }

    public void setChildren(int children){ this.children = children; }

    @Override
    public double countHotel(double star, int adult, int children, double night) {

        return oneNight * star * adult * ( adult * 0.5 * children ) * night ;
    }
}
