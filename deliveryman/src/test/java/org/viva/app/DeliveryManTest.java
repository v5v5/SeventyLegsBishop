package org.viva.app;

import org.junit.jupiter.api.Test;

public class DeliveryManTest {
    @Test
    void deliveryTest() {
        // prepare a test object
        Delivery delivery = new DeliveryMan();

        // prepare a test data
        var random = (int) (Math.random() * 1_000_000);
        var productInformation = new ProductInformation("product-" + random);

        // call a test method
        var deliveryResult = delivery.deliver(productInformation);

        // test a result
        assert deliveryResult.code() == 100;
    }
}
