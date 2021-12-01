package view;

import model.ModelHotel;
import utils.Validator;

import java.util.Scanner;

public class ViewHotel {

    ModelHotel model;
    String title;
    String name;
    double star;
    int pets;
    int night;
    Scanner scanner;
    int children;
    int adult;

    public ViewHotel(ModelHotel model){ this.model = model; }

    public void getInput(){

        scanner = new Scanner(System.in);

        title = "Введите имя - ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество ночей (максимум 10)- ";
        System.out.println(title);
        night = Validator.validateNightInput(scanner);
        model.setNights(night);

        title = "Введите количество взрослых - ";
        System.out.println(title);
        adult = Validator.validateQuantityInput(scanner);
        model.setAdult(adult);

        title = "Введите количество детей (до 14 лет) - ";
        System.out.println(title);
        children = Validator.validateQuantityInput(scanner);
        model.setChildren(children);

        title = "Введите количество животных - ";
        System.out.println(title);
        pets = Validator.validateQuantityInput(scanner);
        model.setPets(pets);

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
