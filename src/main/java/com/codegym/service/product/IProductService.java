package com.codegym.service.product;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface IProductService extends IGeneralService<Product> {

    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findAllByOrderByName();

    Iterable<Product> getTop4();

    Iterable<Product> findAllByCategory(Category category);

    Iterable<Product> findByPriceRange(String price1, String price2);
}
