public class Main {
    public static void main(String[] args) {
        DeliveryService delivery = new DeliveryService(-1, CargoSizeEnum.BIG, true, WorkloadEnum.NORMAL);
        delivery.calculateDeliveryPrice();
    }
}