package com.example.test.service;

import com.example.test.POJO.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    ResponseEntity<String> addNewCategory(Map<String,String> requestMap );
    ResponseEntity<List<Category>>getAllCategory(String filterValue);
    ResponseEntity<String> updateCategory(Map<String,String> requestMap);
}
