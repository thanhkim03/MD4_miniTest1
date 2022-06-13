package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

    Iterable<Product> findAllByOrderByName();

    Iterable<Product> findAllByNameContaining(String name);

    @Query(value = "select * from product where price between ?1 and ?2", nativeQuery = true)
    Iterable<Product> findByPriceRange(String price1, String price2);

    @Query(value = "select * from products order by id desc LIMit 4",nativeQuery = true)
    Iterable<Product> getTop4();

    Iterable<Product> findAllByCategory(Category category);



}
