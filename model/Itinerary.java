package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


//@Data
@AllArgsConstructor
@NoArgsConstructor
public class Itinerary {
    private int itineraryId;
    private String depAirCode;
    private String desAirCode;
    private Date depDate;
    private String airline;
    private int basicPrice;

    public Itinerary(int itineraryId, String ath, String par, String s, String skyLines, int basicPrice) {
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getDepAirCode() {
        return depAirCode;
    }

    public void setDepAirCode(String depAirCode) {
        this.depAirCode = depAirCode;
    }

    public String getDesAirCode() {
        return desAirCode;
    }

    public void setDesAirCode(String desAirCode) {
        this.desAirCode = desAirCode;
    }

    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }
}
