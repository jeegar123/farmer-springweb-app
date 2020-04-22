package com.farmers.app.service;

import com.farmers.app.model.Farmer;
import com.farmers.app.repository.FarmerRespository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRespository farmerRespository;

    public FarmerServiceImpl(FarmerRespository farmerRespository) {
        this.farmerRespository = farmerRespository;
    }

    @Override
    public void createFarmer(Farmer farmer) {
        farmerRespository.save(farmer);
    }

    @Override
    public void updateFarmer(Farmer farmer) {
        farmerRespository.save(farmer);
    }

    @Override
    public void deleteFarmer(Farmer farmer) {
        farmerRespository.delete(farmer);
    }

    @Override
    public List<Farmer> getAllFarmers() {
        return farmerRespository.findAll();
    }

    @Override
    public Farmer getFarmerById(int id) {
        return farmerRespository.getOne(id);
    }
}
