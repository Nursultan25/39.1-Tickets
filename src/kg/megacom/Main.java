package kg.megacom;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Price compare");
        PriorityQueue<Ticket> tickets = new PriorityQueue<>(new priceComporator());

        tickets.add(new Ticket(145, false));
        tickets.add(new Ticket(280, false));
        tickets.add(new Ticket(130, false));
        tickets.add(new Ticket(145, false));
        tickets.add(new Ticket(280, false));
        tickets.add(new Ticket(800, true));
        tickets.add(new Ticket(650, true));

        while (!tickets.isEmpty()) {
            System.out.println(tickets.poll());
        }
        System.out.println("----------------------");
        System.out.println("Vip compare");

        PriorityQueue<Ticket> ticketIsVip = new PriorityQueue<>(new vipComporator());

        ticketIsVip.add(new Ticket(190, false));
        ticketIsVip.add(new Ticket(250, false));
        ticketIsVip.add(new Ticket(694, true));
        ticketIsVip.add(new Ticket(640, true));
        ticketIsVip.add(new Ticket(250, false));
        ticketIsVip.add(new Ticket(120, false));
        ticketIsVip.add(new Ticket(800, true));

        while (!ticketIsVip.isEmpty()) {
            System.out.println(ticketIsVip.poll());
        }
    }
}
