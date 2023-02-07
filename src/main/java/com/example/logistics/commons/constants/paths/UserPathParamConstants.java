// Package declaration for the classes in the logistics project
package com.example.logistics.commons.constants.paths;

// Importing the AccessLevel private constant from Lombok
import static lombok.AccessLevel.PRIVATE;

// Importing the NoArgsConstructor from Lombok
import lombok.NoArgsConstructor;

// Marking the class with NoArgsConstructor and access level private
@NoArgsConstructor(access = PRIVATE)

// Final class that contains constant strings for user paths
public final class UserPathParamConstants {
    // Constant string for users path
    public static final String USERS = "users";

    // Constant string for register path
    public static final String REGISTER_PATH = "register";

    // Constant string for login path
    public static final String LOGIN_PATH = "login";
}
