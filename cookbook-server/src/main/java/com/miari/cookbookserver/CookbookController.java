package com.miari.cookbookserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@CrossOrigin

public class CookbookController {
    @Autowired
    private CookbookRepository repository;

    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getRecipes() {
        List<Recipe> recipes = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/recipe/{id}")
    public ResponseEntity<Recipe> getGreetingById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findByid(parseInt(id)));
    }

    @PostMapping("/recipe")
    public ResponseEntity<String> createGreeting(@RequestBody Recipe recipe) {
        repository.save(recipe);
        return ResponseEntity.status(HttpStatus.OK).body("New Recipe added: " + recipe.getName());
    }
}
