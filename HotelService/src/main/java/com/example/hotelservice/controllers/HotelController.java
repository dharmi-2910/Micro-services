package com.example.hotelservice.controllers;

import com.example.hotelservice.service.Impl.ServiceImpl;
import com.example.hotelservice.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class HotelController {
    private final ServiceImpl hotelService;

    @PostMapping("/hotels/{hotelId}")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<Optional<Hotel>> createHotel(@PathVariable int hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getLong(hotelId));
    }
    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAll() {
        return ResponseEntity.ok(hotelService.getAll());
    }
}
