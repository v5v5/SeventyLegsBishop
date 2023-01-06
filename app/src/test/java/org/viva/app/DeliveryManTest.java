package org.viva.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliveryManTest {
    @Test
    void deliveryTest() {
        Delivery delivery = new DeliveryMan();

        var random = (int)(Math.random() * 1_000_000);
        ProductInformation productInformation = new ProductInformation("product-" + random);

        var deliveryResult = delivery.deliver(productInformation);

//        assert deliveryResult.code == 100;
        Assertions.assertThat(deliveryResult.code).isEqualTo(100);
    }
}
