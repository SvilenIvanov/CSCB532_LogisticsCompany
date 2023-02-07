// This is the Java code for the RoleConstants class that belongs to the com.example.logistics.commons.constants package.

package com.example.logistics.commons.constants;

// Import the static field PRIVATE from the lombok.AccessLevel class.
import static lombok.AccessLevel.PRIVATE;

// Import the NoArgsConstructor class from the lombok library.
import lombok.NoArgsConstructor;

// Annotation to generate a private constructor without arguments.
@NoArgsConstructor(access = PRIVATE)
public final class RoleConstants {
    // String constant for the role of a root user.
    public static final String ROLE_ROOT = "ROLE_ROOT";
    // String constant for the role of an employee.
    public static final String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
    // String constant for the role of a courier.
    public static final String ROLE_COURIER = "ROLE_COURIER";
    // String constant for the role of a regular user.
    public static final String ROLE_USER = "ROLE_USER";
    // String constant for the root role name.
    public static final String ROOT = "ROOT";
    // String constant for the employee role name.
    public static final String EMPLOYEE = "EMPLOYEE";
    // String constant for the courier role name.
    public static final String COURIER = "COURIER";
    // String constant for the regular user role name.
    public static final String USER = "USER";
}
