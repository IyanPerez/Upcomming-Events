package com.sala78.upcommingevents.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sala78.upcommingevents.models.Image;

public interface ImageRepository extends JpaRepository<Image, String> {
    Optional<Image> findByName(String name);
}
