package com.api.parking_control.services.impl;

import com.api.parking_control.models.ParkingSpotModel;
import com.api.parking_control.repositories.ParkingSpotRepository;
import com.api.parking_control.services.ParkingSpotService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service(value = "ParkingSpotService")
public class ParkingSpotServiceImpl implements ParkingSpotService {

    final
    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public boolean existsByApartmentAndBlock (String apartment, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public Page<ParkingSpotModel> findAll(Pageable pageable){
        return parkingSpotRepository.findAll(pageable);
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel){
        parkingSpotRepository.delete(parkingSpotModel);
    }
}
