package com.wecp.progressive.entity;

public class TicketBooking {
private int bookingId;
private String email;
private Match match;
private int numberOfTickets;
public TicketBooking(int bookingId, String email, Match match, int numberOfTickets) {
    this.bookingId = bookingId;
    this.email = email;
    this.match = match;
    this.numberOfTickets = numberOfTickets;
}
public TicketBooking() {
}
public int getBookingId() {
    return bookingId;
}
public void setBookingId(int bookingId) {
    this.bookingId = bookingId;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public Match getMatch() {
    return match;
}
public void setMatch(Match match) {
    this.match = match;
}
public int getNumberOfTickets() {
    return numberOfTickets;
}
public void setNumberOfTickets(int numberOfTickets) {
    this.numberOfTickets = numberOfTickets;
}

}