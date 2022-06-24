package com.miari.cookbookserver;

import javax.persistence.*;

@Entity(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String time;
    private String complexity;

    @Column(columnDefinition = "text")
    private String ingredients;

    @Column(columnDefinition = "text")
    private String description;

    private String image;

    public Recipe() {
    }

    public Recipe(String name, String time, String complexity, String ingredients, String description, String image) {
        this.name = name;
        this.time = time;
        this.complexity = complexity;
        this.ingredients = ingredients;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getComplexity() {
        return complexity;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
