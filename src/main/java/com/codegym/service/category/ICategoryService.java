package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.IGeneralService;

import java.util.Optional;

public interface ICategoryService extends IGeneralService<Category> {
    Optional<Category> findAllByName(String name);
}
