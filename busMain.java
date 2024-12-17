package Bus.Reservation;
import java.util.Scanner;
import java.util.ArrayList;

public class busMain {
    public static void main(String[] args) {

        //ArrayList - collection
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,5));
        buses.add(new Bus(3,true,4));


        int userOpt=1;
        Scanner scanner = new Scanner(System.in);

        for (Bus b:buses){
            b.dispplayBusInfo();
        }

        while(userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOpt=scanner.nextInt();
            if (userOpt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Sorry, The bus is full. Try another bus or date.");

                }

            }
        }

    }
}
