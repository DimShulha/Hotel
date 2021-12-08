package reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exeption.ReservExeption;
import model.ReservModel;

public class Reserv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            System.out.print("Номер комнаты: ");
            int roomNumber = sc.nextInt();
            System.out.print("Дата заезда (dd.MM.yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Дата выезда (dd.MM.yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            ReservModel reservation = new ReservModel(roomNumber, checkIn, checkOut);
            System.out.println("Бронирование: " + reservation);

            System.out.println("\nВведите данные для обновления бронирования:");
            System.out.print("Дата заезда (dd.MM.yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Дата выезда (dd.MM.yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Бронирование: " + reservation);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        } catch (ReservExeption e) {
            System.out.println("Ошибка при бронировании: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Oшибка");
        }
        sc.close();
    }
}
