package com.example.crypto.repositories;

import com.example.crypto.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session , Long> {
}
