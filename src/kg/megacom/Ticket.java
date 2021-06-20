package kg.megacom;

public class Ticket {
    private int cost;
    private boolean isVip;

    public Ticket() {
    }

    public Ticket(int cost, boolean isVip) {
        this.cost = cost;
        this.isVip = isVip;
    }

    public int getCost() {
        return cost;
    }

    public boolean getVip() {
        return isVip;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "price: " + getCost() + ", isVip: " + getVip();
    }
}
