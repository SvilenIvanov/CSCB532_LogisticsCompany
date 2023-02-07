// Package declaration for this class
package com.example.logistics.commons.constants.paths;

// Import the PRIVATE access level from Lombok
import static lombok.AccessLevel.PRIVATE;

// Import the NoArgsConstructor annotation from Lombok
import lombok.NoArgsConstructor;

// Add a NoArgsConstructor annotation with access level set to PRIVATE
@NoArgsConstructor(access = PRIVATE)
public final class PathParamConstants {
    // Constant string representing the base path for the index endpoint
    public static final String INDEX_PATH = "/";
    // Constant string representing the base path for the home endpoint
    public static final String HOME_PATH = "/home";
    // Constant string representing the delete endpoint
    public static final String DELETE = "delete";

    // Constant string representing the home view name
    public static final String HOME = "home";
    // Constant string representing the index view name
    public static final String INDEX = "index";

    // Constant string representing the path parameter for id
    public static final String ID = "/{id}";
}

