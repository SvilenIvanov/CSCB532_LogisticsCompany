// This is the Java code for the Mapper class that belongs to the com.example.logistics.commons.utils package.

package com.example.logistics.commons.utils;

// Import the toUnmodifiableList collector from the java.util.stream package.
import static java.util.stream.Collectors.toUnmodifiableList;

// Import the List interface from the java.util package.
import java.util.List;

// Import the ModelMapper class from the org.modelmapper package.
import org.modelmapper.ModelMapper;

// A class that maps one object to another using the ModelMapper.
public class Mapper {
    // An instance of the ModelMapper.
    private final ModelMapper modelMapper;

    // Constructor that takes a ModelMapper instance.
    public Mapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // Maps a collection of objects to a list of result objects.
    public <R> List<R> mapCollection(List<?> collection, Class<R> resultClass) {
        // Map each item in the collection to a result object.
        return collection.stream()
                .map(item -> modelMapper.map(item, resultClass))
                .collect(toUnmodifiableList());
    }
}