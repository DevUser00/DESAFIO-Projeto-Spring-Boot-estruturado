package com.helio.io.dscommerce.repositories;

import com.helio.io.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
	
	User findByEmail(String email);
}
