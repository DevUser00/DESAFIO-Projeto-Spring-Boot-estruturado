package com.helio.io.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helio.io.dscommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
	
}
