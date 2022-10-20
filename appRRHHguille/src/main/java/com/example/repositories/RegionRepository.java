package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
