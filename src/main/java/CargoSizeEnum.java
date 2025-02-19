public enum CargoSizeEnum {
    BIG(200),
    SMALL(100);

    private int cargoSizePrice;

    CargoSizeEnum(int cargoSizePrice) {
        this.cargoSizePrice = cargoSizePrice;
    }

    public int getCargoSizePrice() {
        return cargoSizePrice;
    }
}
