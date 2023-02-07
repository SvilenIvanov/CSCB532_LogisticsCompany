// Package declaration
package com.example.logistics.commons.constants.views;

// Import statement for Lombok library
import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

// Annotation to generate a private no-arg constructor
@NoArgsConstructor(access = PRIVATE)
public final class IncomeViewConstants {

    // Constant for the name of the income model or view
    public static final String INCOME = "income";

    // Constant for the name of the view model used in the view
    public static final String INCOME_VIEW_MODEL = "incomeViewModel";
}

/* This code is a Java class that defines constants related to the "Income" view in a logistics application.
The class is part of the "com.example.logistics.commons.constants.views" package.
The code uses the Lombok library to provide some boilerplate code, such as the generation of a private no-argument constructor.
The class contains two public static final fields, "INCOME" and "INCOME_VIEW_MODEL".
These fields are used to define string constants for use in the Income view. The fields likely correspond to the name of an income model class or the name of a view model used in the view.
The purpose of this class is to centralize and standardize the names of these constants, which can then be referenced from other parts of the application.
This makes it easier to maintain consistency across the codebase and makes it easier to make changes if needed in the future.*/