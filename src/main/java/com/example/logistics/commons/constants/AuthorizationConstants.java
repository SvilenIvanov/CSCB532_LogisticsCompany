// This is the Java code for the AuthorizationConstants class that belongs to the com.example.logistics.commons.constants package.

package com.example.logistics.commons.constants;

// Import the static field PRIVATE from the lombok.AccessLevel class.
import static lombok.AccessLevel.PRIVATE;

// Import the NoArgsConstructor class from the lombok library.
import lombok.NoArgsConstructor;

// Annotation to generate a private constructor without arguments.
@NoArgsConstructor(access = PRIVATE)
public final class AuthorizationConstants {
    // String constant for anonymous access.
    public static final String IS_ANONYMOUS = "isAnonymous()";
    // String constant for authenticated access.
    public static final String IS_AUTHENTICATED = "isAuthenticated()";

    // Error message for when a user cannot be found by name.
    public static final String UNABLE_TO_FIND_USER_BY_NAME_MESSAGE = "Unable to find user by name.";
    // Error message for when an office cannot be found by id.
    public static final String UNABLE_TO_FIND_OFFICE_BY_ID_MESSAGE = "Unable to find office by id.";
}
