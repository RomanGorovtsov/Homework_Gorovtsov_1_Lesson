package org.example.Lesson6.delivery.model;

public class FragileParcel extends Parcel {

    private boolean requiresCarefulHandling;

    public FragileParcel() {
    }

    public FragileParcel(String recipientName, String deliveryAddress, double parcelWeight, String trackingNumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAddress, parcelWeight, trackingNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    @Override
    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
