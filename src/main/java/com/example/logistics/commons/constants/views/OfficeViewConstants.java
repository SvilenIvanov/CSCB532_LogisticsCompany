// Package declaration
package com.example.logistics.commons.constants.views;

// Import statement for Lombok library
import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

// Annotation to generate a private no-arg constructor
@NoArgsConstructor(access = PRIVATE)
public final class OfficeViewConstants {

    // Constant for the name of the add office view
    public static final String ADD_OFFICE = "add_office";

    // Constant for the name of the view displaying all offices
    public static final String ALL_OFFICES = "all_offices";

    // Constant for the name of the office view model
    public static final String OFFICE_VIEW_MODEL = "office";

    // Constant for the name of the list of office view models
    public static final String OFFICE_LIST_VIEW_MODELS = "officeListViewModels";
}
