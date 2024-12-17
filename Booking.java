package Bus.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passName;
    int busNo;
    Date date;

    Booking(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter name of the passenger: ");
        passName = scanner.next();

        System.out.println("Enter Bus no: ");
        busNo = scanner.nextInt();


        /*
         * if we put scanner class just like that for date then it
         * will accept it as string
         * So to convert it into itn we can't use the same "date"
         * variable too, that's why we are using a built-in method
         * in java SimpleDateFormat.
         */

        System.out.println("Enter date dd-mm-yyyy");
        String dateInput  = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus>buses){
        int capacity =0;
        for (Bus bus:buses){
            if(bus.getBusNo() == busNo)
                capacity=bus.getCapacity();

        }

        int booked =0;
        for (Booking b:bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;


            }
        }

        return booked<capacity?true:false;

    }


}
