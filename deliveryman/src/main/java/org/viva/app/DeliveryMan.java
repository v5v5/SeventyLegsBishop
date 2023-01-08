package org.viva.app;

public class DeliveryMan implements Delivery {

    private ReceiverGuy receiver;

    @Override
    public DeliveryResult deliver(ProductInformation product) {
        receiver.callback();
        return null;
    }
}
