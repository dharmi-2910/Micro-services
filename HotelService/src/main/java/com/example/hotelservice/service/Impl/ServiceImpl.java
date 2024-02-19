package com.example.hotelservice.service.Impl;

import com.example.hotelservice.entities.Hotel;
import com.example.hotelservice.repository.HotelRepository;
import com.example.hotelservice.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel){
//        long hotelId= Long.parseLong(null);
//        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }
    @Override
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getLong(int id) {
        return hotelRepository.findById(id);
    }
}
