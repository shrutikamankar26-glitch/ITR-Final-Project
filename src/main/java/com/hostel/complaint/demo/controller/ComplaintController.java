package com.hostel.complaint.demo.controller;

import com.hostel.complaint.demo.model.Complaint;
import com.hostel.complaint.demo.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "http://localhost:5173")
public class ComplaintController {

    @Autowired
    private ComplaintRepository repo;


    @GetMapping
    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }


    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {

        return repo.save(complaint);
    }
}