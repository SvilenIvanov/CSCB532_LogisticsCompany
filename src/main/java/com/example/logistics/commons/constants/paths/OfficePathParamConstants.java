// Package declaration for this class
package com.example.logistics.commons.constants.paths;

// Import the PRIVATE access level from Lombok
import static lombok.AccessLevel.PRIVATE;

// Import the NoArgsConstructor annotation from Lombok
import lombok.NoArgsConstructor;

// Add a NoArgsConstructor annotation with access level set to PRIVATE
@NoArgsConstructor(access = PRIVATE)
public final class OfficePathParamConstants {
    // Constant string representing the base path for office API endpoints
    public static final String OFFICES = "offices";
    // Constant string representing the endpoint for retrieving information about an office manager
    public static final String MANAGER = "manager";
}
