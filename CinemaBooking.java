lass CinemaBooking {
String customerName, movieName;
double ticketPrice;
int tickets;

CinemaBooking() {
customerName = "ARJUN";
movieName = "AVATAR";
ticketPrice = 200;
tickets = 2;
}

CinemaBooking(String customer, String movie, double price, int count) {
customerName = customer;
movieName = movie;
ticketPrice = price;
tickets = count;
}

void bookTickets(int count) {
tickets = count;
display();
}

void bookTickets(String customer, int count) {
customerName = customer;
tickets = count;
display();
}

void display() {
System.out.println("\n========== CINEMA TICKET BOOKING ==========");

System.out.println("Customer Name : " + customerName.toUpperCase());
System.out.println("Movie Name : " + movieName.toUpperCase());

if (tickets <= 0) {
System.out.println("Booking Status : Invalid number of tickets");
return;
}

double total = ticketPrice * tickets;
double discount = tickets >= 5 ? total * 0.10 : 0;
double finalAmount = total - discount;

System.out.println("Ticket Price : Rs. " +
String.format("%.2f", ticketPrice));
System.out.println("Number of Tickets: " + tickets);
System.out.println("Booking Status : Booking Successful");
System.out.println("Total Amount : Rs. " +
String.format("%.2f", total));
System.out.println("Discount : Rs. " +
String.format("%.2f", discount));
System.out.println("Final Amount : Rs. " +
String.format("%.2f", finalAmount));
}

public static void main(String[] args) {
CinemaBooking b1 =
new CinemaBooking("Sneha", "Avatar", 200, 5);
b1.display();

CinemaBooking b2 = new CinemaBooking();
b2.display();

if (b1.customerName.equalsIgnoreCase(b2.customerName))
System.out.println("Customer names are same.");
else
 System.out.println("Customer names are different.");
}
}