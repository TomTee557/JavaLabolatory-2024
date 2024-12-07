package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {
    private final Shape2Service shapeService;

    public ShapeController(Shape2Service shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping
    public List<Shape2> getAllShapes() {
        return shapeService.getAllShapes();
    }

    @PostMapping
    public Shape2 createShape(@RequestBody Shape2 shape) {
        return shapeService.saveShape(shape);
    }
}
