package com.farmers.app.service;

import com.farmers.app.model.Farmer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FarmerService {
    void createFarmer(Farmer farmer);

    void updateFarmer(Farmer farmer);

    void deleteFarmer(Farmer farmer);

    List<Farmer> getAllFarmers();

    Farmer getFarmerById(long id);

}
