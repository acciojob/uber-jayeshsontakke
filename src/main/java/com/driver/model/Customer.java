package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "customer")
public class Customer {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
private String mobile;
private String password;
@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
private List<TripBooking>tripBookingList;

    public Customer() {
    }

    public Customer(int customerId, String mobNo, String password, List<TripBooking> tripBookingList) {
        this.customerId = customerId;
        this.mobile = mobNo;
        this.password = password;
        this.tripBookingList = tripBookingList;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobNo(String mobNo) {
        this.mobile = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}
