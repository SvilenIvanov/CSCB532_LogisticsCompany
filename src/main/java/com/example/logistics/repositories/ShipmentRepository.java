package com.example.logistics.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logistics.domain.entities.Shipment;

// This is the ShipmentRepository interface, which extends the JpaRepository interface
// The JpaRepository interface provides basic CRUD operations for entities in a database
// This interface is specifically for the Shipment entity, which has a Long type primary key

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    // This method finds all shipments with the given recipient
    List<Shipment> findAllByRecipient(String recipient);

    // This method finds all shipments with the given sender
    List<Shipment> findAllBySender(String sender);

    // This method finds all shipments with send dates between the given "from" and "to" dates
    List<Shipment> findBySendDateBetween(LocalDate from, LocalDate to);
}
