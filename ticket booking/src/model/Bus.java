package model;




public class Bus {
private int busId;
private String busName;
private String destination;
private String busType; // Sleeper / Normal
private String seatType; // One / Two
private int availableSeats;
private double price;


public Bus(int busId, String busName, String destination,
String busType, String seatType, int availableSeats, double price) {
this.busId = busId;
this.busName = busName;
this.destination = destination;
this.busType = busType;
this.seatType = seatType;
this.availableSeats = availableSeats;
this.price = price;
}


public int getBusId() { return busId; }
public String getBusName() { return busName; }
public String getDestination() { return destination; }
public String getBusType() { return busType; }
public String getSeatType() { return seatType; }
public int getAvailableSeats() { return availableSeats; }
public double getPrice() { return price; }


public void setAvailableSeats(int seats) {
this.availableSeats = seats;
}


@Override
public String toString() {
return busId + " | " + busName + " | " + busType + " | " + seatType +
" | Seats: " + availableSeats + " | Rs." + price;
}
}

