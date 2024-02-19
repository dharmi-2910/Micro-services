package com.example.hotelservice.repository;

import com.example.hotelservice.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

    Optional<Hotel> findById(int id);
}
