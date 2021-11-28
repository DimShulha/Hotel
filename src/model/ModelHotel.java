package model;

import base.CountHotel;

public class ModelHotel implements CountHotel {

    private String name;
    private int nights;
    private int stars;
    private int member;
    private final static double oneNight = 30;

    public String getName() { return name; }

    public void setName() { this.name = name; }

    public int getNights() { return nights; }

    public void setNights() { this.nights  = nights; }

    public int getStars() { return stars; }

    public void setStars() { this.stars = stars; }

    public int getMember() { return member; }

    public void setMember() {this.member = member; }


    @Override
    public double countHotel(double star, double member, double night) {

        return oneNight * stars * nights * member;
    }
}
