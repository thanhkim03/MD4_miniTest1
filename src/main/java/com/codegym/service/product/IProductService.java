package com.codegym.service.product;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByCategory(Category category);

    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByNameContaining(String name);

    Page<Product> findAllByOrderByDateTime(Pageable pageable);

    Iterable<Product> findAllByOrderByPrice();
}
