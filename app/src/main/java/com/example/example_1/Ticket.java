package com.example.example_1;
import java.io.Serializable;

public class Ticket implements Serializable {
    private int id;
    private String pointDeparture,departureTime, pointArrival, arrivalTime2;
    private Float costTicket;

    public Ticket(int id, String arDeparture, String arTime, String arArrival, String arTime2, Float costTicket) {
        this.id = id;
        this.pointDeparture = arDeparture;
        this.departureTime = arTime;
        this.pointArrival = arArrival;
        this.arrivalTime2 = arTime2;
        this.costTicket = costTicket;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPointDeparture() {
        return pointDeparture;
    }
    public void setPointDeparture(String pointDeparture) {
        this.pointDeparture = pointDeparture;
    }
    public String getArTime() {
        return departureTime;
    }
    public void setArTime(String arTime) {
        this.departureTime = arTime;
    }
    public String getArArrival() {
        return pointArrival;
    }
    public void setArArrival(String arArrival) {
        this.pointArrival = arArrival;
    }
    public String getArrivalTime2() {
        return arrivalTime2;
    }
    public void setArrivalTime2(String arrivalTime2) {
        this.arrivalTime2 = arrivalTime2;
    }
    public Float getCostTicket() {
        return costTicket;
    }
    public void setCostTicket(Float costTicket) {
        this.costTicket = costTicket;
    }
    @Override
    public String toString() {
        return "Ticket" +
                "id=" + id +
                ", arDeparture='" + pointDeparture + '\'' +
                ", arTime='" + departureTime + '\'' +
                ", arArrival='" + pointArrival + '\'' +
                ", arTime2='" + arrivalTime2 + '\'' +
                ", costTicket=" + costTicket +
                '}';
    }
}
