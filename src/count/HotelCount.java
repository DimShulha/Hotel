package count;

import model.ModelHotel;
import view.ViewHotel;
import utils.Rounder;


public class HotelCount {

    ModelHotel model;
    ViewHotel view;

    public HotelCount(ModelHotel model, ViewHotel view){
        this.model = model;
        this.view = view;
    }

    public void runHotel(){
     view.getInput();;

     String name = model.getName();

     double payForHotel = model.countHotel(model.getMember(), model.getNights(), model.getStars());
     String roundPayForHotel = Rounder.roundValue(payForHotel);

     String output = "--------------------\n"+
             "Ваше имя - " + name + "\n" +
             "Стоимость проживания за весь период" + roundPayForHotel;

     view.getOutput(output);

    }

}
