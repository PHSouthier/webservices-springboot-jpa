package com.phs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phs.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
