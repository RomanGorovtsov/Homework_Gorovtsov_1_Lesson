package org.example.Lesson6.delivery.model;

public class Parcel {

    private String recipientName;
    private String deliveryAddress;
    protected double parcelWeight;
    String trackingNumber;

    public Parcel() {
    }

    public Parcel(String recipientName, String deliveryAddress, double parcelWeight, String trackingNumber) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.parcelWeight = parcelWeight;
        this.trackingNumber = trackingNumber;
    }

    public double calculateDeliveryPrice() {
        return 100 + parcelWeight * 30;
    }

    public void printInfo() {
        System.out.printf("Получатель: %s | Адрес: %s | Вес: %.3f кг | Трек: %s%n",
                recipientName, deliveryAddress, parcelWeight, trackingNumber);
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }
}
