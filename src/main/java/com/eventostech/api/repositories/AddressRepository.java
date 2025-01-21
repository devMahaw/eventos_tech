package com.eventostech.api.repositories;

import com.eventostech.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author marcelo.dantas
 */

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
