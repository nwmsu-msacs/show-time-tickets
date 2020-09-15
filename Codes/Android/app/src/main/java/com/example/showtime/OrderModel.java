package com.example.showtime;

public class OrderModel {
    String imgReference;
    String bookingRef;
    String date;
    String movieName;
    String seats;
    String time;

    public OrderModel() {
    }

    public OrderModel(String imgReference, String bookingRef, String date, String movieName, String seats, String time) {
        this.imgReference = imgReference;
        this.bookingRef = bookingRef;
        this.date = date;
        this.movieName = movieName;
        this.seats = seats;
        this.time = time;
    }

    public String getImgReference() {
        return imgReference;
    }

    public void setImgReference(String imgReference) {
        this.imgReference = imgReference;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
