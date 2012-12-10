package problem3;

public class Receipt {


    private final Taxi taxi;

    public Receipt(Taxi taxi) {
        this.taxi = taxi;
    }

    public double totalCost() {
        return taxi.getTotal();
    }


}