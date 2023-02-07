package com.example.logistics.domain.entities;

import static java.time.LocalDate.now;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shipments")
public class Shipment {

    // Annotation to mark the field as the primary key
    @Id
    // Annotation to generate unique id value for each shipment object
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Annotation to specify the name of the column in the database
    @Column(name = "id")
    private long id;

    // Annotation to specify the name of the column in the database
    @Column(name = "sender", nullable = false)
    private String sender;

    // Annotation to specify the name of the column in the database
    @Column(name = "recipient", nullable = false)
    private String recipient;

    // Annotation to specify the name of the column in the database
    @Column(name = "address", nullable = false)
    private String address;

    // Annotation to ensure that the weight value must be minimum 1
    @Min(value = 1, message = "Minimum weight is 1")
    private int weight;

    // Annotation to ensure that the price value must be minimum 1
    @Min(value = 1, message = "Minimum price is 1")
    private double price;

    // Annotation to specify the name of the column in the database and make it unmodifiable after insertion
    @Column(name = "send_date", nullable = false, updatable = false)
    private LocalDate sendDate = now();

    // Constructor to initialize the shipment object with given values
    public Shipment(String sender, String recipient, String address, int weight, double price, LocalDate sendDate) {
        this.sender = sender;
        this.recipient = recipient;
        this.address = address;
        this.weight = weight;
        this.price = price;
        this.sendDate = sendDate;
    }
}

