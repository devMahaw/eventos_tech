package com.eventostech.api.repositories;

import com.eventostech.api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author marcelo.dantas
 */

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
