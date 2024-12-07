package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Shape2Repository extends JpaRepository<Shape2, Long> {
}