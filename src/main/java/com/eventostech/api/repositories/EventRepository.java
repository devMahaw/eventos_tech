package com.eventostech.api.repositories;

import com.eventostech.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author marcelo.dantas
 */

public interface EventRepository extends JpaRepository<Event, UUID> {
}
