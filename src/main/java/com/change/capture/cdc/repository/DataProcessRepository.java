package com.change.capture.cdc.repository;


import com.change.capture.cdc.data.ProcessTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataProcessRepository extends JpaRepository<ProcessTable, Integer> {
}
