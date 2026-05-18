package org.example.Lesson6.delivery.service;

import org.example.Lesson6.delivery.model.Parcel;

public class ParcelService {

    public void printParcelsReport(Parcel[] parcels){
        for(Parcel parcel: parcels){
            parcel.printInfo();
            System.out.println(parcel.calculateDeliveryPrice());
            System.out.println();
        }
    }
}
