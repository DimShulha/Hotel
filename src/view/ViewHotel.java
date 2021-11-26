package view;

import model.ModelHotel;
import utils.Validator;

import java.util.Scanner;

public class ViewHotel {

    ModelHotel model;
    String title;
    String name;
    int star;
    int member;
    int night;
    Scanner scanner;

    public ViewHotel(ModelHotel model){ this.model = model; }

    public void getInput(){

        scanner = new Scanner(System.in);

        title = "Введите имя - ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName();

        title = "Введите количество ночей - ";
        System.out.println(title);
        night = Validator.validateQuantityInput(scanner);
        model.setNights();

        title = "Введите количество проживающих";
        System.out.println(title);
        member = Validator.validatesInput(scanner);
        model.setMember();

        title = "Введите количество звезд - ";
        System.out.println(title);
        star = Validator.validatesInput(scanner);
        model.setStars();




    }


}
