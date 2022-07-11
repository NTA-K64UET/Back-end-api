package com.aquarius.final1.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aquarius.final1.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // tìm kiếm user theo tên
    Optional<User> findByUsername(String username);
    // check xem user có tồn tại không
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}