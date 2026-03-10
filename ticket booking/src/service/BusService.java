package service;




import java.util.*;
import java.util.stream.Collectors;
import model.Bus;
import exception.*;


public class BusService {


public void bookTicket(Map<Integer, Bus> buses, int busId, int seats)
throws InvalidBusException, InsufficientSeatsException {


Bus bus = buses.get(busId);
if (bus == null)
throw new InvalidBusException("Invalid Bus ID");


if (seats <= 0 || seats > bus.getAvailableSeats())
throw new InsufficientSeatsException("Insufficient seats available");


bus.setAvailableSeats(bus.getAvailableSeats() - seats);


System.out.println("\nBooking Successful!");
System.out.println("Bus Name : " + bus.getBusName());
System.out.println("Bus Type : " + bus.getBusType());
System.out.println("Seat Type : " + bus.getSeatType());
System.out.println("Seats Booked : " + seats);
System.out.println("Remaining Seats : " + bus.getAvailableSeats());
System.out.println("Total Cost : Rs." + (seats * bus.getPrice()));

System.out.println("Tickets booked");
System.out.println("Happy Journey");
}


// Stream API – filter buses by destination
public List<Bus> getBusesByDestination(Map<Integer, Bus> buses, String destination) {
return buses.values().stream()
.filter(b -> b.getDestination().equalsIgnoreCase(destination))
.collect(Collectors.toList());
}
}