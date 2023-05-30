public enum Payments {//платеж
    COMSERVICE(50),
    SERVICE_TAXI(30),
    MOBILECOMMUNICATION(20);

    private double amount;

    Payments(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
