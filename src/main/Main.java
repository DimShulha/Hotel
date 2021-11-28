package main;
import count.HotelCount;
import model.ModelHotel;
import view.ViewHotel;

public class Main {
    public static void main(String[]args){

        ModelHotel model = new ModelHotel();
        ViewHotel view = new ViewHotel(model);
        HotelCount count = new HotelCount(model,view);

        count.runHotel();
    }
}
