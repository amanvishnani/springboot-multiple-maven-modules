package com.amanvishnani.persistence;

import com.amanvishnani.domain.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;


    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel(null, "Marriot", 5, true);
        Hotel ibis = new Hotel(null, "Ibis", 3, true);
        Hotel goldenTulip = new Hotel(null, "Golden Tulip", 3, true);
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldenTulip);
        hotelRepository.saveAll(hotels);
    }
}
