// Package declaration
package com.example.logistics.commons.constants.views;

// Import statement for Lombok library
import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

// Annotation to generate a private no-arg constructor
@NoArgsConstructor(access = PRIVATE)
public final class ShipmentViewConstants {

    // Constant for the name of the view displaying all shipments
    public static final String ALL_SHIPMENTS = "all_shipments";

    // Constant for the name of the view displaying only shipments belonging to the user
    public static final String MY_SHIPMENTS = "my_shipments";

    // Constant for the name of the view for creating shipments
    public static final String CREATE_SHIPMENT = "add_shipment";

    // Constant for the name of the view for editing shipments
    public static final String EDIT_SHIPMENT = "edit_shipment";

    // Constant for the name of the list of shipment view models
    public static final String SHIPMENT_VIEW_MODELS = "shipmentViewModels";

    // Constant for the name of the list of received shipment view models
    public static final String RECEIVED_SHIPMENT_VIEW_MODELS = "receivedShipmentViewModels";

    // Constant for the name of the list of sent shipment view models
    public static final String SENT_SHIPMENT_VIEW_MODELS = "sentShipmentViewModels";
}
