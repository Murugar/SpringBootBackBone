package com.iqmsoft.boot.backbone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.iqmsoft.boot.backbone.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}