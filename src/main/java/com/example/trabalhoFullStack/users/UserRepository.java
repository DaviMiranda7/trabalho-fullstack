package com.example.trabalhoFullStack.users;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trabalhoFullStack.users.User;


public interface UserRepository extends JpaRepository<User, Long> {}

