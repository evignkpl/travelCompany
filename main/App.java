package com.travelcompany.eshop.main;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.service.TicketService;

import java.util.ArrayList;

public class App {

    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    private static ArrayList<Itinerary>  itineraries = new ArrayList<Itinerary>();
    private static ArrayList<Ticket> tickets = new ArrayList<Ticket>();


    public static void main(String[] args) {
        Customer maria = new Customer(1, "Maria Iordanou","miordanou@mail.com", "Athens", "Greek", "Individual");
        customers.add(maria);
        Customer dimitrios = new Customer(2, "Dimitrios Dimitriou","ddimitriou@mail.com", "Athens", "Greek", "Individual");
        customers.add(dimitrios);
        Customer ioannis = new Customer(3, "Ioannis Ioannou","iioanou@mail.com", "Athens", "Greek", "Business");
        customers.add(ioannis);
        Customer antonio = new Customer(4, "Antonio Molinari","amolinari@mail.com", "Milan", "Italian", "Individual");
        customers.add(antonio);
        Customer federico = new Customer(5, "Federico Rossi","frossi@mail.com", "Milan", "Italian", "Individual");
        customers.add(federico);
        Customer mario = new Customer(6, "Mario Conti","mconti@mail.com", "Rome", "Italian", "Business");
        customers.add(mario);
        Customer nathan = new Customer(7, "Nathan Martin","nmartin@mail.com", "Lyon", "French", "Business");
        customers.add(nathan);
        Customer enzo = new Customer(8, "Enzo Collin","ecollin@mail.com", "Lyon", "French", "Individual");
        customers.add(enzo);
        Customer frederic = new Customer(9, "Frederic Michel","fmichel@mail.com", "Athens", "French", "Individual");
        customers.add(frederic);


        Itinerary athToPar = new Itinerary(1, "ATH", "PAR", "2022-02-22 13:35:00", "SkyLines", 300);
        itineraries.add(athToPar);
        Itinerary athToLon = new Itinerary(2, "ATH", "LON", "2022-02-22 13:40:00", "SkyLines", 420);
        itineraries.add(athToLon);
        Itinerary athToAms = new Itinerary(3, "ATH", "AMS", "2022-02-22 13:45:00", "SkyLines", 280);
        itineraries.add(athToAms);
        Itinerary athToPar2 = new Itinerary(4, "ATH", "PAR", "2022-02-22 14:20:00", "SkyLines", 310);
        itineraries.add(athToPar2);
        Itinerary athToDub = new Itinerary(5, "ATH", "DUB", "2022-02-22 14:35:00", "SkyLines", 880);
        itineraries.add(athToDub);
        Itinerary athToFra = new Itinerary(6, "ATH", "FRA", "2022-02-22 14:55:00", "SkyLines", 380);
        itineraries.add(athToFra);
        Itinerary athToFra2 = new Itinerary(7, "ATH", "FRA", "2022-02-22 15:35:00", "SkyLines", 350);
        itineraries.add(athToFra2);
        Itinerary athToMex = new Itinerary(8, "ATH", "MEX", "2022-02-22 16:00:00", "SkyLines", 1020);
        itineraries.add(athToMex);
        Itinerary athToDub2 = new Itinerary(9, "ATH", "DUB", "2022-02-22 16:35:00", "SkyLines", 770);
        itineraries.add(athToDub2);

        Ticket ticket1 = new Ticket(1, 1, 2, "Cash", 0);
        tickets.add(ticket1);
        Ticket ticket2 = new Ticket(2, 2, 3, "Cash", 0);
        tickets.add(ticket2);
        Ticket ticket3 = new Ticket(3, 3, 3, "Credit Card", 0);
        tickets.add(ticket3);
        Ticket ticket4 = new Ticket(4, 2, 4, "Credit Card", 0);
        tickets.add(ticket4);
        Ticket ticket5 = new Ticket(5, 3, 4, "Cash", 0);
        tickets.add(ticket5);
        Ticket ticket6 = new Ticket(6, 4, 7, "Credit Card", 0);
        tickets.add(ticket6);
        Ticket ticket7 = new Ticket(7, 5, 7, "Credit Card", 0);
        tickets.add(ticket7);
        Ticket ticket8 = new Ticket(8, 2, 10, "Cash", 0);
        tickets.add(ticket8);
        Ticket ticket9 = new Ticket(9, 1, 3, "Cash", 0);
        tickets.add(ticket9);

        TicketService service = new TicketService(maria, athToAms, ticket9);
        service.buyTicket();

        System.out.println("The payment amount is " + ticket9.getPaymentAmount());





    }



}
