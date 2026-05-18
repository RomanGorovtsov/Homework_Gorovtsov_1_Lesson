package org.example.Lesson6.delivery.model;

public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel() {
    }

    public ExpressParcel(String recipientName, String deliveryAddress, double parcelWeight, String trackingNumber, int deliveryHours) {
        super(recipientName, deliveryAddress, parcelWeight, trackingNumber);
        this.deliveryHours = deliveryHours;
    }

    @Override
    public double calculateDeliveryPrice() {
        return (deliveryHours < 24) ? super.calculateDeliveryPrice() + 500 : super.calculateDeliveryPrice();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours);
    }
}


