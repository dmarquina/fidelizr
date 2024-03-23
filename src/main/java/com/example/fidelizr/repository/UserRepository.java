package com.example.fidelizr.repository;

import com.example.fidelizr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
