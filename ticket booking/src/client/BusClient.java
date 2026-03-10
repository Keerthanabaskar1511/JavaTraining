package client;


import java.util.*;
import model.Bus;
import service.BusService;
import util.DisplayUtil;


public class BusClient {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
Map<Integer, Bus> buses = new HashMap<>();
BusService service = new BusService();

System.out.println("Welcome to bus Service");
System.out.println("Have a nice day");

buses.put(1, new Bus(1, "KPN", "Bangalore", "Sleeper", "One", 30, 1200));
buses.put(2, new Bus(2, "SRM", "Chennai", "Normal", "Two", 40, 500));
buses.put(3, new Bus(3, "SETC", "Madurai", "Normal", "Two", 50, 1000));
buses.put(4, new Bus(4, "DT", "Hyderabad", "Sleeper", "Two", 50, 1000));
buses.put(4, new Bus(5, "GM", "Coimbatore", "Normal", "Two", 50, 900));



DisplayUtil.showDestinations();


System.out.print("\nEnter destination name: ");
String destination = sc.nextLine();




List<Bus> availableBuses = service.getBusesByDestination(buses, destination);


if (availableBuses.isEmpty()) {
System.out.println("No buses available for this destination");
return;
}


DisplayUtil.showBuses(availableBuses);


try {
System.out.print("\nEnter Bus ID: ");
int busId = sc.nextInt();


System.out.print("Enter number of seats: ");
int seats = sc.nextInt();


service.bookTicket(buses, busId, seats);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}


sc.close();
}
}