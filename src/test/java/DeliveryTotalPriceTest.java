//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class DeliveryTotalPriceTest {
//
//    static DeliveryService deliveryOK1 = new DeliveryService(1, CargoSizeEnum.BIG, true, WorkloadEnum.CRITICAL);
//    static DeliveryService deliveryOK2 = new DeliveryService(2, CargoSizeEnum.SMALL, false, WorkloadEnum.VERY_HIGH);
//    static DeliveryService deliveryOK3 = new DeliveryService(0, CargoSizeEnum.BIG, true, WorkloadEnum.HIGH);
//    static DeliveryService deliveryOK4 = new DeliveryService(0,CargoSizeEnum.SMALL, false, WorkloadEnum.NORMAL);
//    static DeliveryService deliveryOK5 = new DeliveryService(3, CargoSizeEnum.SMALL, true, WorkloadEnum.NORMAL);
//    static DeliveryService deliveryOK6 = new DeliveryService(5, CargoSizeEnum.BIG, false, WorkloadEnum.CRITICAL);
//    static DeliveryService deliveryOK7 = new DeliveryService(7, CargoSizeEnum.SMALL, true, WorkloadEnum.VERY_HIGH);
//    static DeliveryService deliveryOK8 = new DeliveryService(9, CargoSizeEnum.BIG, false, WorkloadEnum.CRITICAL);
//    static DeliveryService deliveryOK9 = new DeliveryService(10, CargoSizeEnum.BIG,true, WorkloadEnum.VERY_HIGH);
//    static DeliveryService deliveryOK10 = new DeliveryService(15, CargoSizeEnum.SMALL, false, WorkloadEnum.NORMAL);
//    static DeliveryService deliveryOK11 = new DeliveryService(20, CargoSizeEnum.BIG, true, WorkloadEnum.CRITICAL);
//    static DeliveryService deliveryOK12 = new DeliveryService(29, CargoSizeEnum.SMALL,false,WorkloadEnum.HIGH);
//    DeliveryService deliveryOK13 = new DeliveryService(30, CargoSizeEnum.SMALL, true, WorkloadEnum.VERY_HIGH);
//    DeliveryService deliveryOK14 = new DeliveryService(35, CargoSizeEnum.BIG, false, WorkloadEnum.HIGH);
//    DeliveryService deliveryOK15 = new DeliveryService(50, CargoSizeEnum.BIG, false, WorkloadEnum.CRITICAL);
//    DeliveryService deliveryDistanceNegative = new DeliveryService(-1, CargoSizeEnum.BIG, false, WorkloadEnum.NORMAL);
//    DeliveryService deliveryBigDistanceFragile = new DeliveryService(100, CargoSizeEnum.SMALL, true, WorkloadEnum.HIGH);
//
//    static Stream<DeliveryService> deliverys() {
//        return Stream.of(deliveryOK1, deliveryOK2, deliveryOK3, deliveryOK4, deliveryOK5, deliveryOK6, deliveryOK7, deliveryOK8, deliveryOK9,
//                deliveryOK10, deliveryOK11, deliveryOK12);
//    }
//
//    @ParameterizedTest
//    @MethodSource("deliverys")
//    @Tag("Parameterized_Tests")
//    @DisplayName("Parameterized Tests")
//    void parameterizedTest(DeliveryService delivery) {
//        assertEquals("class java.lang.Double", delivery.calculateDeliveryPrice().getClass().toString());
//
//    }
//
//    @Test
//    @Tag("Positive")
//    @DisplayName("Positive 13")
//    void positive13() {
//        assertEquals(840, deliveryOK13.calculateDeliveryPrice());
//    }
//
//    @Test
//    @Tag("Positive")
//    @DisplayName("Positive 14")
//    void positive14() {
//        assertEquals(600, deliveryOK14.calculateDeliveryPrice());
//    }
//
//    @Test
//    @Tag("Positive")
//    @DisplayName("Positive 15")
//    void positive16() {
//        assertEquals(800, deliveryOK15.calculateDeliveryPrice());
//    }
//
//    @Test
//    @Tag("Negative")
//    @DisplayName("Negative distance")
//    void negativeDistanceTest() {
//        assertThrows(IllegalArgumentException.class,
//                ()->deliveryDistanceNegative.calculateDeliveryPrice());
//    }
//
//    @Test
//    @Tag("Negtive")
//    @DisplayName("Negative. Big distance + fragile")
//    void negativeBigdistanceFragile() {
//        assertThrows(UnsupportedOperationException.class,
//                ()->deliveryBigDistanceFragile.calculateDeliveryPrice());
//    }
//}
