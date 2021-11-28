package view;

import model.ModelHotel;
import utils.Validator;

import java.util.Scanner;

public class ViewHotel {

    ModelHotel model;
    String title;
    String name;
    double star;
    int member;
    int night;
    Scanner scanner;

    public ViewHotel(ModelHotel model){ this.model = model; }

    public void getInput(){

        scanner = new Scanner(System.in);

        title = "Введите имя - ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество ночей - ";
        System.out.println(title);
        night = Validator.validateQuantityInput(scanner);
        model.setNights(night);

        title = "Введите количество проживающих - ";
        System.out.println(title);
        member = Validator.validateQuantityInput(scanner);
        model.setMember(member);

        title = "Введите количество звезд (1,1 - 1 звезда, 1,2 - 2 звезды," +
                " 1,3 - 3 звезды, 1,4 - 4 звезды, 1,5 - 5 звезд - )";
        System.out.println(title);
        star = Validator.validatesInput(scanner);
        model.setStars(star);

        scanner.close();
    }

    public void getOutput(String output){

        System.out.println(output);
    }

}
