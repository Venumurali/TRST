package io.github.jiangdequan;

public class Seat {
    Boolean booked;

    public Seat() {
        this.booked = false;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Seat [booked=" + booked + "]";
    }
    
    
}