package org.example.Lesson6.delivery.app;

import org.example.Lesson6.delivery.model.ExpressParcel;
import org.example.Lesson6.delivery.model.FragileParcel;
import org.example.Lesson6.delivery.model.Parcel;
import org.example.Lesson6.delivery.service.ParcelService;

public class Main {

    public static void main(String[] args) {
        Parcel parcelWithNoArgs = new Parcel();
        Parcel parcel = new Parcel("Роман", "Быхов", 5, "123");
        Parcel fragileParcel = new FragileParcel("Юлия", "Могилев", 3, "12989", true);
        Parcel expressParcel = new ExpressParcel("Петя", "Могилев", 1, "98876", 23);

        Parcel[] parcels = {parcelWithNoArgs, parcel, fragileParcel, expressParcel};

        ParcelService service = new ParcelService();
        service.printParcelsReport(parcels);
    }
}
