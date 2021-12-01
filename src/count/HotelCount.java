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

     double member = model.countHotel(model.getAdult(),model.getChildren());
     double summ = model.countSumm(member, model.getStars(), model.getNights());
     double discount = summ - (summ * 30 /100);
     String roundPayForHotel = Rounder.roundValue(summ);
     String roundDIscount = Rounder.roundValue(discount);

     String output = "--------------------\n"+
             "Ваше имя - " + name + "\n" +
             "Стоимость проживания за весь период - " + roundPayForHotel +
             "\nCтоимость проживания с учетом скидки - " + roundDIscount;


     view.getOutput(output);

    }

}
