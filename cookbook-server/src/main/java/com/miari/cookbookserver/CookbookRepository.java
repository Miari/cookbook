package com.miari.cookbookserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookbookRepository extends JpaRepository<Recipe, String> {
    Recipe findByid(int id);
}
