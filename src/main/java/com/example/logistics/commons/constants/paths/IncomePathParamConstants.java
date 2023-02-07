// Package declaration for this class
package com.example.logistics.commons.constants.paths;

// Import the PRIVATE access level from Lombok
import static lombok.AccessLevel.PRIVATE;

// Import the NoArgsConstructor annotation from Lombok
import lombok.NoArgsConstructor;

// Add a NoArgsConstructor annotation with access level set to PRIVATE
@NoArgsConstructor(access = PRIVATE)
public final class IncomePathParamConstants {
    // Constant string representing the base path for income API endpoints
    public static final String INCOME_PATH = "income";
    // Constant string representing the endpoint for retrieving income in a specified range
    public static final String IN_RANGE = "in-range";
}

