package com.example.test.dao;

import com.example.test.POJO.Product;
import com.example.test.wrapper.ProductWrapper;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    List<ProductWrapper> getAllProduct();
    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status,@Param("id") Integer id);
    List<ProductWrapper>getProductByCategory(@Param("id")Integer id);
    ProductWrapper getProductById(@Param("id") Integer id);
}
