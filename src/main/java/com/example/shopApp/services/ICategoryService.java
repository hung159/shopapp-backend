package com.example.shopApp.services;

import com.example.shopApp.DTO.CategoryDTO;
import com.example.shopApp.model.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
