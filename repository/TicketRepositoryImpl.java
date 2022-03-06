package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl implements TicketRepository{
    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public boolean createTiket(Ticket ticket) {
        if (ticket.getItineraryId() == null || ticket.getCustomerId()==null);
        return false;

        return true;
    }

}
