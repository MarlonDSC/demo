package com.marlon.paralelos.controller;

import com.marlon.paralelos.model.Image;
import com.marlon.paralelos.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @PostMapping("/upload")
    public Image uploadImage(@RequestBody Image image) {
        return imageRepository.save(image);
    }

    @GetMapping("/search")
    public List<Image> searchImages(@RequestParam String query) {
        return imageRepository.findAll(); // Replace with actual search logic
    }
}
