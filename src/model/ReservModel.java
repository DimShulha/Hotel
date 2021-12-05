package model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exeption.ReservExeption;

public class ReservModel {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservModel(Integer roomNumber, Date checkIn, Date checkOut) {

        if (!checkOut.after(checkIn)) {
            throw new ReservExeption("Дата выезда должна быть позже даты заезда.");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new ReservExeption("Даты бронирования для обновления " +
                    "должны быть датами в будущем.");
        }
        if (!checkOut.after(checkIn)) {
            throw new ReservExeption("Дата выезда должна быть позже даты заезда.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Комната "
                + roomNumber
                + ", заезд: "
                + sdf.format(checkIn)
                + ", выезд: "
                + sdf.format(checkOut)
                + " , "
                + duration()
                + " ночей";
    }
}
