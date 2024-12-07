package org.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shape2Service {
    private final Shape2Repository shapeRepository;

    public Shape2Service(Shape2Repository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public Shape2 saveShape(Shape2 shape) {
        return shapeRepository.save(shape);
    }

    public List<Shape2> getAllShapes() {
        return shapeRepository.findAll();
    }
}
