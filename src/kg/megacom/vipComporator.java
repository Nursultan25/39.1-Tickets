package kg.megacom;

import java.util.Comparator;

public class vipComporator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.getVip() && !o2.getVip()) {
            return -1;
        } else if (o2.getVip() && !o1.getVip()) {
            return 1;
        }

        return 0;
    }
}
