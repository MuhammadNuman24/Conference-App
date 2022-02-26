package com.example.crypto.repositories;

import com.example.crypto.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker , Long> {
}
