package ivyprograd.project.ordersrailway;

import javax.persistence.*;


import lombok.*;



@Entity(name="")
@Table(name="orders")
public class BookingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainid", nullable = false)
    private long trainid;
    private String source;
    private String destination;
    private int nooftickets;

    public BookingOrder() {
    }

    public BookingOrder(long trainid, String source, String destination, int nooftickets) {
        this.trainid = trainid;
        this.source = source;
        this.destination = destination;
        this.nooftickets = nooftickets;
    }

    public long getTrainid() {
        return trainid;
    }

    public void setTrainid(long trainid) {
        this.trainid = trainid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNooftickets() {
        return nooftickets;
    }

    public void setNooftickets(int nooftickets) {
        this.nooftickets = nooftickets;
    }

    @Override
    public String toString() {
        return "BookingOrder [id=" + trainid + ",  startStation=" + source + ", endStation="
                + destination + ", quantity=" + nooftickets +"]";
    }




}
