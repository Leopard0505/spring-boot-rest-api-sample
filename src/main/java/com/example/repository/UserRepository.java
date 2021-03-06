package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ishiis on 16/09/08.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
