// Package declaration for the classes in the logistics project
package com.example.logistics.commons.constants.paths;

// Importing the AccessLevel private constant from Lombok
import static lombok.AccessLevel.PRIVATE;

// Importing the NoArgsConstructor from Lombok
import lombok.NoArgsConstructor;

// Marking the class with NoArgsConstructor and access level private
@NoArgsConstructor(access = PRIVATE)

// Final class that contains constant strings for shipment paths
public final class ShipmentPathParamConstants {
    // Constant string for shipments path
    public static final String SHIPMENTS = "shipments";

    // Constant string for my shipments path
    public static final String MY_SHIPMENTS = "my-shipments";

    // Constant string for create shipment path
    public static final String CREATE_SHIPMENT = "send-shipment";

    // Constant string for edit shipment path
    public static final String EDIT_SHIPMENT = "edit-shipment";
}

