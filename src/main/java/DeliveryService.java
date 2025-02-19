import io.qameta.allure.Step;

import java.text.DecimalFormat;

public class DeliveryService {
    public static final double MIN_DELIVERY_PRICE = 400;

    public final int deliveryDistance;
    public final CargoSizeEnum cargoSize;
    public final boolean isFragile;
    public final WorkloadEnum workload;

    public DeliveryService(int deliveryDistance, CargoSizeEnum cargoSize, boolean isFragile, WorkloadEnum workload) {
        this.deliveryDistance = deliveryDistance;
        this.cargoSize = cargoSize;
        this.isFragile = isFragile;
        this.workload = workload;
    }

    private int getDeliveryDistancePrice(int deliveryDistance) {
        if (deliveryDistance > 30) {
            return 300;
        }
        if (deliveryDistance > 10) {
            return 200;
        }
        if (deliveryDistance >= 0) {
            return 50;
        }
        System.out.println("Destination distance should be a positive number!");
        throw new IllegalArgumentException("Destination distance should be a positive number!");
    }

    private int getFragilePrice(boolean isFragile) {
        if (isFragile) {
            return 300;
        } else {
            return 0;
        }
    }

    public Double calculateDeliveryPrice() {
        System.out.println("\n" + "Delivery details:" + "\n" +
                "Delivery distance - " + deliveryDistance + "\n" +
                "Cargo size - " + cargoSize + "\n" +
                "Fragile - " + isFragile + "\n" +
                "Workload - " + workload);
        if (isFragile && deliveryDistance > 30) {
            System.out.println("Fragile cargo cannot be delivered for the distance more than 30");
            throw new UnsupportedOperationException("Fragile cargo cannot be delivered for the distance more than 30");
        }
        double totalPrice = (getDeliveryDistancePrice(this.deliveryDistance) + getFragilePrice(this.isFragile) + this.cargoSize.getCargoSizePrice()) * this.workload.getWorkPrice();
        if (totalPrice < 400) {
            System.out.println("Total price: " + MIN_DELIVERY_PRICE);
            return MIN_DELIVERY_PRICE;
        } else {
            DecimalFormat format = new DecimalFormat("###");
            System.out.println("Total price: " + Double.parseDouble(format.format(totalPrice)));
            return Double.parseDouble(format.format(totalPrice));
        }
    }
}
