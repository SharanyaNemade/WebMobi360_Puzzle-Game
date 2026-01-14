package com.ay.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ay.Entity.ImageData;

public interface Imagerepo extends JpaRepository<ImageData, Long> {

    // fetch images by category (optional but useful)
    List<ImageData> findByCategory(String category);
}
