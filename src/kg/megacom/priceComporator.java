package kg.megacom;

import java.util.Comparator;

public class priceComporator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o2.getCost() - o1.getCost();
    }
}
