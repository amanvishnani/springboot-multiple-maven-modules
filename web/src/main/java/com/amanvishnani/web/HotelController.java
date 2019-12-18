package com.amanvishnani.web;

import com.amanvishnani.domain.Hotel;
import com.amanvishnani.persistence.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    private HotelRepository hotelRepository;

    @GetMapping(value = "/hotels")
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}
