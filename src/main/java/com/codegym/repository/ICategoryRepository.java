package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
    Optional<Category> findAllByName(String name);
}
