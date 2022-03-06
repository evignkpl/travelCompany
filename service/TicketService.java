package com.travelcompany.eshop.service;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor
@NoArgsConstructor
public class TicketService {
    private Customer customer;
    private Itinerary itinerary;
    private Ticket ticket;

    public TicketService(Customer customer, Itinerary itinerary, Ticket ticket ) {
        this.customer = customer;
        this.itinerary = itinerary;
        this.ticket = ticket;
    }


    public Ticket buyTicket() {

        int paymentAmount =  itinerary.getBasicPrice();
        double percentage = 0;

        if(customer.getCategory().equals("Business")){
            percentage += - 0.1;
        }
        if(customer.getCategory().equals("Individual")){
            percentage +=  0.2;
        }
        if(ticket.getPaymentMethod().equals("Credit Card")){
            percentage += - 0.1;
        }
        paymentAmount += paymentAmount * percentage;

        ticket.setPaymentAmount(paymentAmount);
        return ticket;

    }


}
