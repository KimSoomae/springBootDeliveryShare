package com.graphql.deliveryShare2.sample.AboutUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {
    ReportEntity findBySeq(int seq);
}