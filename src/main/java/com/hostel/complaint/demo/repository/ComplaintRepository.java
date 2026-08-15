package com.hostel.complaint.demo.repository;

import com.hostel.complaint.demo.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
