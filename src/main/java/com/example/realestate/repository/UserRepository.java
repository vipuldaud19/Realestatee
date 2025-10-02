package com.example.realestate.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.realestate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByUsername(String username);
}
