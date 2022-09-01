package com.asherflo.billingSystem.data.repository;

import com.asherflo.billingSystem.data.model.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingDetailsRepository extends JpaRepository<BillingDetails,Long> {
}
