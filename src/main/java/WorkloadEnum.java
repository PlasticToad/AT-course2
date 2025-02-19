public enum WorkloadEnum {
    NORMAL(1),
    HIGH(1.2),
    VERY_HIGH(1.4),
    CRITICAL(1.6);

    private double workloadPrice;

    WorkloadEnum(double workloadPrice) {
        this.workloadPrice = workloadPrice;
    }

    public double getWorkPrice() {
        return workloadPrice;
    }
}
