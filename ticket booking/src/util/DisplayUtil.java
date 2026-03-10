package util;



import java.util.*;
import model.Bus;


public class DisplayUtil {


public static void showDestinations() {
System.out.println("-------- Available Destinations --------");
System.out.println("1. Chennai → Bangalore");
System.out.println("2. Chennai → Coimbatore");
System.out.println("3. Chennai → Madurai");
System.out.println("4. Banglore → Chennai");
System.out.println("5. Coimbatore → Chennai");
System.out.println("6. Chennai → Hyderabad");
}


public static void showBuses(List<Bus> buses) {
System.out.println("\nBus ID | Bus Name | Bus Type | Seat Type | Seats | Cost");
System.out.println("-------------------------------------------------------");
buses.forEach(System.out::println);
}
}